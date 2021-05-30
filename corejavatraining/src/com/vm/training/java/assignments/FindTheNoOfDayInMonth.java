package com.vm.training.java.assignments;

import java.util.Scanner;

public class FindTheNoOfDayInMonth {
	static void days(int month,int year)
	{
		if(month==1||month==3||month==5||month==7||month==8||month==10||month==12)
		{
			System.out.println("Number of Days is 31");
		}
		else if((month==2)&&((year%400==0)||(year%4==0&&year%100!=0)))
				{
					System.out.println("Number of Days is 29");
				}
		else if(month==2)
			System.out.println("Number of Days is 28");
		else
			System.out.println("Number of Days is 30");
	}
	public static void main(String[] sasi)
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		days(a, b);

	}

}
