package com.barberapp.servicies.images;

import org.springframework.data.domain.Pageable;

import java.util.Optional;

import org.springframework.data.domain.Page;

import com.barberapp.entities.Images;

public interface ServiceImages {
	public Iterable<Images> findAll();
	
	public Page<Images> findAll(Pageable pageable);
	
	public Optional<Images> findById(Long id);
	
	public Images save(Images images);
	
	public void deleteById(Long id);
}
