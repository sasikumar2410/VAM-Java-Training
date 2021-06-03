package com.vm.training.java.jdbcConnectionUsingMethods;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class EmployeeDAO
{
 /**
  * add elements to employee table in database
  * @param employee
  * @throws Exception
  */
 public static void addEmployee(Employee employee) throws Exception
 {
	 Connection con=DBConnection.getConnection();
	 PreparedStatement ps=con.prepareStatement("insert into employee values(?,?,?,?,?)");
	 //Scanner sc=new Scanner(System.in);
	 ps.setInt(1, employee.getEmpid());
	 ps.setString(2, employee.getEmpname());
	 ps.setString(3,employee.getLob());
	 ps.setInt(4,employee.getSalary());
	 ps.setInt(5,employee.getAge());
	 ps.execute();
 }
 /**
  * this method is used to print all table data
  * @param employee
  * @throws Exception
  */
 public static void viewAll(Employee employee) throws Exception
 {
	 Connection con=DBConnection.getConnection();
	 PreparedStatement ps=con.prepareStatement("insert into employee values(?,?,?,?,?)");
	 Statement stmt = con.createStatement();
	 ResultSet rs = stmt.executeQuery("select * from employee");
	 while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4)+" "+rs.getInt(5)); 
		}
 }
 /**
  * This method is used to display the data of table only by the id
  * @param employee
  * @throws Exception
  */
 public static void displayById(Employee employee) throws Exception
 {
	 Connection con=DBConnection.getConnection(); 
	 Scanner sc=new Scanner(System.in);
	 int id1=sc.nextInt();
		PreparedStatement ps1=con.prepareStatement("select * from employee where empid=?");
		ps1.setInt(1, id1);
		ResultSet rs1=ps1.executeQuery();
		while(rs1.next()) {
			System.out.println(rs1.getInt(1)+" "+rs1.getString(2)+" "+rs1.getString(3)+" "+rs1.getInt(4)+" "+rs1
					.getInt(5)); 
							}

 }
}
