package com.barberapp.services.cuts;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.barberapp.entities.Cuts;
import com.barberapp.repositories.RepositoryCuts;



@Service
public class Servicelmpl  implements ServiceCuts {

	@Autowired(required = true)
	private RepositoryCuts repositorycuts;
	
	@Override
	@Transactional(readOnly = true)
	public List<Cuts> findAll() {

		return repositorycuts.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Page<Cuts> findAll(Pageable pageable) {
		
		return repositorycuts.findAll(pageable);
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<Cuts> findById(Long id) {
		
		return repositorycuts.findById(id);
	}

	@Override
	public Cuts save(Cuts cuts) {
		
		return repositorycuts.save(cuts);
	}

	@Override
	public void deleteById(Long id) {
		repositorycuts.deleteById(id);
		
	}

}
