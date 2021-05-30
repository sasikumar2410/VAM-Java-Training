package com.vm.training.java.oops;

public class EmployeeGetterSetter
{
	public static void main(String[] args) {

		//assigning the values to the customer by using setter method
		Employee employee=new Employee();
		employee.setEmId(5733);
		employee.setEmpName("sasi kumar");
		employee.setDpt("D&C");
		//printing the customer information using getter method 
		System.out.println(employee.getEmId());
		System.out.println(employee.getEmpName());
		System.out.println(employee.getDpt());
	}

}
