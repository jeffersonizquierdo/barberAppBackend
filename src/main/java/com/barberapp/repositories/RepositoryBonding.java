package com.barberapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.barberapp.entities.Bonding;

@Repository
public interface RepositoryBonding extends JpaRepository<Bonding, Long>{

}
