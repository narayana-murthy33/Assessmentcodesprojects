package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
public class Product {
	@Id
	@GeneratedValue
	private int pid;
	private String productName;
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", productName=" + productName + ", qty=" + qty + ", price=" + price + "]";
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Product(int pid, String productName, int qty, int price) {
		super();
		this.pid = pid;
		this.productName = productName;
		this.qty = qty;
		this.price = price;
	}
	private int qty;
	private int price;
public Product() {
	
}

}
