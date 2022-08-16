package com.barberapp.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "http://localhost:4200/")
@Entity
@Table(name="Publication")
public class Publication implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_publication;
	
	@Column(name = "id_usuario")
	private int id_usuario;
	
	
	@Column(name = "descripcion")
	private String descripcion;
	
	@Column(name = "url")
	private String url;
	
	

	public Publication() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Publication(Long id_publication, int id_usuario, String descripcion, String url) {
		super();
		this.id_publication = id_publication;
		this.id_usuario = id_usuario;
		this.descripcion = descripcion;
		this.url = url;
	}



	public Long getId_publication() {
		return id_publication;
	}



	public void setId_publication(Long id_publication) {
		this.id_publication = id_publication;
	}



	public int getId_usuario() {
		return id_usuario;
	}



	public void setId_usuario(int id_usuario) {
		this.id_usuario = id_usuario;
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
	
	
	
	
	
}
