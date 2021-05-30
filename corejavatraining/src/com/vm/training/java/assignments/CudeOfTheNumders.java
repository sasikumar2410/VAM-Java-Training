package com.vm.training.java.assignments;

import java.util.Scanner;

public class CudeOfTheNumders 
{
	static void cudeofnumber(int a)
	{
		for(int i=1;i<=4;i++)
			System.out.println("The cude of the number "+i+" is :"+(i*i*i));
	}
	public static void main(String[] sasi) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		cudeofnumber(a);
	}

}
