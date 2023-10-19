package com.example.demo.controller;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Post {
	@Id
	private String name;
	@Override
	public String toString() {
		return "Post [name=" + name + ", village=" + village + ", phone=" + phone + ", pin=" + pin + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getVillage() {
		return village;
	}
	public void setVillage(String village) {
		this.village = village;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPin() {
		return pin;
	}
	public void setPin(String pin) {
		this.pin = pin;
	}
	public Post(String name, String village, String phone, String pin) {
		
		this.name = name;
		this.village = village;
		this.phone = phone;
		this.pin = pin;
	}
	private String village;
	private String phone;
	private String pin;
public Post() {
	
}
}
