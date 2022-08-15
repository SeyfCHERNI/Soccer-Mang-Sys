package com.example.sport.soccer.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User { 
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)	
	@Column(name="User_ID")
	private Long id;
	@Column
	private String firstname;
	@Column
	private String lastname;
	@Column
	private String email;
	@Column
	private String password;
	@Column
	private String confirmpassowrd;
	public User(Long id, String firstname, String lastname, String email, String password, String confirmpassowrd) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.password = password;
		this.confirmpassowrd = confirmpassowrd;
	}
	public User() {
		super();
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
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
	public String getConfirmpassowrd() {
		return confirmpassowrd;
	}
	public void setConfirmpassowrd(String confirmpassowrd) {
		this.confirmpassowrd = confirmpassowrd;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", email=" + email
				+ ", password=" + password + ", confirmpassowrd=" + confirmpassowrd + "]";
	}
	

}
