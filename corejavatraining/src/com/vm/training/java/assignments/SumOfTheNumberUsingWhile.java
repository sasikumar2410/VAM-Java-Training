package com.vm.training.java.assignments;

import java.util.Scanner;

public class SumOfTheNumberUsingWhile 
{
	
    static int sum(int[] a,int n)
    {
    	int sum=0;
    	int i=0;
    	while(n!=0)
    	{
    		sum+=a[i];
    		i++;
    		n--;
    	}
    	return sum;
        	
    }
	public static void main(String[] sasi)
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println(sum(a, n));
	}

}
