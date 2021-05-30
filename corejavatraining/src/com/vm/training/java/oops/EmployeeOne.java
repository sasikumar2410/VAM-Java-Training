package com.vm.training.java.oops;

public class EmployeeOne 
{
	int i;
	String empName;
	String dpt;
	public EmployeeOne(int i, String empName, String dpt) {
		super();
		this.i = i;
		this.empName = empName;
		this.dpt = dpt;
	}
	public EmployeeOne() {
		super();
	}
	/*public String toString()
	{
		return  (i+" "+empName+"  "+dpt) ;
		
	}*/
	
	public static void main(String[] sasi)
	{
		EmployeeOne e1=new EmployeeOne();
		EmployeeOne e2=new EmployeeOne(5733,"SasikumarGadiparthi","D&C");
		System.out.println(e1);
		System.out.println(e2);
	}
}
