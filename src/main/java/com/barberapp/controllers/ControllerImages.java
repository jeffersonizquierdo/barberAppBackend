package com.barberapp.controllers;

import java.util.Optional;

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

import com.barberapp.entities.Barbershop;
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
		return ResponseEntity.status(HttpStatus.CREATED).body(serviceImages.save(images));
	}

	// read an image
	@GetMapping("/{id}")
	public ResponseEntity<?> read(@PathVariable(value = "id") Long ImagesId) {
		Optional<Images> oImages = serviceImages.findById(ImagesId);
		if (!oImages.isPresent()) {
			return ResponseEntity.notFound().build();
		}

		return ResponseEntity.ok(oImages);
	}

	// update an image
	@PutMapping("/{id}")
	public ResponseEntity<?> update(@RequestBody Images imagesDetails, @PathVariable(value = "id") Long ImagesId) {
		Optional<Images> images = serviceImages.findById(ImagesId);
		if (!images.isPresent()) {
			return ResponseEntity.notFound().build();
		}
		images.get().setName(imagesDetails.getName());
		images.get().setId(imagesDetails.getId());
		images.get().setDescription(imagesDetails.getDescription());
		images.get().setUrl(imagesDetails.getUrl());

		return ResponseEntity.status(HttpStatus.CREATED).body(serviceImages.save(images.get()));
	}

	// delete an image
	@DeleteMapping("{/id")
	public ResponseEntity<?> delete (@PathVariable(value = "id") Long ImagesId){
		Optional<Images> images = serviceImages.findById(ImagesId);
		
		if (images.isPresent()) {
			
			serviceImages.deleteById(ImagesId);
			return ResponseEntity.ok().build();
		} else {
			
			return ResponseEntity.notFound().build();
		}		}
}
