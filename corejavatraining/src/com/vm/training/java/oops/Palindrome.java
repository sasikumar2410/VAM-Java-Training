package com.vm.training.java.oops;

import java.util.Scanner;

public class Palindrome 
{
 public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	StringBuffer stringBuffer=new StringBuffer(s);
	String string= stringBuffer.reverse().toString();
	//String string=stringBuffer;
	System.out.println(stringBuffer);
	System.out.println(s);
	if(s.equals(string))
	{
		System.out.println("it is pal");
	}
	else
	{
		System.out.println("it is not apal");
	}
	
}
}
