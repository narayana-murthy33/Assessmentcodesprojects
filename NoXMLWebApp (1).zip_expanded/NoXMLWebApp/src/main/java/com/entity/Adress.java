package com.entity;

public class Adress {
	private String fromadress;
	private String toadress;
	private String date;
	public Adress(String fromadress, String toadress, String date) {
		super();
		this.fromadress = fromadress;
		this.toadress = toadress;
		this.date = date;
	}
	@Override
	public String toString() {
		return "Adress [fromadress=" + fromadress + ", toadress=" + toadress + ", date=" + date + "]";
	}
	public String getFromadress() {
		return fromadress;
	}
	public void setFromadress(String fromadress) {
		this.fromadress = fromadress;
	}
	public String getToadress() {
		return toadress;
	}
	public void setToadress(String toadress) {
		this.toadress = toadress;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public Adress() {
		
	}
	
	}


