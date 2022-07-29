package com.barberapp.entities;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table (name = "users")
public class User implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY) @Column (name = "id_username")private Long idUser;
	@Column (name = "email", nullable = false, unique = true) private String email;
	@Column (name = "password") private String password;
	@Column (name = "nickname") private String nickname;
	@Column (name = "city") private String city;
	@Column (name = "cellphone") private String cellphone;
	@Column (name = "type_user", nullable = false) private String typeUser;
	
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}


	public User(Long idUser, String typeUser, String email, String password, String nickname, String city,
			String cellphone) {
		super();
		this.idUser = idUser;
		this.typeUser = typeUser;
		this.email = email;
		this.password = password;
		this.nickname = nickname;
		this.city = city;
		this.cellphone = cellphone;
	}


	public Long getIdUser() {
		return idUser;
	}


	public void setIdUser(Long idUser) {
		this.idUser = idUser;
	}


	public String getTypeUser() {
		return typeUser;
	}


	public void setTypeUser(String typeUser) {
		this.typeUser = typeUser;
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


	public void setCellphone(String cellphoneNumber) {
		this.cellphone = cellphoneNumber;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	@Override
	public String toString() {
		return "User [idUser=" + idUser + ", email=" + email + ", password=" + password + ", nickname=" + nickname
				+ ", city=" + city + ", cellphone=" + cellphone + ", typeUser=" + typeUser + "]";
	}




}
