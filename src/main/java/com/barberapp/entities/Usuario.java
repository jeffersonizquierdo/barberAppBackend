package com.barberapp.entities;

import java.io.Serializable;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties({"hibernateLazyInitializer",  "handler"})
@Entity
@Table(name = "users")
public class Usuario implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(unique = true, length = 30)
	private String username;
	
	@Column(unique = true, length = 200)
	private String email;


	@Column(length = 60)
	private String password;
	

	private Boolean enabled;


	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name = "users_roles", joinColumns =  @JoinColumn(name = "user_id"), 
	inverseJoinColumns = @JoinColumn(name = "role_id"), uniqueConstraints = {@UniqueConstraint(columnNames = {"user_id","role_id"})})
	List<Role> roles;

	
	@Column(name = "type_user")
	private int typeUser;

	
	
	@Column(name = "date_or_birth")
	private Date date;
	
	@JsonIgnoreProperties(value={"usuario","hibernateLazyInitializer","handler"},allowSetters = true)
	@OneToOne(fetch = FetchType.LAZY) 
	@JoinColumn (name = "cuts")
	private Cuts cuts;


	public Usuario() {
		super();
		
		roles = new ArrayList<>();
	}



	public Usuario(Long id, String username, String email, String password, Boolean enabled, List<Role> roles,
			int typeUser, Date date, Cuts cuts) {
		super();
		this.id = id;
		this.username = username;
		this.email = email;
		this.password = password;
		this.enabled = enabled;
		this.roles = roles;
		this.typeUser = typeUser;
		this.date = date;
		this.cuts = cuts;
	}



	public Cuts getCuts() {
		return cuts;
	}




	public void setCuts(Cuts cuts) {
		this.cuts = cuts;
	}




	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
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


	public Boolean getEnabled() {
		return enabled;
	}


	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}


	public List<Role> getRoles() {
		return roles;
	}


	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}


	public int getTypeUser() {
		return typeUser;
	}


	public void setTypeUser(int typeUser) {
		this.typeUser = typeUser;
	}


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}

	

}
