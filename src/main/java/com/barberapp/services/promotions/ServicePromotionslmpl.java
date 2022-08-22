package com.barberapp.services.promotions;

import java.util.List; 
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.barberapp.entities.Promotions;
import com.barberapp.repositories.RepositoryPromotions;



@Service
public class ServicePromotionslmpl implements ServicePromotions{

	@Autowired(required = true) private RepositoryPromotions repositoryPromotions;
	
	@Override
	@Transactional(readOnly = true)
	public List<Promotions> findAll() {
		
		return repositoryPromotions.findAll();
	}

	
	@Transactional(readOnly = true)
	public Page<Promotions> findAll(Pageable pageable) {
		
		return repositoryPromotions.findAll(pageable);
	}


	@Transactional(readOnly = true)
	public Optional<Promotions> findById(Long id) {
		
		return repositoryPromotions.findById(id);
	}

	
	public Promotions save(Promotions promotions) {
		
		return repositoryPromotions.save(promotions);
	}


	public void deleteById(Long id) {
		repositoryPromotions.deleteById(id);
		
	}

}
