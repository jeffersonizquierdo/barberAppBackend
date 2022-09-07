package com.barberapp.entities;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "customers")
public class Customer  implements Serializable{

	private static final long serialVersionUID = 1L;
	
	
	@Id
	@Column (name = "id")private Long id;
	@Column (name = "email", nullable = false, unique = true, length = 200) private String email;
	@Column (name = "password", nullable = false) private String password;
	@Column (name = "nickname", nullable = false) private String nickname;
	@Column (name = "city", nullable = false) private String city;
	@Column (name = "cellphone", nullable = false, length = 10) private String cellphone;
	@Column (name = "type_user", nullable = false) private int typeUser;
	@Column (name = "photo", nullable = true) private String photo;
	@Column (name = "age", nullable = false) private Date age;
	
	@JsonIgnoreProperties(value={"customer","hibernateLazyInitializer","handler"},allowSetters = true)
	@OneToMany (mappedBy = "customer", cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	private List<Booking> bokings;

	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	




	public Customer(Long id, String email, String password, String nickname, String city, String cellphone,
			int typeUser, String photo, Date age, List<Booking> bokings) {
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
		this.bokings = bokings;

	}



	public List<Booking> getBokings() {
		return bokings;
	}


	public void setBokings(List<Booking> bokings) {
		this.bokings = bokings;
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

	
	

}