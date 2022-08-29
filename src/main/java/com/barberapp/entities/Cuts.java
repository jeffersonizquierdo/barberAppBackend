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
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name = "id")
	private Long id;
	
	@JsonIgnoreProperties(value={"cuts","hibernateLazyInitializer","handler"},allowSetters = true)
	@ManyToOne(fetch = FetchType.LAZY) 
	@JoinColumn (name = "id_user", referencedColumnName = "id" )
	private Usuario usuario;
	
	
	
	
	
	@Column (name = "url")
	private String url;
	
	@Column (name = "description")
	private String description;
	


	public Cuts() {
		super();
		// TODO Auto-generated constructor stub
	}











	public Cuts(Long id, Usuario usuario, String url, String description) {
		super();
		this.id = id;
		this.usuario = usuario;
		this.url = url;
		this.description = description;
	}











	public Long getId() {
		return id;
	}











	public void setId(Long id) {
		this.id = id;
	}











	public Usuario getUsuario() {
		return usuario;
	}











	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
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











	@Override
	public String toString() {
		return "Cuts [id=" + id + ", usuario=" + usuario + ", url=" + url + ", description=" + description + "]";
	}






	
	
	
	
	

}
