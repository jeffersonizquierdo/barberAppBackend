package com.barberapp.services.usuario;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import com.barberapp.entities.Usuario;

public interface ServiceUsuario {
	
	
	public Iterable<Usuario> findAll();
	
	public Page<Usuario>findAll(Pageable pageable);
	
	public Optional<Usuario>findById(Long  id);
	
	public Usuario save(Usuario usaurio);
	
	public void deletById(Long  id );

}
