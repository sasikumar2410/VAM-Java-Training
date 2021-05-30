package com.vm.training.java.miniproject;

public abstract class OfferDetails implements Offers 
{

	int coupon_id; int coupon_code; int discount;
	
	public OfferDetails(int coupon_id, int coupon_code, int discount) {
		super();
		this.coupon_id = coupon_id;
		this.coupon_code = coupon_code;
		this.discount = discount;
	}
	@Override
	public void offers() {
		// TODO Auto-generated method stub
		System.out.println("offers[ coupon_id :- "+coupon_id+" "+"coupon_code :- "+coupon_code+" "+"discount :- "+discount+"]");
	}

	
	
}
