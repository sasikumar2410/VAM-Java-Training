package com.vm.training.java.exceptionhabler;
import java.util.Scanner;
public class TestHdfc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  HDFC withdraw = new HDFC();
		   Scanner input = new Scanner(System.in);
		   System.out.println("Enter Withdrawl Ammount");
		   int withdrawl=input.nextInt();
		   int minBalance =10000;
		   int balance=100000;
		   withdraw.balanceInAccount(balance, minBalance, withdrawl);
		   withdraw.withdrawing();

	}

}
