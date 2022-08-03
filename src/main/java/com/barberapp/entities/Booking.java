package com.barberapp.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "booking ")
public class Booking {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_booking")
	 private Long  id_booking;
	
	
	@Column(name="reservation_date")
	private String reservation_date;
	
	@Column(name="id_barbershop")
	private Long Inid_barbershop;
	
	@Column(name="id_customer")
	private Long id_customer ;
	
	@Column(name="acceptatance_status")
	private  Boolean   acceptatance_status ;
	
	@Column(name="completed")
    private Boolean completed ;

	public Long getId_booking() {
		return id_booking;
	}

	public void setId_booking(Long id_booking) {
		this.id_booking = id_booking;
	}

	public String getReservation_date() {
		return reservation_date;
	}

	public void setReservation_date(String reservation_date) {
		this.reservation_date = reservation_date;
	}

	public Long getInid_barbershop() {
		return Inid_barbershop;
	}

	public void setInid_barbershop(Long inid_barbershop) {
		Inid_barbershop = inid_barbershop;
	}

	public Long getId_customer() {
		return id_customer;
	}

	public void setId_customer(Long id_customer) {
		this.id_customer = id_customer;
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
