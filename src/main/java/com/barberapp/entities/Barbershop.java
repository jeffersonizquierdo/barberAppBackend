package com.barberapp.entities;

import java.io.Serializable;
import java.util.ArrayList;
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
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table (name = "barbershops")
public class Barbershop implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)@Column (name = "id")
	private Long id;
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
	

	@JsonIgnoreProperties(value={"owner","hibernateLazyInitializer","handler"},allowSetters = true)
	@OneToMany(fetch=FetchType.LAZY, mappedBy = "barbershop", cascade=CascadeType.ALL)
	private List<Barber> listBarbers;
	
	@OneToMany (mappedBy = "barbershop", cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	private List<Booking> bokings;

	@JsonIgnoreProperties(value={"owner","hibernateLazyInitializer","handler"},allowSetters = true)
<<<<<<< HEAD
	@OneToOne @JoinColumn (name = "promotions_id", referencedColumnName = "id")
	private Promotions promotion; 
=======
	@OneToMany(fetch=FetchType.LAZY, mappedBy = "owner", cascade=CascadeType.ALL)
	private List<Promotions> promotion; 
>>>>>>> 6655aa180e43e3ce9448c6bb137fb0f6771ea2cf
	
	@JsonIgnoreProperties(value={"owner","hibernateLazyInitializer","handler"},allowSetters = true)
	@OneToMany(fetch=FetchType.LAZY, mappedBy = "owner") 
	private List<Publication> publication;

	@JsonIgnoreProperties(value={"owner","hibernateLazyInitializer","handler"},allowSetters = true)
	@OneToMany(fetch=FetchType.LAZY, mappedBy = "owner")
	//@OneToMany (mappedBy = "owner", cascade = {CascadeType.PERSIST, CascadeType.MERGE}) 
	private List<Images> catalogue;
	
	@JsonIgnoreProperties(value={"id_barbershop","hibernateLazyInitializer","handler"},allowSetters = true)
	@OneToMany(fetch=FetchType.LAZY, mappedBy = "id_barbershop", cascade=CascadeType.ALL)
	//@OneToMany (mappedBy = "owner", cascade = {CascadeType.PERSIST, CascadeType.MERGE}) 
	private List<Publication> publications;
	
	@JsonIgnoreProperties(value={"id_barbershop","hibernateLazyInitializer","handler"},allowSetters = true)
	@OneToMany(fetch=FetchType.LAZY, mappedBy = "id_barbershop", cascade=CascadeType.ALL)
	//@OneToMany (mappedBy = "owner", cascade = {CascadeType.PERSIST, CascadeType.MERGE}) 
	private List<Cuts> cuts;


	
	public Barbershop() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	








	public Barbershop(Long id, String email, String password, String nickname, String city, String cellphone,
			int typeUser, String photo, String description, String location, Double qualification,
<<<<<<< HEAD
			List<Barber> listBarbers, List<Booking> bokings, Promotions promotion, List<Publication> publication,
			List<Images> catalogue) {
=======
			List<Barber> listBarbers, List<Booking> bokings, List<Promotions> promotion, List<Images> catalogue,
			List<Publication> publications, List<Cuts> cuts) {
>>>>>>> 6655aa180e43e3ce9448c6bb137fb0f6771ea2cf
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
		this.listBarbers = listBarbers;
		this.bokings = bokings;
		this.promotion = promotion;
<<<<<<< HEAD
		this.publication = publication;
=======
>>>>>>> 6655aa180e43e3ce9448c6bb137fb0f6771ea2cf
		this.catalogue = catalogue;
		this.publications = publications;
		this.cuts = cuts;
	}



<<<<<<< HEAD
	public Long getId() {
		return id;
	}


=======







	public List<Cuts> getCuts() {
		return cuts;
	}










	public void setCuts(List<Cuts> cuts) {
		this.cuts = cuts;
	}










	public List<Publication> getPublications() {
		return publications;
	}





	public void setPublications(List<Publication> publications) {
		this.publications = publications;
	}









	public Long getId() {
		return id;
	}
>>>>>>> 6655aa180e43e3ce9448c6bb137fb0f6771ea2cf

	public void setId(Long id) {
		this.id = id;
	}

<<<<<<< HEAD


=======
>>>>>>> 6655aa180e43e3ce9448c6bb137fb0f6771ea2cf
	public String getEmail() {
		return email;
	}

<<<<<<< HEAD


=======
>>>>>>> 6655aa180e43e3ce9448c6bb137fb0f6771ea2cf
	public void setEmail(String email) {
		this.email = email;
	}

<<<<<<< HEAD


=======
>>>>>>> 6655aa180e43e3ce9448c6bb137fb0f6771ea2cf
	public String getPassword() {
		return password;
	}

<<<<<<< HEAD


=======
>>>>>>> 6655aa180e43e3ce9448c6bb137fb0f6771ea2cf
	public void setPassword(String password) {
		this.password = password;
	}

<<<<<<< HEAD


=======
>>>>>>> 6655aa180e43e3ce9448c6bb137fb0f6771ea2cf
	public String getNickname() {
		return nickname;
	}

<<<<<<< HEAD


=======
>>>>>>> 6655aa180e43e3ce9448c6bb137fb0f6771ea2cf
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

<<<<<<< HEAD


=======
>>>>>>> 6655aa180e43e3ce9448c6bb137fb0f6771ea2cf
	public String getCity() {
		return city;
	}

<<<<<<< HEAD


=======
>>>>>>> 6655aa180e43e3ce9448c6bb137fb0f6771ea2cf
	public void setCity(String city) {
		this.city = city;
	}

<<<<<<< HEAD


=======
>>>>>>> 6655aa180e43e3ce9448c6bb137fb0f6771ea2cf
	public String getCellphone() {
		return cellphone;
	}

<<<<<<< HEAD


=======
>>>>>>> 6655aa180e43e3ce9448c6bb137fb0f6771ea2cf
	public void setCellphone(String cellphone) {
		this.cellphone = cellphone;
	}

<<<<<<< HEAD


=======
>>>>>>> 6655aa180e43e3ce9448c6bb137fb0f6771ea2cf
	public int getTypeUser() {
		return typeUser;
	}

<<<<<<< HEAD


=======
>>>>>>> 6655aa180e43e3ce9448c6bb137fb0f6771ea2cf
	public void setTypeUser(int typeUser) {
		this.typeUser = typeUser;
	}

<<<<<<< HEAD


=======
>>>>>>> 6655aa180e43e3ce9448c6bb137fb0f6771ea2cf
	public String getPhoto() {
		return photo;
	}

<<<<<<< HEAD


=======
>>>>>>> 6655aa180e43e3ce9448c6bb137fb0f6771ea2cf
	public void setPhoto(String photo) {
		this.photo = photo;
	}

<<<<<<< HEAD


=======
>>>>>>> 6655aa180e43e3ce9448c6bb137fb0f6771ea2cf
	public String getDescription() {
		return description;
	}

<<<<<<< HEAD


=======
>>>>>>> 6655aa180e43e3ce9448c6bb137fb0f6771ea2cf
	public void setDescription(String description) {
		this.description = description;
	}

<<<<<<< HEAD


=======
>>>>>>> 6655aa180e43e3ce9448c6bb137fb0f6771ea2cf
	public String getLocation() {
		return location;
	}

<<<<<<< HEAD


=======
>>>>>>> 6655aa180e43e3ce9448c6bb137fb0f6771ea2cf
	public void setLocation(String location) {
		this.location = location;
	}

<<<<<<< HEAD


=======
>>>>>>> 6655aa180e43e3ce9448c6bb137fb0f6771ea2cf
	public Double getQualification() {
		return qualification;
	}

<<<<<<< HEAD


=======
>>>>>>> 6655aa180e43e3ce9448c6bb137fb0f6771ea2cf
	public void setQualification(Double qualification) {
		this.qualification = qualification;
	}

<<<<<<< HEAD


=======
>>>>>>> 6655aa180e43e3ce9448c6bb137fb0f6771ea2cf
	public List<Barber> getListBarbers() {
		return listBarbers;
	}

<<<<<<< HEAD


=======
>>>>>>> 6655aa180e43e3ce9448c6bb137fb0f6771ea2cf
	public void setListBarbers(List<Barber> listBarbers) {
		this.listBarbers = listBarbers;
	}

<<<<<<< HEAD


=======
>>>>>>> 6655aa180e43e3ce9448c6bb137fb0f6771ea2cf
	public List<Booking> getBokings() {
		return bokings;
	}

	public void setBokings(List<Booking> bokings) {
		this.bokings = bokings;
	}

<<<<<<< HEAD

	public void setBokings(List<Booking> bokings) {
		this.bokings = bokings;
	}



	public Promotions getPromotion() {
		return promotion;
	}



	public void setPromotion(Promotions promotion) {
		this.promotion = promotion;
	}



	public List<Publication> getPublication() {
		return publication;
	}



	public void setPublication(List<Publication> publication) {
		this.publication = publication;
	}



	public List<Images> getCatalogue() {
		return catalogue;
=======
	public List<Promotions> getPromotion() {
		return promotion;
	}

	public void setPromotion(List<Promotions> promotion) {
		this.promotion = promotion;
>>>>>>> 6655aa180e43e3ce9448c6bb137fb0f6771ea2cf
	}

	public List<Images> getCatalogue() {
		return catalogue;
	}

	public void setCatalogue(List<Images> catalogue) {
		this.catalogue = catalogue;
	}

	@Override
	public String toString() {
		return "Barbershop [id=" + id + ", email=" + email + ", password=" + password + ", nickname=" + nickname
				+ ", city=" + city + ", cellphone=" + cellphone + ", typeUser=" + typeUser + ", photo=" + photo
				+ ", description=" + description + ", location=" + location + ", qualification=" + qualification
				+ ", listBarbers=" + listBarbers + ", bokings=" + bokings + ", promotion=" + promotion + ", catalogue="
				+ catalogue + "]";
	}

	
	
	


	public void setCatalogue(List<Images> catalogue) {
		this.catalogue = catalogue;
	}



	@Override
	public String toString() {
		return "Barbershop [id=" + id + ", email=" + email + ", password=" + password + ", nickname=" + nickname
				+ ", city=" + city + ", cellphone=" + cellphone + ", typeUser=" + typeUser + ", photo=" + photo
				+ ", description=" + description + ", location=" + location + ", qualification=" + qualification
				+ ", listBarbers=" + listBarbers + ", bokings=" + bokings + ", promotion=" + promotion
				+ ", publication=" + publication + ", catalogue=" + catalogue + "]";
	}
	
	

}
