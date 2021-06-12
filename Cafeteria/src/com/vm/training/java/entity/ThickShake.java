package com.vm.training.java.entity;
/**
 * class thickShake implements the interface IThickShake
 * @author sasi chowdary
 *
 */
public class ThickShake implements IThickShakes
{

	private String tsName;
	private int tsCost;
	/**
	 * This was parameterized constructor of class ThickShake with its variables
	 * @param tsName
	 * @param tsCost
	 */
	public ThickShake(String tsName, int tsCost) {
		super();
		this.tsName = tsName;
		this.tsCost = tsCost;
	}
	
	public ThickShake() {
		super();
	}
	
	/**
	 * this are getters and setters methods for variables of class thickShake
	 * @return
	 */
	public String getTsName() {
		return tsName;
	}

	public void setTsName(String tsName) {
		this.tsName = tsName;
	}

	public int getTsCost() {
		return tsCost;
	}

	public void setTsCost(int tsCost) {
		this.tsCost = tsCost;
	}

	@Override
	public String toString() {
		return "ThickShake [tsName=" + tsName + ", tsCost=" + tsCost + "]";
	}

	
	
}
