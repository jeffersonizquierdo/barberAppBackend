package com.barberapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.barberapp.entities.Booking;

@Repository
public interface RepositoryBooking extends JpaRepository<Booking, Long>{

}
