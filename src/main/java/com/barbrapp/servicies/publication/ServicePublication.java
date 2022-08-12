package com.barbrapp.servicies.publication;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.barberapp.entities.Customer;
import com.barberapp.entities.Publication;

public interface ServicePublication {
	

	public List<Publication> findAll();
	
	public Page<Publication> findAll(Pageable pageable);
	
	public Optional<Publication> findById (Long id_publication);
	
	public  Publication save (Publication publication);
	
	public void deleteById(Long id_publication);

}