package com.vm.training.java.multithreading;


class Bottle
{
	synchronized public void drink(int n)
	{
		for(int i=1;i<=n;i++)
			System.out.println(Thread.currentThread().getName()+" is :"+i);
	}
}

class DrinkWater implements Runnable
{
	Bottle bottle=new Bottle();
	@Override
	public void run() {
		// TODO Auto-generated method stub
		bottle.drink(6);
	}
	
}


public class SynchronizationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DrinkWater drinkwater=new DrinkWater();
		Thread sasi=new Thread(drinkwater);
		Thread shashank=new Thread(drinkwater);
		
		
		sasi.setName("Sasi");
		shashank.setName("Shashank");
		
		
		sasi.start();
		shashank.start();
	}

}
