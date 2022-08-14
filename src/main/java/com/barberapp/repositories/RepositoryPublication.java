package com.barberapp.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.barberapp.entities.Publication;

@Repository
public interface RepositoryPublication extends JpaRepository<Publication, Long> {

}