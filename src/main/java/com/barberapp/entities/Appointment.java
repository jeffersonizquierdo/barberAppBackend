package com.barberapp.entities;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import javax.persistence.*;
import javax.persistence.Table;





@Entity
@Table (name = "appointment")
public class Appointment {
	
	private static final long serialVersionUID = 1L;
	
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name = "id_appointment")private Long id;
	

	@ManyToOne(cascade  = {CascadeType.ALL})
	@JoinColumn (name= "id_barbershop", referencedColumnName = "id_username")
	private Barbershop id_barbershop;
    
	
	@Column(name=" reservation_date")
	private Date reservation_date;
    
	@Column(name="	acceptatance_status ")
	private Boolean acceptatance_status ;
	

	@Column(name=" completed ")
	private Boolean  completed ;

   
	

}
