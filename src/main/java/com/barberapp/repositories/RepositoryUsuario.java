package com.barberapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.barberapp.entities.Usuario;


@Repository
public interface RepositoryUsuario extends JpaRepository<Usuario, Long>{

}
