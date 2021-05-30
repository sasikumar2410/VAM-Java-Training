package com.vm.training.java.miniproject;

public abstract class BillingDetails implements Billing
{
	int customer_id; int customer_bill;
	
	public BillingDetails(int customer_id, int customer_bill) {
		super();
		this.customer_id = customer_id;
		this.customer_bill = customer_bill;
	}

	@Override
	public void billing() {
		// TODO Auto-generated method stub
		System.out.println("BillingDetails [customer_id=" + customer_id + ", customer_bill=" + customer_bill + "]");
	}
	
	
}
