package com.barberapp.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "bindings")
public class Bonding implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name = "id")
	private Long id;
	

	@JsonIgnoreProperties(value={"bondings","hibernateLazyInitializer","handler"},allowSetters = true)

	@OneToOne(fetch = FetchType.LAZY) 
	@JoinColumn (name = "barbershop", referencedColumnName = "id" )
	private Barbershop barbershop;	
	

	@JsonIgnoreProperties(value={"bondings","hibernateLazyInitializer","handler"},allowSetters = true)

	@OneToOne(fetch = FetchType.LAZY) 
	@JoinColumn (name = "barber", referencedColumnName = "id" )
	private Barber barber;
	
	
	
	private Boolean acceptance;



	public Bonding() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Bonding(Long id, Barbershop barbershop, Barber barber, Boolean acceptance) {
		super();
		this.id = id;
		this.barbershop = barbershop;
		this.barber = barber;
		this.acceptance = acceptance;
	}



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
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



	public Boolean getAcceptance() {
		return acceptance;
	}




	public void setAcceptance(Boolean acceptance) {
		this.acceptance = acceptance;
	} 
	
}
