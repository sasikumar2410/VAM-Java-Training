package com.vm.training.java.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.*;


class Employee
{
	int employee_id;
	String employee_name;
	public Employee(int employee_id, String employee_name) {
		super();
		this.employee_id = employee_id;
		this.employee_name = employee_name;
	}
	@Override
	public String toString() {
		return "Employee [employee_id=" + employee_id + ", employee_name=" + employee_name + "]";
	}

}
class EmployeeDetails extends Employee
{
	String address;
	String pancard;
	public EmployeeDetails(int employee_id, String employee_name, String address, String pancard) {
		super(employee_id, employee_name);
		this.address = address;
		this.pancard = pancard;
	}
	@Override
	public String toString() {
		return "EmployeeDetails [address=" + address + ", pancard=" + pancard + ", employee_id=" + employee_id
				+ ", employee_name=" + employee_name + "]";
	}
	

}
public class SetTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * HashSet hs=new HashSet(); hs.add(new EmployeeDetails(5733,
		 * "Sasi kumar","tiruvuru", "CEZ245F"));
		 * System.out.println("Output of HassSet"); System.out.println(hs);
		 * 
		 * Employee e1=new EmployeeDetails(5733, "Sasi kumar", "Tiruvuru","CEZ245F");
		 * ArrayList<Employee> arraylist=new ArrayList(); arraylist.add(e1);
		 * System.out.println("Output of ArrayList"); System.out.println(arraylist);
		 */	
		/*
		 * ArrayList a=new ArrayList(); a.add("abc"); a.add("def"); a.add("ghi");
		 * a.add(new Integer(12)); System.out.println(a); String s=(String)a.get(1);
		 * System.out.println(s); String s1=(String)a.get(3);
		 */
		HashMap hs=new HashMap<>();
		hs.put(5733,"sasi");
		System.out.println(hs);
	}

}
