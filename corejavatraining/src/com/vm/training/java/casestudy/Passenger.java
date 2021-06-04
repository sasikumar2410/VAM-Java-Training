package com.vm.training.java.casestudy;

public class Passenger
{
	String passenger_name;
	int passenger_age;
	char passenger_gender;
	/**
	 * This was parameterized constructor of class passenger by its variables
	 * @param passenger_name
	 * @param passenger_age
	 * @param gender
	 */
	public Passenger(String passenger_name, int passenger_age, char gender) {
		super();
		this.passenger_name = passenger_name;
		this.passenger_age = passenger_age;
		this.passenger_gender = gender;
	}
	/**
	 * Default Constructor
	 */
	public Passenger() {
		super();
	}
	/**
	 * we generated getters and setters methods for variables to set and get the data
	 * @return
	 */
	public String getPassenger_name() {
		return passenger_name;
	}
	public void setPassenger_name(String passenger_name) {
		this.passenger_name = passenger_name;
	}
	public int getPassenger_age() {
		return passenger_age;
	}
	public void setPassenger_age(int passenger_age) {
		this.passenger_age = passenger_age;
	}
	public char getPassenger_gender() {
		return passenger_gender;
	}
	public void setPassenger_gender(char passenger_gender) {
		this.passenger_gender = passenger_gender;
	}
	/**
	 * this method is used to print tha data
	 */
	@Override
	public String toString() {
		return "Passenger [passenger_name=" + passenger_name + ", passenger_age=" + passenger_age
				+ ", passenger_gender=" + passenger_gender + "]";
	}
	
	
   public int compareTo(Passenger passenger)
   {
		
		return passenger_name.compareTo(passenger.passenger_name);
	}
	
}
