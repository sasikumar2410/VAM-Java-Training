package com.vm.training.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class ReteriveDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stubtry
		try{
		//step 1
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Successfully loaded ");
		//step 2
		System.out.println("==========================");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/vam.sql.training?autoReconnect=true&useSSL=false","root","root");
		System.out.println("connected to database ");
		//step 3
		System.out.println("==========================");
		Statement stm=con.createStatement();
		ResultSet rs=stm.executeQuery("select *from product");
		
		while(rs.next())
			{
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
			}
		
		System.out.println("=================================");
		ResultSetMetaData rsm=rs.getMetaData();
		 System.out.println(rsm.getColumnName(1)+"|\t|"+rsm.getColumnName(2)+"|\t|"+rsm.getColumnName(3));
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		
	}

}
