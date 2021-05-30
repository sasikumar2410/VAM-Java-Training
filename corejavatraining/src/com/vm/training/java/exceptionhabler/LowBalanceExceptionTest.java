package com.vm.training.java.exceptionhabler;
import java.util.Scanner;
public class LowBalanceExceptionTest {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int balance=sc.nextInt();
		try {
		if(balance<1000)
		{
			throw new LowBalanceException("Your balance is less than 1000");
		}
		else
		{
			System.out.println("Your balance is : "+balance);
		}
	}
 catch(LowBalanceException e)
		{
	 		e.printStackTrace();
		}
}
}