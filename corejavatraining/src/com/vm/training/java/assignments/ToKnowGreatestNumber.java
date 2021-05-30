package com.vm.training.java.assignments;

public class ToKnowGreatestNumber {
	static void gn(int a,int b,int c)
	{
		if(a>b&&a>c)
			System.out.println("The greatest number is:"+" "+a);
		else if(b>a&&b>c)
			System.out.println("The greatest number is:"+" "+b);
		else
			System.out.println("The greatest number is:"+" "+c);
	}

	public static void main(String[] sasi)
	{
		// TODO Auto-generated method stub
		int a=25;
		int b=78;
		int c=87;
		gn(a,b,c);
	}

}
