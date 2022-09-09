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
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "publication")
public class Publication implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name = "id_publication")private Long id_publication;
	
	@JsonIgnoreProperties(value={"publications","hibernateLazyInitializer","handler"},allowSetters = true)
	@ManyToOne(fetch = FetchType.LAZY) 
	@JoinColumn (name = "id_barbershop", referencedColumnName = "id" )
	private Barbershop id_barbershop;
	
	
	@JsonIgnoreProperties(value={"publication","hibernateLazyInitializer","handler"},allowSetters = true)
	@ManyToOne(fetch = FetchType.LAZY) 
	@JoinColumn (name = "id_barber", referencedColumnName = "id" )
	private Barber id_barber;

	@Column(name="description")
	private String description;
	
	@Column(name="url")
	private String url;



	public Publication() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Publication(Long id_publication, String description, String url) {
		super();
		this.id_publication = id_publication;
		this.description = description;
		this.url = url;
		
	}

	



	public Barbershop getId_barbershop() {
		return id_barbershop;
	}


	public void setId_barbershop(Barbershop id_barbershop) {
		this.id_barbershop = id_barbershop;
	}


	public Barber getId_barber() {
		return id_barber;
	}


	public void setId_barber(Barber id_barber) {
		this.id_barber = id_barber;
	}


	public Long getId_publication() {
		return id_publication;
	}

	public void setId_publication(Long id_publication) {
		this.id_publication = id_publication;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}




	
}