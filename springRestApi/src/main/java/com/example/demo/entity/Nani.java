package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="nani")
public class Nani {
	@Id
 private String email;
 @Override
	public String toString() {
		return "Nani [email=" + email + ", password=" + password + "]";
	}
private String password;
public Nani(String email, String password) {
	
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
public Nani() {
	
}
}
