package com.vm.training.java.oops;

public class CustomerGetterSetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer customer=new Customer();
		//assigning the values to the customer by using setter method
		customer.setId(5733);
		customer.setFirstName("sasi");
		customer.setLastName("kumar");
		customer.setAccount("current");
		//printing the customer information using getter method 
		System.out.println(customer.getId());
		System.out.println(customer.getFirstName());
		System.out.println(customer.getLastName());
		System.out.println(customer.getAccount());
	}

}
