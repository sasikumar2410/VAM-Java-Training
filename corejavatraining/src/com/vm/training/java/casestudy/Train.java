package com.vm.training.java.casestudy;

public class Train 
{
	 int train_number;
	 String train_name;
	 String train_source;
	 String train_destination;
	 double train_ticketPrice;
	/**
	 * This was parameterized constructor of class train by its variables
	 * @param train_number
	 * @param train_name
	 * @param train_source
	 * @param train_destination
	 * @param train_ticketPrice
	 */
	public Train(int train_number, String train_name, String train_source, String train_destination,
			double train_ticketPrice) {
		super();
		this.train_number = train_number;
		this.train_name = train_name;
		this.train_source = train_source;
		this.train_destination = train_destination;
		this.train_ticketPrice = train_ticketPrice;
	}
	/**
	 * Default Constructor
	 */
	public Train() {
		super();
	}
	/**
	 * we generated getters and setters methods for variables to set and get the data
	 * @return
	 */
	public int getTrain_number() {
		return train_number;
	}
	public void setTrain_number(int train_number) {
		this.train_number = train_number;
	}
	public String getTrain_name() {
		return train_name;
	}
	public void setTrain_name(String train_name) {
		this.train_name = train_name;
	}
	public String getTrain_source() {
		return train_source;
	}
	public void setTrain_source(String train_source) {
		this.train_source = train_source;
	}
	public String getTrain_destination() {
		return train_destination;
	}
	public void setTrain_destination(String train_destination) {
		this.train_destination = train_destination;
	}
	public double getTrain_ticketPrice() {
		return train_ticketPrice;
	}
	public void setTrain_ticketPrice(double train_ticketPrice) {
		this.train_ticketPrice = train_ticketPrice;
	}
	
	/**
	 * This method is used to print the data of the class 
	 */
	@Override
	public String toString() {
		return "Train [train_number=" + train_number + ", train_name=" + train_name + ", train_source=" + train_source
				+ ", train_destination=" + train_destination + ", train_ticketPrice=" + train_ticketPrice + "]";
	}
	
	
}
