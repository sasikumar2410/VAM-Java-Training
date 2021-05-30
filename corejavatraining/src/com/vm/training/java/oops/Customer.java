package com.vm.training.java.oops;

public class Customer {

	int id;
	String firstName;
	String lastName;
	String account;
	public Customer() {
		super();
		System.out.println("default");
	}
	//getter and setter methods were generated for access 
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	
	/*
	 * Customer(int id,String fisrtName,String lastName,String account) {
	 * this.id=id; this.firstName= firstName; this.lastName=lastName;
	 * this.account=account; }
	 */
	/*
	 * public void show() {
	 * System.out.print(id+" "+firstName+" "+lastName+" "+account); }
	 */
	
}
