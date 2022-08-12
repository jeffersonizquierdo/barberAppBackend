package com.barberapp.controllers;

import java.util.List; 
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.barberapp.entities.Booking;
import com.barberapp.servicies.booking.ServiceBooking;

@RestController
@RequestMapping("booking")
public class ControllerBooking {
	
	@Autowired(required = true) private ServiceBooking serviceBooking;
	
	@GetMapping("hola")
	public String saludo() {
		
		return "saludo desde controlador Booking";
	}
	
	
	 /////////////////// BOOKING REGISTRAR   http://localhost:8080/booking/save ////////////////
	@PostMapping("/save")
	public ResponseEntity<Booking> createBooking (@RequestBody Booking booking){
		System.out.println(booking.toString()+"este es el objeto obtenido");
		return ResponseEntity.status(HttpStatus.CREATED).body(serviceBooking.save(booking));
	}
	
	/////////////////// CONSULT BOOKING   http://localhost:8080/booking/consult/ID ////////////////
	@GetMapping("/consult/{id}")
	public ResponseEntity<Optional<Booking>> consultBookingId (@PathVariable(value = "id") Long id){
		
		Optional<Booking> booking = serviceBooking.findById(id);
		
		if (booking.isPresent()) {
			return ResponseEntity.ok(booking);
		} else {
			return ResponseEntity.notFound().build();
		}
	}
	
	/////////////////// UPDATE BOOKING   http://localhost:8080/booking/update/ID ////////////////
	@PutMapping("/update/{id}")
	public ResponseEntity<Booking> updateBooking (@RequestBody Booking newbBooking, @PathVariable(value = "id") Long id){
	
		Optional<Booking> booking = serviceBooking.findById(id);
		if (booking.isPresent()) {
			
<<<<<<< HEAD
			

=======
	
>>>>>>> dda13c9490b8d90e24bbd864308407d67e6a31f8
			
			return ResponseEntity.status(HttpStatus.CREATED).body(serviceBooking.save(booking.get()));
		
		} else {
			return ResponseEntity.notFound().build();
		}
	
	}
	
	/////////////////// DELETE BOOKING   http://localhost:8080/booking/delete/ID ////////////////
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Booking> deleteBooking(@PathVariable(value = "id")  Long id){
		
		
		if(serviceBooking.findById(id).isPresent()) {
			
			serviceBooking.deleteById(id);
			return ResponseEntity.ok().build();
			
		} else {
			
			return ResponseEntity.notFound().build();
		}		
	}
	

	/////////////////// CONSULT ALL USER   http://localhost:8080/booking/consultall ///////////////	
	@GetMapping("/consultall")
	public  List<Booking> consultAllBooking(){
		
		
		List<Booking> booking = StreamSupport
				.stream(serviceBooking.findAll().spliterator(), false)
				.collect(Collectors.toList());
		
		return booking;
	}
	
	
	
		
		
		


	
	

}
