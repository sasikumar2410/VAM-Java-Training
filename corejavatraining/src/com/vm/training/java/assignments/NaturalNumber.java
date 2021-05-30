package com.vm.training.java.assignments;

import java.util.Scanner;

public class NaturalNumber {
	static void naturalnumber(int a)
	{
		for(int i=1;i<=a;i++)
		{
			System.out.println(i);
		}
	}

	public static void main(String[] sasi)
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		naturalnumber(a);
	}

}
