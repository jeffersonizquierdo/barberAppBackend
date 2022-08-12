package com.barberapp.entities;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table (name = "booking ")
public class Booking {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	 private Long  id;
	
	@Column(name="reservation_date")
	private Date reservation_date;
	
	@ManyToOne @JoinColumn (name = "id_barbershop", referencedColumnName = "id")
	private Barbershop barbershop;
	

	@ManyToOne @JoinColumn (name = "id_barber", referencedColumnName = "id")
	private Barber barber;
	

	@ManyToOne @JoinColumn (name = "id_customer", referencedColumnName = "id")
	private Customer customer ;
	
	
	@Column(name="completed")
    private Boolean completed ;


	public Booking() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Booking(Long id, Date reservation_date, Barbershop barbershop, Barber barber, Customer customer,
			Boolean completed) {
		super();
		this.id = id;
		this.reservation_date = reservation_date;
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


	public Date getReservation_date() {
		return reservation_date;
	}


	public void setReservation_date(Date reservation_date) {
		this.reservation_date = reservation_date;
	}


	public Barbershop getBarbershop() {
		return barbershop;
	}


	public void setBarbershop(Barbershop barbershop) {
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
		return "Booking [id=" + id + ", reservation_date=" + reservation_date + ", barbershop=" + barbershop
				+ ", barber=" + barber + ", customer=" + customer + ", completed=" + completed + "]";
	}
	
	
	


	
	

}
