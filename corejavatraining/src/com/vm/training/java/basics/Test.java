package com.vm.training.java.basics;
import com.vm.training.java.oops.Employee;
public class Test extends Employee 
{

	

	public Test(int empId, String empName, String dpt) {
		//super(empId, empName, dpt);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Test t2=new Test(5733,"sasi","d&c");
		System.out.println(t2.emId);
	}

}
