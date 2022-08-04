package com.barberapp.entities;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customers")
public class Customer  implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY) @Column (name = "id_username")private Long iBbarbershop;
	@Column (name = "email", nullable = false, unique = true) private String email;
	@Column (name = "age") private Date age;
	@Column (name = "gender") private String gender;
	
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Customer(Long iBbarbershop, String email, Date age, String gender) {
		super();
		this.iBbarbershop = iBbarbershop;
		this.email = email;
		this.age = age;
		this.gender = gender;
	}

	public Long getiBbarbershop() {
		return iBbarbershop;
	}


	public void setiBbarbershop(Long iBbarbershop) {
		this.iBbarbershop = iBbarbershop;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public Date getAge() {
		return age;
	}


	public void setAge(Date age) {
		this.age = age;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}



}
