package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity

public class Hospital {
	@Id
	private int id;
	@Override
	public String toString() {
		return "Hospital [id=" + id + ", pname=" + pname + ", village=" + village + "]";
	}
	public Hospital(int id, String pname, String village) {
		
		this.id = id;
		this.pname = pname;
		this.village = village;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getVillage() {
		return village;
	}
	public void setVillage(String village) {
		this.village = village;
	}
	private String pname;
	private String village;
	public Hospital() {
		
	}

}
