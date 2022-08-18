package com.barberapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.barberapp.entities.Cuts;

@Repository
public interface RepositoryCuts extends JpaRepository<Cuts, Long> {

}
