package com.barberapp.entities;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table (name = "booking ")
public class Booking {
	
	private static final long serialVersionUID = 1L;

	
	
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_booking")
	 private Long  id_booking;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="id_barber")
	private Barber id_barber;
	
	@Column(name="reservation_date")
	private Date reservation_date;
	
	@Column(name="id_barbershop")
	private Long id_barbershop;
	
	@Column(name="id_customer")
	private Long id_customer ;
	
	
	
	
	
	
	
	@Column(name="acceptatance_status")
	private  Boolean   acceptatance_status ;
	
	@Column(name="completed")
    private Boolean completed ;
	
	

	

	
	

}
