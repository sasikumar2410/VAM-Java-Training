package com.vm.training.java.AssignmentOnCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;
import java.io.*;

public class StudentMarks
{
	/**
	 * this method is used to print the higest mark in the list
	 * @param al
	 */
	static void highestmark (ArrayList<Integer> al)
	{
		int max=1;
		for (Integer integer : al) {
			if(max<integer)
			{
				max=integer;
			}
		}
		System.out.println(max);
	}
	
	/**
	 * this method is use to print the Average of the marks optained by the students 
	 * @param al
	 */
	static void avgOfMarkes(ArrayList<Integer> al,int n)
	{
		int avg=0;
		for (Integer integer : al) {
			avg+=integer;
		}
		int sum=avg/n;
		System.out.println(sum);
	}
	/**
	 * this methos is used to print the paticuler person marks 
	 * @param al
	 * @param n
	 */
	static void sortOfList(ArrayList<Integer> al,int n)
	{
		int count=0;
		for (Integer integer : al) {
			count++;
			if(count==n)
			{
				System.out.println(integer);
			}
		}
	}
	
	/**
	 * this method is used to print the arrayList in Sorted order
	 * @param al
	 */
	static void sortOfArray(ArrayList<Integer> al)
	{
		Collections.sort(al);
		Iterator itr=al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
	
	
	public static void main(String[] args)
	{
		ArrayList<Integer> al=new ArrayList<Integer>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of students :");
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			int marks;
			System.out.println("Enter the marks of "+i+"st"+" "+"Student :");
			marks=sc.nextInt();
			al.add(marks);
		}
		System.out.println("=======highest mark========="); 
		highestmark(al);
		System.out.println("=======Average of marks======");
		avgOfMarkes(al,n);
		System.out.println("=======print the paticuler person======");
		System.out.println("Emter the paticuler person id ");
		int m=sc.nextInt();
		sortOfList(al,m);
		System.out.println("======Sorted ArrayList========");
		sortOfArray(al);
	}

}
