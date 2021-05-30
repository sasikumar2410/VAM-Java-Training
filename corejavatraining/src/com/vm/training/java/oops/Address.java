package com.vm.training.java.oops;

public class Address
{
	String city;
	String state;
	String country;
	
	
	
	//generating the getters and setters for datafeilds of the classmembers
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	
	
	
	//tostring method to print the data of Empoyeedetails
	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + ", country=" + country + "]";
	}
	
	

}
