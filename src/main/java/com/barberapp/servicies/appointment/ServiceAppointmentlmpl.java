package com.barberapp.servicies.appointment;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;

import com.barberapp.entities.Appointment;
import com.barberapp.repositories.RepositoryAppointment;


public class ServiceAppointmentlmpl implements ServiceAppointment{
	
	@Autowired(required = true) private RepositoryAppointment repositoryAppointment;

	@Override
	@Transactional(readOnly = true)
	public List<Appointment> findAll() {
		
		return repositoryAppointment.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Page<Appointment> findAll(Pageable pageable) {
		return repositoryAppointment.findAll(pageable);
	}


	@Override
	public Optional<Appointment> findById(Long id_appointment) {
		
		return repositoryAppointment.findById(id_appointment);
	}
	
	@Override
	public Appointment save(Appointment appointment) {
		return repositoryAppointment.save(appointment);
	}

	@Override
	public void deleteById(Long id_appointment) {
		repositoryAppointment.deleteById(id_appointment);
		
	}



}
