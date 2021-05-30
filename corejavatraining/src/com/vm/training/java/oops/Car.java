package com.vm.training.java.oops;
//car is an abstract class implements the inerface IVehicle
public abstract class Car implements IVehicle
{

	String model;
	Car(String model)
	{
		this.model=model;
	}
	@Override
	public void steering() {
		// TODO Auto-generated method stub
		System.out.println("power steering");
	}

	@Override
	public void breaks() {
		// TODO Auto-generated method stub
		System.out.println("disk break");
	}

	@Override
	public void accelarator() {
		// TODO Auto-generated method stub
		System.out.println("based on momentum");
	}

	@Override
	public void clutch() {
		// TODO Auto-generated method stub
		System.out.println("based on gears");
	}

	@Override
	public int gears() {
		// TODO Auto-generated method stub
		return 6;
	}
	abstract void ac();
	abstract void indicators();

}
