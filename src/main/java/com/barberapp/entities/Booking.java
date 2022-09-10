package com.barberapp.entities;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table (name = "booking ")
public class Booking implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Long  id;

	@Column(name="reservationDate")
	private Date reservationDate;
	
	@Column(name="barbershop")
	private int barbershop;
	
	@JsonIgnoreProperties(value={"bookingsBarber","hibernateLazyInitializer","handler"},allowSetters = true)
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn (name = "barber_id")
	private Barber barber;
	
	@JsonIgnoreProperties(value={"bookingsCustomer","hibernateLazyInitializer","handler"},allowSetters = true)
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn (name = "customer_id")
	private Customer customer;
	
	
	@Column(name="completed")
    private Boolean completed ;



	public Booking() {
		super();
	}



	public Booking(Long id, Date reservationDate, int barbershop, Barber barber, Customer customer, Boolean completed) {
		super();
		this.id = id;
		this.reservationDate = reservationDate;
		this.barbershop = barbershop;
		this.barber = barber;
		this.customer = customer;
		this.completed = completed;
	}



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public Date getReservationDate() {
		return reservationDate;
	}



	public void setReservationDate(Date reservationDate) {
		this.reservationDate = reservationDate;
	}



	public int getBarbershop() {
		return barbershop;
	}



	public void setBarbershop(int barbershop) {
		this.barbershop = barbershop;
	}



	public Barber getBarber() {
		return barber;
	}



	public void setBarber(Barber barber) {
		this.barber = barber;
	}



	public Customer getCustomer() {
		return customer;
	}



	public void setCustomer(Customer customer) {
		this.customer = customer;
	}



	public Boolean getCompleted() {
		return completed;
	}



	public void setCompleted(Boolean completed) {
		this.completed = completed;
	}



	@Override
	public String toString() {
		return "Booking [id=" + id + ", reservationDate=" + reservationDate + ", barbershop=" + barbershop + ", barber="
				+ barber + ", customer=" + customer + ", completed=" + completed + "]";
	}



	

}
