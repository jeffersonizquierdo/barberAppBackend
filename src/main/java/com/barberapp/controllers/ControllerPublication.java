package com.barberapp.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.barberapp.entities.Publication;

import com.barbrapp.servicies.publication.ServicePublication;

@CrossOrigin(origins = "http://localhost:4200/")
@RestController
@RequestMapping("publication")
public class ControllerPublication {
	@Autowired
	private ServicePublication servicePublication;
	
	

}
