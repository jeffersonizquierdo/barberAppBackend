package com.barberapp.services.bonding;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.barberapp.entities.Bonding;


public interface ServiceBonding {
	
	
	public Iterable<Bonding> findAll();
	
	public Page<Bonding> findAll(Pageable pageable);
	
	public Optional<Bonding> findById(Long id_bonding);
	
	public Bonding save (Bonding bonding);
	
	public void deleteById (Long id_bonding);

}
