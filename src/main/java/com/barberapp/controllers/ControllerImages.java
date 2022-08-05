package com.barberapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.barberapp.entities.Images;
import com.barberapp.servicies.images.ServiceImages;

@RestController
@RequestMapping("/api/images")
public class ControllerImages {

	@Autowired
	private ServiceImages serviceImages;

	// Create a new Image
	@PostMapping
	public ResponseEntity<?> create(@RequestBody Images images) {
		return  ResponseEntity.status(HttpStatus.CREATED).body(serviceImages.save(images));
	}

}
