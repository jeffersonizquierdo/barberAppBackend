package com.barberapp.servicies.booking;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.barberapp.entities.Booking;
import com.barberapp.repositories.RepositoryBooking;


@Service
public class ServiceBookinglmpl implements ServiceBooking{
	
	@Autowired(required = true) private RepositoryBooking repositoryBooking;

	@Override
	@Transactional(readOnly = true)
	public Iterable<Booking> findAll() {
		return repositoryBooking.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Page<Booking> findAll(Pageable pageable) {
		return repositoryBooking.findAll(pageable);
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<Booking> findById(Long id_booking) {
		return repositoryBooking.findById(id_booking);
	}

	@Override
	public Booking save(Booking booking) {
		return repositoryBooking.save(booking);
	}

	@Override
	public void deleteById(Long id_booking) {
		 repositoryBooking.deleteById(id_booking);
		
	}

}
