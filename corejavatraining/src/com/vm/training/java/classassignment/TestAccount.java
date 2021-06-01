package com.vm.training.java.classassignment;

public class TestAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SavingAccount sa=new SavingAccount(10000,2);
		System.out.println("=======Deposit=============");
		sa.deposit(1000);
		System.out.println("=======WithDraw===========");
		sa.withdraw(5000);
		System.out.println("=======addIntrest==========");
		sa.addInterest();
	}

}
