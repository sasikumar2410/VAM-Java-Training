package com.vm.training.java.oops;

public class Bus implements IVehicle {

	@Override
	public void steering() {
		// TODO Auto-generated method stub
		System.out.println("power steerong");
	}

	@Override
	public void breaks() {
		// TODO Auto-generated method stub
		System.out.println("volvo breaks");
	}

	@Override
	public void accelarator() {
		// TODO Auto-generated method stub
		System.out.println("weight of the vehicle");
	}

	@Override
	public void clutch() {
		// TODO Auto-generated method stub
		System.out.println("no idea");
		
	}

	@Override
	public int gears() {
		// TODO Auto-generated method stub
		return 6;
	}

}
