package com.vm.training.java.oops;

public class Calculater 
{
	int num1,num2,sum=0;long num3,num4,l=0;
	
	/*public Calculater(int num1, int num2, int sum) {
		super();
		this.num1 = num1;
		this.num2 = num2;
		this.sum = sum;}*/

	int add(int num1,int num2)
	{
		sum=num1+num2;
		return sum;
	}
	
	long add(int num1,int num2,long num3)
	{
		l=num1+num2+num3;
		return l;
	}
	
	long add(int num1,int num2,long num3,long num4)
	{
		l=num1+num2+num4+num3;
		return l;
	}
}
