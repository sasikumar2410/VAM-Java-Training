package com.vm.training.java.basics;

public class FirstProg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<args.length;i++)
		{
			System.out.println(args[i]);
		}
		System.out.println("Welcome to valuemomemtum");	


		//commandline arguments
		String a=args[0];
		String b=args[1];
		System.out.println(a+b);


		//data type convertertion
		   int a1=Integer.parseInt(args[0]);
		   int b1=Integer.parseInt(args[1]);
		   System.out.println(a+b);
	}

}
