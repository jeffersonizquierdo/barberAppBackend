package com.barberapp.entities;


import java.io.Serializable;
import java.sql.Date;
import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "barber")
public class Barber implements Serializable{
	
	
	private static final long serialVersionUID = 1L;

	@Id 
	@Column (name = "id")
	private Long id;
	
	@Column (name = "email", nullable = false, unique = true, length = 200)
	private String email;
	
	@Column (name = "password", nullable = false)
	private String password;
	
	@Column (name = "nickname", nullable = false)
	private String nickname;
	
	@Column (name = "city", nullable = false)
	private String city;
	
	@Column (name = "cellphone", nullable = false, length = 10)
	private String cellphone;
	
	@Column (name = "type_user", nullable = false)
	private int typeUser;
	
	@Column (name = "photo", nullable = true)
	private String photo;
	
	@Column (name = "age", nullable = false)
	private Date age;
	
	@Column (name = "description", length = 300)
	private String description;
	
	@Column (name = "qualification")
	private Double qualification;
	
	@JsonIgnoreProperties(value={"id_barber","hibernateLazyInitializer","handler"},allowSetters = true)
	@OneToMany(fetch=FetchType.LAZY, mappedBy = "id_barber", cascade=CascadeType.ALL)
	//@OneToMany (mappedBy = "owner", cascade = {CascadeType.PERSIST, CascadeType.MERGE}) 
	private List<Publication> publication;
	
	@JsonIgnoreProperties(value={"listBarbers","hibernateLazyInitializer","handler"},allowSetters = true)
	@ManyToOne(fetch = FetchType.LAZY) 
	@JoinColumn (name = "barbershop_id") 
	private  Barbershop barbershop;
	
	@JsonIgnoreProperties(value={"barber","hibernateLazyInitializer","handler"},allowSetters = true)
	@OneToMany(fetch=FetchType.LAZY, mappedBy = "barber")
	private List<Booking> bookingsBarber;

	
	public Barber() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Barber(Long id, String email, String password, String nickname, String city, String cellphone, int typeUser,
			String photo, Date age, String description, Double qualification, List<Publication> publication,
			Barbershop barbershop, List<Booking> bookingsBarber) {
		super();
		this.id = id;
		this.email = email;
		this.password = password;
		this.nickname = nickname;
		this.city = city;
		this.cellphone = cellphone;
		this.typeUser = typeUser;
		this.photo = photo;
		this.age = age;
		this.description = description;
		this.qualification = qualification;
		this.publication = publication;
		this.barbershop = barbershop;
		this.bookingsBarber = bookingsBarber;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getNickname() {
		return nickname;
	}


	public void setNickname(String nickname) {
		this.nickname = nickname;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getCellphone() {
		return cellphone;
	}


	public void setCellphone(String cellphone) {
		this.cellphone = cellphone;
	}


	public int getTypeUser() {
		return typeUser;
	}


	public void setTypeUser(int typeUser) {
		this.typeUser = typeUser;
	}


	public String getPhoto() {
		return photo;
	}


	public void setPhoto(String photo) {
		this.photo = photo;
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


	public Double getQualification() {
		return qualification;
	}


	public void setQualification(Double qualification) {
		this.qualification = qualification;
	}


	public List<Publication> getPublication() {
		return publication;
	}


	public void setPublication(List<Publication> publication) {
		this.publication = publication;
	}


	public Barbershop getBarbershop() {
		return barbershop;
	}


	public void setBarbershop(Barbershop barbershop) {
		this.barbershop = barbershop;
	}


	public List<Booking> getBookingsBarber() {
		return bookingsBarber;
	}


	public void setBookingsBarber(List<Booking> bookingsBarber) {
		this.bookingsBarber = bookingsBarber;
	}


	@Override
	public String toString() {
		return "Barber [id=" + id + ", email=" + email + ", password=" + password + ", nickname=" + nickname + ", city="
				+ city + ", cellphone=" + cellphone + ", typeUser=" + typeUser + ", photo=" + photo + ", age=" + age
				+ ", description=" + description + ", qualification=" + qualification + ", publication=" + publication
				+ ", barbershop=" + barbershop + ", bookingsBarber=" + bookingsBarber + "]";
	}
}
