package com.barberapp.entities;

import java.io.Serializable;
<<<<<<< HEAD
import java.util.ArrayList;
import java.util.List;
=======
>>>>>>> 80ca007352d385a6c39a453c15586ac5db306d63

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "barbershops")
public class Barbershop implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
<<<<<<< HEAD
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY) @Column (name = "id")private Long id;
	@Column (name = "email", nullable = false, unique = true, length = 200) private String email;
	@Column (name = "password", nullable = false) private String password;
	@Column (name = "nickname", nullable = false) private String nickname;
	@Column (name = "city", nullable = false) private String city;
	@Column (name = "cellphone", nullable = false, length = 10) private String cellphone;
	@Column (name = "type_user", nullable = false) private int typeUser;
	@Column (name = "photo", nullable = true) private String photo;
	@Column (name = "description") private String description;
	@Column (name = "location") private String location;
	@Column (name = "qualification") private Double qualification;
	@Column (name = "id_catalogue") private int id_catalogue;
	@ManyToMany @JoinTable(name = "barbershops_barbers", joinColumns = @JoinColumn
			(name = "id_barbershop"), inverseJoinColumns = @JoinColumn (name = "id_barber")) private List<Barber> listBarbers;
	
	
=======

	@Id
	@Column(name = "id_user")
	private Long idBarbershop;
	@Column(name = "location")
	private String location;
	@Column(name = "qualification")
	private Double qualification;
	@Column(name = "linked_barbers")
	private int linkedBarbers;
	private String foto;

>>>>>>> 80ca007352d385a6c39a453c15586ac5db306d63
	public Barbershop() {
		super();

		this.listBarbers = new ArrayList<Barber>();
	}

<<<<<<< HEAD

	public Barbershop(Long id, String email, String password, String nickname, String city, String cellphone,
			int typeUser, String photo, String description, String location, Double qualification, int id_catalogue,
			List<Barber> listBarbers) {
=======
	public Barbershop(Long idBarbershop, String location, Double qualification, int linkedBarbers) {
>>>>>>> 80ca007352d385a6c39a453c15586ac5db306d63
		super();
		this.id = id;
		this.email = email;
		this.password = password;
		this.nickname = nickname;
		this.city = city;
		this.cellphone = cellphone;
		this.typeUser = typeUser;
		this.photo = photo;
		this.description = description;
		this.location = location;
		this.qualification = qualification;
<<<<<<< HEAD
		this.id_catalogue = id_catalogue;
		this.listBarbers = listBarbers;
	}


	public Long getId() {
		return id;
=======
		this.linkedBarbers = linkedBarbers;

	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public Long getIdBarbershop() {
		return idBarbershop;
	}

	public void setIdBarbershop(Long idBarbershop) {
		this.idBarbershop = idBarbershop;
>>>>>>> 80ca007352d385a6c39a453c15586ac5db306d63
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


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Double getQualification() {
		return qualification;
	}

	public void setQualification(Double qualification) {
		this.qualification = qualification;
	}

<<<<<<< HEAD

	public List<Barber> getListBarbers() {
		return listBarbers;
	}


	public void setListBarbers(List<Barber> listBarbers) {
		this.listBarbers = listBarbers;
=======
	public int getLinkedBarbers() {
		return linkedBarbers;
	}

	public void setLinkedBarbers(int linkedBarbers) {
		this.linkedBarbers = linkedBarbers;
	}

	@Override
	public String toString() {
		return "Barbershop [idBarbershop=" + idBarbershop + ", location=" + location + ", qualification="
				+ qualification + ", linkedBarbers=" + linkedBarbers + ", catalogue=" + "]";
>>>>>>> 80ca007352d385a6c39a453c15586ac5db306d63
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}


}
