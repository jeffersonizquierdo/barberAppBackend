package com.barberapp.entities;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "publication")
public class Publication {
	
	private static final long serialVersionUID = 1L;
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name = "id_publication")private Long id_publication;
	
	
	@Column(name = "id_usuario")
	private int id_usuario;
	
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
