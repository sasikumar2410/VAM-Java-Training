package com.vm.training.java.assignments;

import java.util.Scanner;

public class SumAndAverage {
	static String sumandaverage(int a,int b,int c,int d,int e)
	{
		int sum=0;
		int avg;
		sum=a+b+c+d+e;
		avg=sum/2;
		return "The sum of numbers is :"+sum+"\n"+"The avg of numbers is:"+avg;
	}
	public static void main(String[] sasi) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int d=sc.nextInt();
		int e=sc.nextInt();
		System.out.println(sumandaverage(a, b, c, d, e));
	}

}
