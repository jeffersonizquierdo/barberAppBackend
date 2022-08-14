package com.barberapp.services.booking;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.barberapp.entities.Booking;



public interface ServiceBooking {
	
	
	public Iterable<Booking> findAll();
	
	public Page<Booking> findAll(Pageable pageable);
	
	public Optional<Booking> findById(Long id_booking);
	
	public Booking save (Booking booking);
	
	public void deleteById (Long id_booking);

}
