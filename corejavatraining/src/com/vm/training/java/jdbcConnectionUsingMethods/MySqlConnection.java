package com.vm.training.java.jdbcConnectionUsingMethods;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class MySqlConnection {

	public static void main(String[] args) {
		try {
			Connection con=DBConnection.getConnection();
			System.out.println("Connected");
			System.out.println("please enter the option");
			System.out.println("1.add employee");
			System.out.println("2.display");
			System.out.println("3.display employee by id");
			Scanner sc=new Scanner(System.in);
			int number = sc.nextInt();
			//PreparedStatement ps=con.prepareStatement("insert into employee values(?,?,?,?,?)");
			//Statement stmt = con.createStatement();
			//ResultSet rs = stmt.executeQuery("select * from employee");
			switch(number) {
			case 1:
				Employee employee=new Employee();
				employee.setEmpid(sc.nextInt());
				employee.setEmpname(sc.next());
				employee.setLob(sc.next());
				employee.setSalary(sc.nextInt());
				employee.setAge(sc.nextInt());
				EmployeeDAO.addEmployee(employee);
				System.out.println("Employee details added successfully");

			case 2:
				Employee employee1=new Employee();
				EmployeeDAO.viewAll(employee1);
			case 3:
				Employee employee2=new Employee();
				EmployeeDAO.displayById(employee2);
			}
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
