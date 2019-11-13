package com.flight.onlineFlight.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "registration")
public class passengerModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String fullname;
	private String username;
	private String pass;
	private String email;
@Override
	public String toString() {
		return "passengerModel [id=" + id + ", fullname=" + fullname + ", username=" + username + ", password="
				+ pass + ", email=" + email + "]";
	}
public passengerModel(int id, String fullname, String username, String password, String email) {
	super();
	this.id = id;
	this.fullname = fullname;
	this.username = username;
	this.pass = password;
	this.email = email;
}
public passengerModel() {
	// TODO Auto-generated constructor stub
}
public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
