package com.vm.training.java.oops;

public class TestInterFace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IVehicle vehicle=new Bus();
		vehicle.steering();
		vehicle.accelarator();
		vehicle.breaks();
		vehicle.clutch();
		System.out.println(vehicle.gears());//vehicle.gears();
		Car c1=new Bmw("X5");
		c1.ac();
		c1.accelarator();
		c1.breaks();
		c1.clutch();
		c1.gears();
		c1.indicators();
		c1.steering();
	}

}
