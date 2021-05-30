package com.vm.training.java.oops;

public class TestAggregation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		showAggregation();
		System.out.println("---------------------------------------------------");
		showComposition();
	}

	public static void showAggregation()
	{
		//assigning the values to the feilds of address class by using setters and it is not independent on employeeaggregation
		Address address=new Address();
		address.setCity("Tiruvuru");
		address.setState("AP");
		address.setCountry("India");

		//assigning the values to the feilds of employeaggregation class by using setters
		EmployeeAggregation employeeagg=new EmployeeAggregation();
		employeeagg.setEmployeId(5733);
		employeeagg.setEmpFirstName("SASI");
		employeeagg.setEmpLastName("KUMAR");
		employeeagg.setAddresss(address);



		System.out.println(employeeagg);

		System.out.println("-----------------------");
		//making the employeeaggregation null 
		employeeagg=null;
		System.out.println(employeeagg);
		System.out.println(address);

	}
	@SuppressWarnings("unused")
	static void showComposition()
	{
		//assigning the values to the fields of address class by using setters and it is dependent on personaggregation
		
		  Address address=new Address(); 
		  address.setCity("Tiruvuru");
		  address.setState("AP");
		  address.setCountry("India");
		 
		
		//assigning the values to the fields of personaggregation class by using setters
		PersonAggregation personagg=new PersonAggregation();
		personagg.setPersonId(5728);
		personagg.setPersonFirstName("shashank");
		personagg.setPersonLastName("Bompally");
		personagg.setAddresss(address);
		
		System.out.println(personagg);
		
		System.out.println("-------------------------------");
		
		personagg=null;
		System.out.println(personagg);
		if(personagg!=null)
			System.out.println(address);
		else
			System.out.println("No address");
	}
}
