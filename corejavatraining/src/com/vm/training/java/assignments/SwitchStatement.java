package com.vm.training.java.assignments;
import java.util.*;
import java.io.*;
@SuppressWarnings("unused")
public class SwitchStatement {
	static void weekOfTheDay(int a)
	{
		switch(a)
		{
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		}
	}

	public static void main(String[] sasi) {
		// TODO Auto-generated method stub
		//Scanner class is used to read the input from user
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		weekOfTheDay(a);
	}

}
