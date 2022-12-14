package com.barberapp.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity
@Table(name="Promotions")
public class Promotions implements Serializable{
	
	private static final long serialVersionUID = -1965670047101583838L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name = "id")
	private Long id;
	
	@Column(length = 30)
	private String name;
	
	@Column(length = 200)
	private String url;

	@Column(length = 100)
	private String description;
	

	@JsonIgnoreProperties(value={"promotion","hibernateLazyInitializer","handler"},allowSetters = true)
	@OneToOne(fetch = FetchType.LAZY) 
	@JoinColumn (name = "owner", referencedColumnName = "id" )
	private Barbershop owner;


	public Promotions() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Promotions(Long id, String name, String url, String description, Barbershop owner) {
		super();
		this.id = id;
		this.name = name;
		this.url = url;
		this.description = description;
		this.owner = owner;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Barbershop getOwner() {
		return owner;
	}

	public void setOwner(Barbershop owner) {
		this.owner = owner;
	}

	
	

	
}
