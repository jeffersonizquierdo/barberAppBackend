package com.barberapp.services.images;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.barberapp.entities.Images;
import com.barberapp.repositories.RepositoryImages;

@Service
public class ServiceImagesImpl implements ServiceImages{
	
	@Autowired(required=true)
	private RepositoryImages repositoryImages;
	
	@Override
	@Transactional(readOnly = true)
	public Iterable<Images> findAll() {
		return repositoryImages.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Page<Images> findAll(Pageable pageable) {
		
		return repositoryImages.findAll(pageable);
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<Images> findById(Long id) {
		return repositoryImages.findById(id);
	}

	@Override
	@Transactional
	public Images save(Images images) {
		return repositoryImages.save(images);
	}

	@Override
	public void deleteById(Long id) {
		repositoryImages.deleteById(id);
	}

}
