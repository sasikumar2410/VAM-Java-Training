package com.vm.training.java.assignments;

import java.util.Scanner;

public class NoOfDigitsInNumber {

	static void noofdigitd(int n)
	{
		int count=0;
		while(n!=0)
		{
			n/=10;
			count++;
		}
		System.out.println(count);
	}
	public static void main(String[] sasi) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int i=sc.nextInt();
		noofdigitd(i);
	}

}
