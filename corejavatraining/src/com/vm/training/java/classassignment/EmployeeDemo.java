package com.vm.training.java.classassignment;

import java.util.Scanner;

public class EmployeeDemo {
	private String firstName;
	private String lastName;
	/**
	 * This is the constructor of class EmployeeDemo with parameters of class variables 
	 * @param firstName
	 * @param lastName
	 */
	public EmployeeDemo(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	/**
	 * Main method of the class EmplyeeDemo
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first name :");
		String firstname=sc.next();
		System.out.println("Enter last name :");
		String lastName=sc.next();
		/**
		 * try and catch block which is used to catch the exception thrown by the EmployeeDemo class
		 */
		try
		{
			if(firstname.isEmpty()&& lastName.isEmpty())
			{
				throw new NullPointerException("Entry missing");
			}
			else if(firstname.length()<=3&&lastName.length()<=3)
			{
				throw new Exception("Please enter atleast 3 characters");
			}
			else
			{
				System.out.println("First_name :"+firstname+"  "+"Last_name :"+lastName);
			}
		}
		
		catch(NullPointerException e)
		{
			e.printStackTrace();
		}
		catch(Exception e1)
		{
			e1.printStackTrace();
		}
	}

}

