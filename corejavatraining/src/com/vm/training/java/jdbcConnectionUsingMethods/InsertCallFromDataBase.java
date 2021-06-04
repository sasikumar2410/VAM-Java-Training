package com.vm.training.java.jdbcConnectionUsingMethods;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;



public class InsertCallFromDataBase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try 
		{
			Connection con = DBConnection.getConnection();
			CallableStatement callstmt =con.prepareCall("call InsertTheData(?,?,?,?,?)");
			
			callstmt.setInt(1, 3); 
			callstmt.setString(2, "Nikhil");
			callstmt.setString(3, "R&D");
			callstmt.setInt(4, 72000);
			callstmt.setInt(5, 20);
			callstmt.execute();	
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

}
