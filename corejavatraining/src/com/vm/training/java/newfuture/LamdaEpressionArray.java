package com.vm.training.java.newfuture;

import java.util.Scanner;

@FunctionalInterface
interface SmallestNumber
{
	int small(int n);
}
@FunctionalInterface
interface SumOfArray
{
	int sum(int n);
}


public class LamdaEpressionArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 SmallestNumber sn=(n)->
		 {
			int sum=0; 
			System.out.println("the size of array :"+n);
			int[] a=new int[n];
			int min=10000;
			for(int i=0;i<n;i++)
			{ 
				a[i]=sc.nextInt();
				if(a[i]<min)
				{
					min=a[i];
				}
			}
			return min;
		 };
		System.out.println("The smallest number in the array is: "+sn.small(5));
		
		
		System.out.println("============================");
		SumOfArray soa=(n)->
		 {
			int sum=0; 
			System.out.println("the size of array :"+n);
			int[] a=new int[n];
			int min=10000;
			for(int i=0;i<n;i++)
			{ 
				a[i]=sc.nextInt();
				sum+=a[i];
			}
			return sum;
		 };
			System.out.println("The sum of the array is: "+soa.sum(5));

	}

}
