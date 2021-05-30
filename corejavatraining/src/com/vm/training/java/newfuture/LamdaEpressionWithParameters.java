package com.vm.training.java.newfuture;


@FunctionalInterface
interface Calculater
{
	void add(int a,int b);
}
@FunctionalInterface
interface Calculater1
{
	int multiply(int a,int b);
}
@FunctionalInterface
interface LargestNumber
{
	int larger(int a,int b);
}

public class LamdaEpressionWithParameters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculater c=(a,b)->System.out.println("addtion of two numbers "+(a+b));
		c.add(5, 6);
		
		System.out.println("=======================================");
		
		Calculater1 c1=(a,b)->(a*b);
		System.out.println("Multiply of two numbers "+c1.multiply(25, 25));
		
		System.out.println("=======================================");
		
		LargestNumber ln=(a,b)->
		{
			if(a>b)
			{
				return a;
			}
			else
			{
				return b;
			}
			
		};
		System.out.println("Largest of two numbers is "+ln.larger(100, 99));
	}

}
