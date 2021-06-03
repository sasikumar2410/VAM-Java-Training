package com.vm.training.java.jdbc;

import java.sql.DriverManager;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			//step 1
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Successfully loaded ");
			//step 2
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/vam.sql.training?autoReconnect=true&useSSL=false","root","root");  
			System.out.println("connected to database ");
			
		    //step 3
			Statement stm=con.createStatement();
			//stm.execute("create table classroom(id int,student_name varchar(10))");
			//System.out.println("Table Created successfully");
			stm.execute("insert into classroom values(354,'Sasi')");
			System.out.println("data added successfully");

		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
