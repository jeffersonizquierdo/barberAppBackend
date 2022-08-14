package com.barberapp.auth;


import java.util.List;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.barberapp.entities.Usuario;

@Service
public class UsuarioService implements UserDetailsService{

	private Logger logger = LoggerFactory.getLogger(UsuarioService.class);
	
	@Autowired
	private IUsuarioDao usuarioDao;
	
	@Override
	@Transactional(readOnly = true)
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		Usuario usuairo = usuarioDao.findByUsername(username);
		
		
		if (usuairo == null) {
			
			logger.error("Error en el login: No existe el usuario " + username + " en el sistema");
			throw new UsernameNotFoundException("Error en el login: No existe el usuario '"+ username + "' en el sistema");
		}
		List<GrantedAuthority> authorities = usuairo.getRoles().stream()
				.map(role -> new SimpleGrantedAuthority(role.getName()))
				.peek(authority -> logger.info("Role " + authority.getAuthority()))
				.collect(Collectors.toList());
		
		return new User(usuairo.getUsername(), usuairo.getPassword(), usuairo.getEnabled(), true, true, true, authorities);
	}

}
