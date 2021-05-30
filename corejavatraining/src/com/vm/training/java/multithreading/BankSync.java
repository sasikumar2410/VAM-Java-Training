package com.vm.training.java.multithreading;
class Bank
{
	synchronized public void withdraw(int n)
	{
		for(int i=1;i<=5;i++)
			System.out.println(Thread.currentThread().getName()+" is :"+n+" "+"withdraw");
	}
	synchronized public void deposit(int n)
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(Thread.currentThread().getName()+" is :"+n+" "+"deposit");
		}
	}
}

class Account implements Runnable
{
	Bank bank=new Bank();
	@Override
	 public void run() {
		// TODO Auto-generated method stub
		bank.deposit(1000);
		bank.withdraw(100);
		
	}
	
}
public class BankSync {
 public static void main(String[] args) {
	Account account=new Account();
	Thread sasi=new Thread(account);
	Thread shashank=new Thread(account);
	
	sasi.setName("Sasi");
	shashank.setName("Shashank");
	
	
	sasi.start();
	shashank.start();
}
}
