package com.vm.training.java.newfuture;

public class ProductDemo
{
	int p_id;
	String p_name;
	String p_category;
	int p_quantity;
	int p_price;
	/**
	 * we created parameterized constructor of product class
	 * @param p_id
	 * @param p_name
	 * @param p_category
	 * @param p_quantity
	 * @param p_price
	 */
	public ProductDemo(int p_id, String p_name, String p_category, int p_quantity, int p_price) {
		super();
		this.p_id = p_id;
		this.p_name = p_name;
		this.p_category = p_category;
		this.p_quantity = p_quantity;
		this.p_price = p_price;
	}
	/**
	 * 
	 * @return
	 * we generate getters and setters for the feilds of product class 
	 */
	public int getP_id() {
		return p_id;
	}
	public void setP_id(int p_id) {
		this.p_id = p_id;
	}
	public String getP_name() {
		return p_name;
	}
	public void setP_name(String p_name) {
		this.p_name = p_name;
	}
	public String getP_category() {
		return p_category;
	}
	public void setP_category(String p_category) {
		this.p_category = p_category;
	}
	public int getP_quantity() {
		return p_quantity;
	}
	public void setP_quantity(int p_quantity) {
		this.p_quantity = p_quantity;
	}
	public int getP_price() {
		return p_price;
	}
	public void setP_price(int p_price) {
		this.p_price = p_price;
	}
	
	
	/**
	 * we call toString() method to return the data
	 */
	@Override
	public String toString() {
		return "Product [p_id=" + p_id + ", p_name=" + p_name + ", p_category=" + p_category + ", p_quantity="
				+ p_quantity + ", p_price=" + p_price + "]";
	}
	
}
