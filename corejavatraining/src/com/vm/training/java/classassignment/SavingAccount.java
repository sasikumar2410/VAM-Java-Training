package com.vm.training.java.classassignment;

public class SavingAccount {
	private double balance;
	private double interest;
    /**
     * This was the constructor of calss SavingAccount by parameter of class variable
     * @param balance
     * @param interest
     */
	public SavingAccount(int balance, double interest) {
		super();
		this.balance = balance;
		this.interest = interest;
	}
	/**
	 * this method displays the deposit
	 * @param amount
	 * @return 
	 */
	public void deposit(int amount)
	{
		balance =balance + amount;
		System.out.println(balance);
	}
	/**
	 * 	 * this method displays the withdraw
	 * @param amount
	 */
	public void withdraw(int amount)
	{
		balance =balance - amount;
		System.out.println(balance);
	}
 /**
  * this method displays the addIntrest
  */
	public void addInterest()
	{
		balance =(balance + balance * interest);
		System.out.println(balance);
	}

	public double getBalance()
	{
		return balance;
	}


}
