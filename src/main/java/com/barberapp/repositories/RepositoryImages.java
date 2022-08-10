package com.barberapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository; 
import org.springframework.stereotype.Repository;

import com.barberapp.entities.Images;

@Repository
public interface RepositoryImages extends JpaRepository<Images, Long>{

}
