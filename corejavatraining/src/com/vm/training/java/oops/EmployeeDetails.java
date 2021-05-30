package com.vm.training.java.oops;

public class EmployeeDetails extends EmployeeOne {
	String email;
	String phno;
	String add;
	public EmployeeDetails(int i, String empName, String dpt, String email, String phno, String add) {
		super(i, empName, dpt);
		this.email = email;
		this.phno = phno;
		this.add = add;
	}
	public String toString()
	{
		return i+" "+empName+" "+dpt+" "+email+" "+phno+" "+add;
	}
	public static void main(String[] sasi )
	{
		EmployeeDetails ed=new EmployeeDetails(100,"sasi","D&C","a@d.com","12345","tiruvuru");
		System.out.println(ed);
	}

}
