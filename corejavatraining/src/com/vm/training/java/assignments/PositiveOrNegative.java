package com.vm.training.java.assignments;
import java.util.*;
import java.io.*;
@SuppressWarnings("unused")
public class PositiveOrNegative {
	static void prn(long n)
	{
		if(n<=0)
		{	
			//if number is Zero then it will go into else statement it stops at if condition
			if(n==0)
			{
				System.out.println("The number is Zero");
			}
			//else condition is for to weather number is -ve r not
			else
				System.out.println("The number is Negative");
		}
		//else condition is for to weather number is +ve r not
		else
		{
			System.out.println("The number is Positive");
		}
	}

	@SuppressWarnings("resource")
	public static void main(String[] sasi) {
		// TODO Auto-generated method stub
		//Scanner class is used to read the input from user
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		//prn() is a method call to know weather the number is -ve or +ve
		prn(number);
	}

}
