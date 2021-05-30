package com.vm.training.java.oops;

class Bank
{
	protected void RateOfIntrest()
	
	{
		System.out.println("2%");
	}
	static void Lone()

	{
		System.out.println("100000");
	}
}
class Axis extends Bank
{
	public void RateOfIntrest()

	{
		System.out.println("4%");
	}

}
class Sbi extends Bank
{
	public void RateOfIntrest()

	{
		System.out.println("1%");
	}

}
public class OverrideDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank b=new Sbi();
		b.RateOfIntrest();
	}

}
