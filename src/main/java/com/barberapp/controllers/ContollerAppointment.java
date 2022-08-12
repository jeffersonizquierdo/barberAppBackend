package com.barberapp.controllers;

import com.barberapp.entities.Appointment;

import com.barberapp.servicies.appointment.ServiceAppointment;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.NestedRuntimeException;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:4200/")
@RestController
@RequestMapping("appointment")
public class ContollerAppointment {
	
	@Autowired
	private ServiceAppointment appointmentService;
	
	 /////////////////// APPOINTMENT REGISTRAR   http://localhost:8080/appointment/save ////////////////
	@PostMapping("/save")
	public ResponseEntity<?> create (@RequestBody Appointment appointment){
		
		Appointment newApppointment = null;
		Map<String, Object> response = new HashMap<>();
		
		try {
			
			newApppointment =appointmentService.save(appointment);
			
		} catch (DataAccessException e) {
			
			response.put("Mensaje", "Error al hacer insert en la base de datos");
			response.put("Error", e.getMessage().concat(": ").concat(((NestedRuntimeException) e).getMostSpecificCause().getMessage()));
			return new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		response.put("menssaje","El usuario barbero ha sido creado con exito");
		response.put("Barbero: ", newApppointment);
		return new ResponseEntity<Map<String, Object >>(response, HttpStatus.CREATED);
		
	}
	
		/////////////////// CONSULT APPOINTMENT   http://localhost:8080/appointment/consult/ID ////////////////
		@GetMapping("/consult/{id}")
		public ResponseEntity<?> consultAppointmentId(@PathVariable(value = "id") Long id){
		
			Optional<Appointment> appoitment = null;
			Map<String, Object> response = new HashMap<>();
			
		try {
			appoitment =appointmentService.findById(id);
		
		} catch (DataAccessException e) {
			response.put("Mensaje", "Error al hacer consulta en la base de datos");
			response.put("Error", e.getMessage().concat(": ").concat(e.getMostSpecificCause().getMessage()));
			return new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
			if (!appoitment.isPresent()) {
			response.put("Mensaje", "EL barbero con el ID ".concat(id.toString().concat(" no existe en la base de datos")));
			return new ResponseEntity<Map<String, Object>>(response, HttpStatus.NOT_FOUND);
			}
			
			return ResponseEntity.ok(appoitment);
		}
			
	/////////////////// UPDATE APPOINTMENT   http://localhost:8080/appointment/update/ID ////////////////
			
	@PutMapping("/update/{id}")
	public ResponseEntity<?>update(@RequestBody Appointment newAppointment,@PathVariable (value = "id")Long idAppoitment ){
	
		Optional<Appointment> currentAppointment = appointmentService.findById(idAppoitment);
		Optional<Appointment> ApointmentUpdate = null;
		
		Map<String, Object> response = new HashMap<>();
		
		if(!currentAppointment.isPresent()) {
			response.put("Mensaje", "No se pudo editar el barbero con el ID ".concat(idAppoitment.toString().concat(" no existe en la base de datos")));
			return new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	
	try {
	
		
	
		
		currentAppointment.get().setAcceptatance_status(newAppointment.getAcceptatance_status());
		currentAppointment.get().setCompleted(newAppointment.getCompleted());
		currentAppointment.get().setReservation_date(newAppointment.getReservation_date());
		
		
		ApointmentUpdate = Optional.ofNullable(appointmentService.save(currentAppointment.get()));
		
	} catch (DataAccessException e) {
		
		response.put("Mensaje", "Error al actualizar el barbero en la base de datos");
		response.put("Error", e.getMessage().concat(": ").concat(e.getMostSpecificCause().getMessage()));
		return new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
		response.put("Mensaje", "El barbero ha sido actualizado");
		response.put("Barbero: ",  ApointmentUpdate );
		
		return new ResponseEntity<Map<String, Object>>(response, HttpStatus.CREATED);
	}
	
	
	/////////////////// DELETE APPOINTMENT   http://localhost:8080/appointment/delete/ID ////////////////
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<?> deleteAppointmen(@PathVariable(value = "id")  Long id){
		
		Map<String, Object> response = new HashMap<>();
		
		try {
			
			appointmentService.deleteById(id);
			
		} catch (DataAccessException e) {

			response.put("Mensaje", "Error al eliminar el barbero en la base de datos");
			response.put("Error", e.getMessage().concat(": ").concat(e.getMostSpecificCause().getMessage()));
			return new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		response.put("Mensaje","El barbero se ha eliminado con exito! ");
		return new ResponseEntity<Map<String, Object>>(response, HttpStatus.OK);
	}
	
	/////////////////// CONSULT ALL APOINTMENT   http://localhost:8080/appointment/consultall ///////////////	
	@GetMapping("/consultall")
	public  List<Appointment> consultAllUsers(){
		
		
		List<Appointment> apointment = StreamSupport
				.stream(appointmentService.findAll().spliterator(), false)
				.collect(Collectors.toList());
		
		return  apointment;
	}

	
	
	
			
	


	
	
	
	
	
	
	

}
	
	
	

