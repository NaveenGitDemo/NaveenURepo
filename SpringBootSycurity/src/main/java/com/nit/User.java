package com.nit;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {

	@Id
	private long id;
	private String username;
	private String password;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public User(long id, String username, String password) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", getId()=" + getId()
				+ ", getUsername()=" + getUsername() + ", getPassword()=" + getPassword() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
