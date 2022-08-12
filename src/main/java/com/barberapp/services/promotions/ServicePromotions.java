package com.barberapp.services.promotions;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.barberapp.entities.Promotions;

public interface ServicePromotions {

public List<Promotions> findAll();
	
	public Page<Promotions> findAll(Pageable pageable);
	
	public Optional<Promotions> findById(Long id);
	
	public Promotions save (Promotions promotions);
	
	public void deleteById (Long id);
}
