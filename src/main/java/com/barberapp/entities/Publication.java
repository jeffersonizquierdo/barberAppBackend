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

import org.springframework.web.bind.annotation.CrossOrigin;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@CrossOrigin(origins = "http://localhost:4200/")
@Entity
@Table(name="Publication")
public class Publication implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_publication;
	
	@JsonIgnoreProperties(value={"publication","hibernateLazyInitializer","handler"},allowSetters = true)
	@ManyToOne(fetch = FetchType.LAZY) 
	@JoinColumn (name = "Barbershop_id") 
	//@JoinColumn (name = "barbershop_id", referencedColumnName = "id")
	private Barbershop owner;
	
	@JsonIgnoreProperties(value={"publication","hibernateLazyInitializer","handler"},allowSetters = true)
	@ManyToOne(fetch = FetchType.LAZY) 
	@JoinColumn (name = "barber_id") 
	//@JoinColumn (name = "barbershop_id", referencedColumnName = "id")
	private Barber owner_barber;
	
	
	
	@Column(name = "descripcion")
	private String descripcion;
	
	@Column(name = "url")
	private String url;

	public Publication() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public Publication(Long id_publication, Barbershop owner, Barber owner_barber, String descripcion, String url) {
		super();
		this.id_publication = id_publication;
		this.owner = owner;
		this.owner_barber = owner_barber;
		this.descripcion = descripcion;
		this.url = url;
	}



	public Long getId_publication() {
		return id_publication;
	}

	public void setId_publication(Long id_publication) {
		this.id_publication = id_publication;
	}

	public Barbershop getOwner() {
		return owner;
	}

	public void setOwner(Barbershop owner) {
		this.owner = owner;
	}



	public Barber getOwner_barber() {
		return owner_barber;
	}



	public void setOwner_barber(Barber owner_barber) {
		this.owner_barber = owner_barber;
	}



	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
		return "Publication [id_publication=" + id_publication + ", owner=" + owner + ", owner_barber=" + owner_barber
				+ ", descripcion=" + descripcion + ", url=" + url + "]";
	}
	
	
	
	
	

<<<<<<< HEAD
	
	
	
	
}
=======
}
>>>>>>> main
