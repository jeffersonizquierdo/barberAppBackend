package com.barberapp.servicies.appointment;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.barberapp.entities.Appointment;



public interface ServiceAppointment {
	
	
	public List<Appointment> findAll();
	
	public Page<Appointment> findAll(Pageable pageable);
	
	public Optional<Appointment> findById (Long id_appointment);
	
	public Appointment save (Appointment appointment);
	
	public void deleteById(Long id_appointment);
}
