package com.barberapp.services.cuts;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.barberapp.entities.Cuts;



public interface ServiceCuts {
	
	public List<Cuts> findAll();
	
	public Page<Cuts> findAll(Pageable pageable);
	
	public Optional<Cuts> findById(Long id);
	
	public Cuts save (Cuts cuts);
	
	public void deleteById (Long id);
}
