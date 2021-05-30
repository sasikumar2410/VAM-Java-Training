package com.vm.training.java.assignments;

import java.util.Scanner;

public class FibonacciSeries {
	static void fibonaci(int n)
	{
		int t1=0,t2=1;
		//f is used as fibonaci variable
		int f=t1+t2;
		//this loop is use to generate fibonaci series
		
		System.out.print(t1+" "+t2+" ");
		for(int i=1;i<=n;i++)
		{
			System.out.print(f+" ");
			t1=t2;
			t2=f;
			f=t1+t2;
			
		}
	}
	public static void main(String[] sasi) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		fibonaci(n);
	}

}
