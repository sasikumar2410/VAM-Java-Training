package com.vm.training.java.oops;

import java.util.Scanner;

public class TwiceTheNumber 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n,count=0;
		System.out.println("Enter the size of the Array");
		n=sc.nextInt();
		int[] array=new int[n];
		for(int i=0;i<n;i++)
		{
			array[i]=sc.nextInt();
		}
			
		for(int i=0;i<n;i++)
		{
			for(int k=i;k<n;k++)
			{
				if(array[i]==array[k])
				{
					count++;
				}
			}
			if(count>1)
			{
				System.out.println(array[i]);
			}
			count=0;
		}
		
	}

}
