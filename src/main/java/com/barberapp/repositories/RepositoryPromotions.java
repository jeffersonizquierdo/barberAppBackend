package com.barberapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.barberapp.entities.Promotions;



@Repository
public interface RepositoryPromotions extends JpaRepository<Promotions, Long >{
	
}
