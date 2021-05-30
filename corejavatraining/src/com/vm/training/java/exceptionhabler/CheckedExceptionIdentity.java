package com.vm.training.java.exceptionhabler;

public class CheckedExceptionIdentity {
	public static void main(String[] args) {
		try
		{
			System.out.println(4/0);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}

