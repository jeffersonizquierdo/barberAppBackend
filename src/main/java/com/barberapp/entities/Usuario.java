package com.barberapp.entities;

import java.io.Serializable;
import java.sql.Date;
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
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties({"hibernateLazyInitializer",  "handler"})
@Entity
@Table(name = "users")
public class Usuario implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(unique = true, length = 20)
	private String username;

	@Column(length = 60)
	private String password;

	private Boolean enabled;
	
	@Column(unique = true)
	private String email;
	
	@Column(name = "type_user")
	private int typeUser;

	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name = "users_authorities", joinColumns = @JoinColumn(name = "usuario_id"), inverseJoinColumns = @JoinColumn(name = "role_id"), uniqueConstraints = {
			@UniqueConstraint(columnNames = { "usuario_id", "role_id" }) })
	public List<Role> roles;
	
	
	@Column(name = "date_or_birth")
	private Date date;

	@JsonIgnoreProperties(value={"usuario","hibernateLazyInitializer","handler"},allowSetters = true)
	@OneToOne(fetch = FetchType.LAZY) 
	@JoinColumn (name = "barbershop")
	private Barbershop barbershop;
	
	@JsonIgnoreProperties(value={"usuario","hibernateLazyInitializer","handler"},allowSetters = true)
	@OneToOne(fetch = FetchType.LAZY) 
	@JoinColumn (name = "barber")
	private Barber barber;
	
	@JsonIgnoreProperties(value={"usuario","hibernateLazyInitializer","handler"},allowSetters = true)
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn (name = "customer")
	private Customer customer;

	public Long getId() {
		return id;
	}

	public Usuario() {
		
		super();
		roles = new ArrayList<>();
	}






	public Usuario(Long id, String username, String password, Boolean enabled, String email, int typeUser,
			List<Role> roles, Date date, Barbershop barbershop, Barber barber, Customer customer) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.enabled = enabled;
		this.email = email;
		this.typeUser = typeUser;
		this.roles = roles;
		this.date = date;
		this.barbershop = barbershop;
		this.barber = barber;
		this.customer = customer;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Boolean getEnabled() {
		return enabled;
	}

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}

	public Barbershop getBarbershop() {
		return barbershop;
	}

	public void setBarbershop(Barbershop barbershop) {
		this.barbershop = barbershop;
	}

	public Barber getBarber() {
		return barber;
	}

	public void setBarber(Barber barber) {
		this.barber = barber;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getTypeUser() {
		return typeUser;
	}

	public void setTypeUser(int typeUser) {
		this.typeUser = typeUser;
	}


	private static final long serialVersionUID = 1L;

}
