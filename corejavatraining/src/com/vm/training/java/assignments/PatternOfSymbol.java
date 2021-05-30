package com.vm.training.java.assignments;

import java.util.Scanner;

public class PatternOfSymbol {
	static void patternsymbol(int n)
	{
		//frist loop is for spaces
		for(int i=1;i<=n;i++)
		{
			//second loop is for printing the numbers in pattern
			for(int j=1;j<=i;j++)
			{
				System.out.print("@"+" ");
			}
			System.out.println(" ");
		}
	}
	public static void main(String[] sasi) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		patternsymbol(n);
	}

}
