package com.vm.training.java.newfuture;
interface Bank
{
	default void  OpenAccount()
	{
		System.out.println("u can open account");
	}
	static void holiday()
	{
		System.out.println("2 to 3 days");
	}
	abstract int minbalance(int n);
	abstract int rateofintrest(int n);
}
class Axis implements Bank
{

	@Override
	public int minbalance(int n) {
		// TODO Auto-generated method stub
		return n;
	}

	@Override
	public int rateofintrest(int n) {
		// TODO Auto-generated method stub
		return n;
	}
	
}
public class NewInterfaceDemo {

	public static void main(String[] args) {
		Bank bank=new Axis();
		System.out.println(bank.minbalance(1000));
		System.out.println(bank.rateofintrest(2));
		bank.OpenAccount();
		Bank.holiday();
	}

}
