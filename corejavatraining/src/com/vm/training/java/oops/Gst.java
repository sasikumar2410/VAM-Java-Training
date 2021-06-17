package com.vm.training.java.oops;

public class Gst extends IncomeTax {

	@Override
	int claculateTax(int income) {
		// TODO Auto-generated method stub
		return super.claculateTax(income);
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		
		
		Gst gst=new Gst();
		System.out.println(gst.claculateTax(5000));

	}

	
}
