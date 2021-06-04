package com.vm.training.java.jdbcConnectionUsingMethods;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;



public class ProcedureStoreCall {

	public static void main(String[] args) {
		try 
		{
			Connection con = DBConnection.getConnection();
			CallableStatement callstmt = con.prepareCall("{call findAllRecord}");
			ResultSet rs = callstmt.executeQuery();
			
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+" "+rs.getString(2));
			}
				
				
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}

	}

}
