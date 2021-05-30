package com.vm.training.java.miniproject;

public abstract class CustomerDetails implements Customer
{
	String customer_name; int customer_id; int customer_table_number;
	int customer_discountOnAppliedCoupon;String customer_BookiedTimeTill; long customer_phnum;
	
	public CustomerDetails(String customer_name, int customer_id, int customer_table_number,
			int customer_discountOnAppliedCoupon, String customer_BookiedTimeTill, long customer_phnum) {
		super();
		this.customer_name = customer_name;
		this.customer_id = customer_id;
		this.customer_table_number = customer_table_number;
		this.customer_discountOnAppliedCoupon = customer_discountOnAppliedCoupon;
		this.customer_BookiedTimeTill = customer_BookiedTimeTill;
		this.customer_phnum = customer_phnum;
	}
    @Override
	public void costomer() 
	{
		// TODO Auto-generated method stub
		System.out.println("CustomerDetails [customer_name=" + customer_name + ", customer_id=" + customer_id
				+ ", customer_table_number=" + customer_table_number + ", customer_discountOnAppliedCoupon="
				+ customer_discountOnAppliedCoupon + ", customer_BookiedTimeTill=" + customer_BookiedTimeTill
				+ ", customer_phnum=" + customer_phnum + "]");
		
	}
	
}
