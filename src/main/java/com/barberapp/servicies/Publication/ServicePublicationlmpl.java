package com.barberapp.servicies.Publication;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.barberapp.entities.Publication;
import com.barberapp.repositories.RepositoryPublication;
@Service
public class ServicePublicationlmpl implements ServicePublication {

	@Autowired(required = true)
	private RepositoryPublication repossitoryPublication;
	
	@Override
	@Transactional(readOnly = true)
	public List<Publication> findAll() {
	
		return repossitoryPublication.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Page<Publication> findAll(Pageable pageable) {
		
		return repossitoryPublication.findAll(pageable);
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<Publication> findById(Long id) {

		return repossitoryPublication.findById(id);
	}

	@Override
	public Publication save(Publication publication) {
	
		return repossitoryPublication.save(publication) ;
	}

	@Override
	public void deleteById(Long id) {
			repossitoryPublication.deleteById(id);
		
	}

}


