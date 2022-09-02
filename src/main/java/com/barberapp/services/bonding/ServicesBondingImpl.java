package com.barberapp.services.bonding;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.barberapp.entities.Bonding;
import com.barberapp.repositories.RepositoryBonding;

@Service
public class ServicesBondingImpl implements ServiceBonding{
	
	
	@Autowired(required = true)
	private RepositoryBonding repositoryBonding;

	
	
	@Override
	@Transactional(readOnly = true)
	public Iterable<Bonding> findAll() {
		return repositoryBonding.findAll();
	}
	

	@Override
	@Transactional(readOnly = true)
	public Page<Bonding> findAll(Pageable pageable) {
		return repositoryBonding.findAll(pageable);
	}

	
	@Override
	@Transactional(readOnly = true)
	public Optional<Bonding> findById(Long id_bonding) {
		return repositoryBonding.findById(id_bonding);
	}

	@Override
	public Bonding save(Bonding bonding) {
		return repositoryBonding.save(bonding);
	}

	@Override
	public void deleteById(Long id_bonding) {
		repositoryBonding.deleteById(id_bonding);
		
	}

}
