package com.vm.training.java.multithreading;
class Sasi extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			/*
			 * try { sleep(2000); } catch (InterruptedException e) { // TODO Auto-generated
			 * catch block e.printStackTrace(); }
			 */
			if(i==6)
				stop();
			System.out.println("Sasi "+i);
		}
	}
} 
class Shashank extends Thread
{
	public void run()
	{
		for(int i=11;i<=20;i++)
		{
			System.out.println("Shashank "+i);
		}
	}
} 
class Maniteja extends Thread
{
	public void run()
	{
		for(int i=21;i<=30;i++)
		{
			System.out.println("Maniteja "+i);
		}
	}
} 
public class MultiTaskingDemo {
	public static void main(String[] args) {
		Sasi sasi=new Sasi();
		Shashank shashi= new Shashank();
		Maniteja mani=new Maniteja();
		
		
		
		  sasi.run();
		  shashi.run();
		  mani.run();
		 
		
		System.out.println("===START METHOD======");
		
		
		sasi.start();
		shashi.start();
		mani.start();
		
		}
}
