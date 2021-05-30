package com.vm.training.java.thredCommunication;

public class Customer {
	int balance=5000;
	
	
	synchronized public int withdraw(int amount)  
	{

		if(balance<amount)
		{
			System.out.println("Amount is insfficent");
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(Thread.currentThread().getName()+" is going to withdraw");
		balance-=amount;
		return balance;
	}
	synchronized public int deposit(int amount)
	{
		
		
		System.out.println(Thread.currentThread().getName()+" Amount is deposited");
		balance+=amount;
		return balance;
	}
}
