package com.vm.training.java.assignments;

import java.util.Scanner;

public class NumbersInBetweenRange {

	static void range(int a,int b)
	{
		do {
			System.out.print(a+" ");
			a++;
		}
		while(a<=b);
	}
	public static void main(String[] sasi)
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		range(a,b);
	}

}
