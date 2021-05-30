package com.vm.training.java.exceptionhabler;

public class ExceptionHandler
{
	public static void main(String[] args)throws Exception  {
		int[] i= {1,2};
		int num1=10;
		//int rem=num1/0;
		int rem1=num1/2;
		try {
			//System.out.println(i[2]);
			System.out.println(i[1]);
			System.out.println(num1);
			//System.out.println(rem);
			System.out.println(rem1);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
