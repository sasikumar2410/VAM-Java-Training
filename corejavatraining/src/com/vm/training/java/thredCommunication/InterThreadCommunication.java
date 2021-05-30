package com.vm.training.java.thredCommunication;

public class InterThreadCommunication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer customer=new Customer();
		Thread t1=new Thread()
				{
				 	public void run()
				 	{
				 		System.out.println(customer.deposit(10000));
				 	}
				};
		Thread t2=new Thread()
				{
					public void run()
					{
						System.out.println(customer.withdraw(1000));
					}
				};
				
			t1.setName("sasi");
			t2.setName("Shashank");
			
			
			t1.start();
			t2.start();
	}

}
