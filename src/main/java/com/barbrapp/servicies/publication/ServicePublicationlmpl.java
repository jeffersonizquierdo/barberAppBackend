package com.barbrapp.servicies.publication;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.barberapp.entities.Customer;
import com.barberapp.entities.Publication;

import com.barberapp.repositories.RepositoryPublication;

@Service
public class ServicePublicationlmpl implements ServicePublication {
	
	@Autowired(required = true) private RepositoryPublication repositoryPublication;

	@Override
	@Transactional(readOnly = true)
	public List<Publication> findAll() {
	
		return repositoryPublication.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Page<Publication> findAll(Pageable pageable) {
		return repositoryPublication.findAll(pageable);
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<Publication> findById(Long id_publication) {
		return repositoryPublication.findById(id_publication);
	}
	@Override
	public Publication save(Publication publication) {
		return repositoryPublication.save( publication);
	}

	@Override 
	public void deleteById(Long id_publication) {
		repositoryPublication.deleteById(id_publication);
		
	}

	



}
