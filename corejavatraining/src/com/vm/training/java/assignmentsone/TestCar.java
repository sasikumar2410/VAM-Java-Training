package com.vm.training.java.assignmentsone;

public class TestCar {

	  public static void main(String[] args) {
	    // TODO Auto-generated method stub
	Car car=new Car(1965, "bat mobile");
	for(int i=0;i<5;i++)
	{
	car.accelerater();
	System.out.println("Current speed is"+car.getSpeed());
	}
	for(int i=0;i<5;i++)
	{
	car.brake();
	System.out.println("Current speed is"+car.getSpeed());
	}
}
}