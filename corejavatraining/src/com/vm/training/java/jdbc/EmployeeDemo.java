package com.vm.training.java.jdbc;
import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

public class EmployeeDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("driver class loaded");

			// Step-2
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vam.sql.training?autoReconnect=true&useSSL=false", "root", "root");
			System.out.println("Connected");
			System.out.println("please enter the option");
			System.out.println("1.add employee");
			System.out.println("2.display");
			System.out.println("3.display employee by id");
			int number = sc.nextInt();
			PreparedStatement ps=con.prepareStatement("insert into employee values(?,?,?,?,?)");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from employee");
			switch(number) {
			case 1:
				int id=sc.nextInt();
				String name=sc.next();
				int salary=sc.nextInt();
				String department=sc.next();
				int age=sc.nextInt();
				ps.setInt(1, id);
				ps.setString(2, name);
				ps.setInt(3, salary);
				ps.setString(4, department);
				ps.setInt(5, age);
				ps.execute();
				System.out.println("Employee details added successfully");

			case 2:
				


				while(rs.next()) {
					System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4)+" "+rs.getInt(5)); 
				}


			case 3:
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
		catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}

}