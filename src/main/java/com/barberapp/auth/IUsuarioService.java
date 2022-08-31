package com.barberapp.auth;

import com.barberapp.entities.Usuario;

public interface IUsuarioService {

	public Usuario findByUsername(String username);
}
