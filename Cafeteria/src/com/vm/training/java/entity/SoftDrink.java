package com.vm.training.java.entity;
/**
 * Class SoftDrink implements ISoftDrink interface with its unimplemented methods
 * @author sasi chowdary
 *
 */
public class SoftDrink implements ISoftDrink
{
	private String dName;
	private int dCost;
	/**
	 * This was parameterized constructor of class SoftDrink with its variables
	 * @param dName
	 * @param cost
	 */
	public SoftDrink(String dName, int dCost) {
		super();
		this.dName = dName;
		this.dCost = dCost;
	}
	
	public SoftDrink() {
		super();
	}


	/**
	 * this are getters and setters methods for variables of class softDrink
	 * @return
	 */
	public String getdName() {
		return dName;
	}

	public void setdName(String dName) {
		this.dName = dName;
	}

	public int getdCost() {
		return dCost;
	}

	public void setdCost(int dCost) {
		this.dCost = dCost;
	}

	@Override
	public String toString() {
		return "SoftDrink [dName=" + dName + ", dCost=" + dCost + "]";
	}

	@Override
	public void drink() {
		// TODO Auto-generated method stub
		System.out.println("I am Drinking :"+getdName());
	}

	

}
