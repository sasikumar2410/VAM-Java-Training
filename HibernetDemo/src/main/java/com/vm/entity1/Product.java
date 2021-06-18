package com.vm.entity1;

import javax.persistence.Entity;

@Entity
public class Product
{
	private int pid;
	private String pname;
	private int pquantity;
	private int price;
	public Product() {
		super();
	}
	public Product(int pid, String pname, int pquantity, int price) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.pquantity = pquantity;
		this.price = price;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getPquantity() {
		return pquantity;
	}
	public void setPquantity(int pquantity) {
		this.pquantity = pquantity;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
}
