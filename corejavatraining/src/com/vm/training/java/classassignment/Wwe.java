package com.vm.training.java.classassignment;

public class Wwe 
{
	 private String first_name;
	 private String last_name;
	 private int w_weight;
	 /**
	  * This was the parameterized constructor of class Wwe with its variables
	  * @param first_name
	  * @param last_name
	  * @param w_weight
	  */
	public Wwe(String first_name, String last_name, int w_weight) {
		super();
		this.first_name = first_name;
		this.last_name = last_name;
		this.w_weight = w_weight;
	}
	public Wwe() {
		super();
	}
	
	
	/**
	 * Getters and setters methods for the class Wwe with its variables
	 * @return
	 */
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public int getW_weight() {
		return w_weight;
	}
	public void setW_weight(int w_weight) {
		this.w_weight = w_weight;
	}
	
	
	
	/**
	 * This method is used to print the data of  class Wwe for that we use toString()S
	 */
	@Override
	public String toString() {
		return "Wwe [first_name=" + first_name + ", last_name=" + last_name + ", w_weight=" + w_weight + "]";
	}
	
	
	
	
	
}
