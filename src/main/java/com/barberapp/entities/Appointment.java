package com.barberapp.entities;

import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import javax.persistence.*;
import javax.persistence.Table;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;





@Entity
@Table (name = "appointment")
public class Appointment {
	
	private static final long serialVersionUID = 1L;
	
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name = "id_appointment")private Long id;
	

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="id_customer")
	private Customer id_customer;
	
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="id_barber")
	private Barber id_barber;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="id_barbershop")
	private Barbershop id_barbershop;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="id_booking")
	private Booking id_booking;
	
	@Column(name=" reservation_date")
	private Date reservation_date;
    
	@Column(name="	acceptatance_status ")
	private Boolean acceptatance_status ;
	

	@Column(name=" completed ")
	private Boolean  completed ;


	


	public Appointment() {
		super();
		// TODO Auto-generated constructor stub
	}





	public Appointment(Long id, Customer id_customer, Barber id_barber, Barbershop id_barbershop, Booking id_booking,
			Date reservation_date, Boolean acceptatance_status, Boolean completed) {
		super();
		this.id = id;
		this.id_customer = id_customer;
		this.id_barber = id_barber;
		this.id_barbershop = id_barbershop;
		this.id_booking = id_booking;
		this.reservation_date = reservation_date;
		this.acceptatance_status = acceptatance_status;
		this.completed = completed;
	}





	public Long getId() {
		return id;
	}





	public void setId(Long id) {
		this.id = id;
	}





	public Customer getId_customer() {
		return id_customer;
	}





	public void setId_customer(Customer id_customer) {
		this.id_customer = id_customer;
	}





	public Barber getId_barber() {
		return id_barber;
	}





	public void setId_barber(Barber id_barber) {
		this.id_barber = id_barber;
	}





	public Barbershop getId_barbershop() {
		return id_barbershop;
	}





	public void setId_barbershop(Barbershop id_barbershop) {
		this.id_barbershop = id_barbershop;
	}





	public Booking getId_booking() {
		return id_booking;
	}





	public void setId_booking(Booking id_booking) {
		this.id_booking = id_booking;
	}





	public Date getReservation_date() {
		return reservation_date;
	}





	public void setReservation_date(Date reservation_date) {
		this.reservation_date = reservation_date;
	}





	public Boolean getAcceptatance_status() {
		return acceptatance_status;
	}





	public void setAcceptatance_status(Boolean acceptatance_status) {
		this.acceptatance_status = acceptatance_status;
	}





	public Boolean getCompleted() {
		return completed;
	}





	public void setCompleted(Boolean completed) {
		this.completed = completed;
	}


	
}
