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

import org.springframework.web.bind.annotation.CrossOrigin;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@CrossOrigin(origins = "http://localhost:4200/")
@Entity
@Table(name="Images")
public class Images implements Serializable{

	private static final long serialVersionUID = -1633490155729869421L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(length = 30)
	private String name;
	
	@Column(length = 200)
	private String url;

	@Column(length = 100)
	private String description;
	
	@JsonIgnoreProperties(value={"catalogue","hibernateLazyInitializer","handler"},allowSetters = true)
<<<<<<< HEAD
	@JoinColumn (name = "owner", referencedColumnName = "id")
	@ManyToOne(fetch = FetchType.LAZY) 
=======
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn (name = "barbershop_id")
>>>>>>> 48f7f8f4e258a87fa26e21158056a66a9bebf0f2
	//@JoinColumn (name = "barbershop_id", referencedColumnName = "id")
	private Barbershop owner;

	public Images() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Images(Long id, String name, String url, String description, Barbershop owner) {
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

	@Override
	public String toString() {
		return "Images [id=" + id + ", name=" + name + ", url=" + url + ", description=" + description + ", owner="
				+ owner + "]";
	}

	
}
