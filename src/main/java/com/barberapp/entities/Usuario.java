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

	@Column(unique = true, length = 200)
	private String username;
	
	@Column(unique = true, length = 200)
	private String nickname;


	@Column(length = 60)
	private String password;
	

	private Boolean enabled;
	
	@Column(name = "type_user")
	private int typeUser;
	
	@Column(length = 60)
	private String city;
	
	@Column(length = 10)
	private String cellphone;

	private Date age;
	

	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name = "users_roles", joinColumns =  @JoinColumn(name = "user_id"), 
	inverseJoinColumns = @JoinColumn(name = "role_id"), uniqueConstraints = {@UniqueConstraint(columnNames = {"user_id","role_id"})})
	List<Role> roles;
	
	@JsonIgnoreProperties(value={"usuario","hibernateLazyInitializer","handler"},allowSetters = true)
	@OneToOne(fetch = FetchType.LAZY) 
	@JoinColumn (name = "cuts")
	private Cuts cuts;


	public Usuario() {
		super();
		
		roles = new ArrayList<>();
	}


	public Usuario(Long id, String username, String nickname, String password, Boolean enabled, int typeUser,
			String city, String cellphone, Date age, List<Role> roles, Cuts cuts) {
		super();
		this.id = id;
		this.username = username;
		this.nickname = nickname;
		this.password = password;
		this.enabled = enabled;
		this.typeUser = typeUser;
		this.city = city;
		this.cellphone = cellphone;
		this.age = age;
		this.roles = roles;
		this.cuts = cuts;
	}


	public Cuts getCuts() {
		return cuts;
	}




	public void setCuts(Cuts cuts) {
		this.cuts = cuts;
	}


	public Date getAge() {
		return age;
	}


	public void setAge(Date age) {
		this.age = age;
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


	public String getNickname() {
		return nickname;
	}


	public void setNickname(String nickname) {
		this.nickname = nickname;
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
	
	

	

}
