package com.vm.entity;

import javax.persistence.Entity;

@Entity
public class Employee {
	
	private int id;
	private String name;
	private String dpt;
	
	public Employee() {
		super();
	}
	public Employee(int id, String name, String dpt) {
		super();
		this.id = id;
		this.name = name;
		this.dpt = dpt;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDpt() {
		return dpt;
	}
	public void setDpt(String dpt) {
		this.dpt = dpt;
	}
	

}
