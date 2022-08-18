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
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "cuts")
public class Cuts  implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY) @Column (name = "id")
	private Long id;
	
	@Column (name = "url")
	private String url;
	
	@Column (name = "description")
	private String description;
	
	@JsonIgnoreProperties(value={"cuts","hibernateLazyInitializer","handler"},allowSetters = true)
	@ManyToOne(fetch = FetchType.LAZY) 
	@JoinColumn (name = "id_barbershop", referencedColumnName = "id" )
	private Barbershop id_barbershop;
	
	
	@JsonIgnoreProperties(value={"cuts","hibernateLazyInitializer","handler"},allowSetters = true)
	@ManyToOne(fetch = FetchType.LAZY) 
	@JoinColumn (name = "id_barber", referencedColumnName = "id" )
	private Barber id_barber;


	public Cuts() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Cuts(Long id, String url, String description, Barbershop id_barbershop, Barber id_barber) {
		super();
		this.id = id;
		this.url = url;
		this.description = description;
		this.id_barbershop = id_barbershop;
		this.id_barber = id_barber;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
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


	@Override
	public String toString() {
		return "Cuts [id=" + id + ", url=" + url + ", description=" + description + ", id_barbershop=" + id_barbershop
				+ ", id_barber=" + id_barber + "]";
	}
	
	
	
	
	

}
