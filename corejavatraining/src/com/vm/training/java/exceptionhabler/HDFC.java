package com.vm.training.java.exceptionhabler;

public class HDFC implements IBank
{
 int balance;
 int minBalance;
 int withdrawl;
 public void balanceInAccount(int balance,int minBalance,int withdrawl) {
  this.balance=balance;
  this.minBalance=minBalance;
  this.withdrawl=withdrawl;
 }
 void withdrawing()
 {
  try
  {
  if(balance>minBalance&&(balance-minBalance)>(minBalance+200))
  {
   System.out.println("After withdrawing Balance:"+(balance-withdrawl));
   
  }
  else
  {
	  throw new MaintainMinimumBalance("You are maintining your minimum balance");
  }
  
  if(balance>minBalance&&balance-minBalance>minBalance)
  {
   System.out.println("After withdrawing Balance:"+(balance-withdrawl));
   }
  else
  {
	   throw new AverageMonthlyCharges("Charges are More when balance is less than 10000");
  }
  if(balance-withdrawl<=minBalance)
  {
   throw new LowBalanceException("The Amount tour trying to withdraw is making your bank balance lower than min balance so you can not withdraw that much amount");
  }
  else
  {
	  System.out.println("Yes you can withdraw amount what you enterd");
  }
  if(balance<minBalance)
  {
   throw new MoneyOnHold("Your balance is less than so your account on hold ");
  }
  else
  {
	  System.out.println("Your account is Active");
  }
  }
  catch (MaintainMinimumBalance e1) {
   e1.printStackTrace();
  }
  catch (AverageMonthlyCharges e2) {
   e2.printStackTrace();
   // TODO: handle exception
  }
  catch (LowBalanceException e3) {
   e3.printStackTrace();
   // TODO: handle exception
  }
  catch (MoneyOnHold e4) {
   e4.printStackTrace();
   // TODO: handle exception
  }
 }
}