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
@Table(name = "barber")
public class Barber implements Serializable{
	
	
	private static final long serialVersionUID = 1L;

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY) @Column (name = "id_username")private Long id;
	@Column (name = "email", nullable = false, unique = true) private String email;
	@Column(name="age")private Date  age;
	@Column(name="description")private String description;
	@Column(name="gender")private String gender;
	@Column(name="qualification")private double qualification;
	@Column(name="id_catalogue")private int   id_catalogue;

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getAge() {
		return age;
	}

	public void setAge(Date age) {
		this.age = age;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public double getQualification() {
		return qualification;
	}

	public void setQualification(double qualification) {
		this.qualification = qualification;
	}

	public int getId_catalogue() {
		return id_catalogue;
	}

	public void setId_catalogue(int id_catalogue) {
		this.id_catalogue = id_catalogue;
	}
	
	
}
