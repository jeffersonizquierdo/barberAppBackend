package com.barberapp.entities;

import java.io.Serializable;  

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;

@Entity
@Table (name = "barbershops")
public class Barbershop implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY) @Column (name = "id_username")private Long iBbarbershop;
	@Column (name = "email", nullable = false, unique = true) private String email;
	@Column (name = "description") private String description;
	@Column (name = "location") private String location;
	@Column (name = "qualification") private Double qualification;
	
	
	public Barbershop() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Barbershop(Long iBbarbershop, String email, String description, String location, Double qualification) {
		super();
		this.iBbarbershop = iBbarbershop;
		this.email = email;
		this.description = description;
		this.location = location;
		this.qualification = qualification;
	}
	

	public String getEmail() {
		return email;
	}
	

	public void setEmail(String email) {
		this.email = email;
	}
	

	public Long getiBbarbershop() {
		return iBbarbershop;
	}



	public void setiBbarbershop(Long iBbarbershop) {
		this.iBbarbershop = iBbarbershop;
	}



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}



	public String getLocation() {
		return location;
	}



	public void setLocation(String location) {
		this.location = location;
	}



	public Double getQualification() {
		return qualification;
	}



	public void setQualification(Double qualification) {
		this.qualification = qualification;
	}



	public static long getSerialversionuid() {
		return serialVersionUID;
	}



	@Override
	public String toString() {
		return "Barbershop [iBbarbershop=" + iBbarbershop + ", description=" + description + ", location=" + location
				+ ", qualification=" + qualification + "]";
	}
	
	
	

}
