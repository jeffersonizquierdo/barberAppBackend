package com.barberapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.barberapp.entities.Appointment;


@Repository
public interface RepositoryAppointment extends  JpaRepository<Appointment, Long >{

}
