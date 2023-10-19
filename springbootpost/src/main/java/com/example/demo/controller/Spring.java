package com.example.demo.controller;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Spring {
	@Id
	private String email;
	private String password;
	public Spring(String email, String password) {
		
		this.email = email;
		this.password = password;
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
	@Override
	public String toString() {
		return "Spring [email=" + email + ", password=" + password + "]";
	}
	public Spring() {
		
	}
	

}
