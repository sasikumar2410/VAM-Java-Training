package com.vm.training.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;
public class PreparedStatementDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//step 1
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Successfully loaded ");
			//step 2
			System.out.println("==========================");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/vam.sql.training?autoReconnect=true&useSSL=false","root","root");
			System.out.println("connected to database ");
			System.out.println("===========================");
			PreparedStatement ps=con.prepareStatement("insert into product values(?,?,?)");
			Scanner sc=new Scanner(System.in);
			int id=sc.nextInt();
			String p_name=sc.next();
			int p_price=sc.nextInt();
			ps.setInt(1,id);
			ps.setString(2,p_name);
			ps.setInt(3,p_price);
			ps.execute();
			System.out.println("added successfully");
			System.out.println("===========================");
			Statement stm1=con.createStatement();
			ResultSet rs=stm1.executeQuery("select *from product");
			while(rs.next())
				{
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
				}
			
			System.out.println("=================================");
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
	}

}
