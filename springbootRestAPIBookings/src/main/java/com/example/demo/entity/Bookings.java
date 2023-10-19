package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Bookings {
	@Id
	private String mailid;
	public Bookings(String mailid, String source, String destination, String date, String noofpassengers) {
		
		this.mailid = mailid;
		this.source = source;
		this.destination = destination;
		this.date = date;
		this.noofpassengers = noofpassengers;
	}
	@Override
	public String toString() {
		return "Bookings [mailid=" + mailid + ", source=" + source + ", destination=" + destination + ", date=" + date
				+ ", noofpassengers=" + noofpassengers + "]";
	}
	public String getMailid() {
		return mailid;
	}
	public void setMailid(String mailid) {
		this.mailid = mailid;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getNoofpassengers() {
		return noofpassengers;
	}
	public void setNoofpassengers(String noofpassengers) {
		this.noofpassengers = noofpassengers;
	}
	private String source;
	private String destination;
	private String date;
	private String noofpassengers;
   public Bookings() {
	   
   }
}
