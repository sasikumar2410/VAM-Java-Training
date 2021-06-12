package com.vm.training.java.entity;
/**
 * Class HotDrink implements IHotDrink interface with its unimplemented methods
 * @author sasi chowdary
 *
 */
public class HotDrink implements IHotDrink
{
	private String hName;
	private int hCost;
	/**
	 * This was parameterized constructor of class HotDrink with its variables
	 * @param hName
	 * @param hCost
	 */
	public HotDrink(String hName, int hCost) {
		super();
		this.hName = hName;
		this.hCost = hCost;
	}
	

	public HotDrink() {
		super();
	}
	
	/**
	 * this are getters and setters methods for variables of class HotDrink
	 * @return
	 */
	public String gethName() {
		return hName;
	}


	public void sethName(String hName) {
		this.hName = hName;
	}


	public int gethCost() {
		return hCost;
	}


	public void sethCost(int hCost) {
		this.hCost = hCost;
	}


	@Override
	public String toString() {
		return "HotDrink [hName=" + hName + ", hCost=" + hCost + "]";
	}

	

}
