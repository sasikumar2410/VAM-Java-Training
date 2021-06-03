package com.vm.training.java.jdbcConnectionUsingMethods;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection implements JDBCProperties
{
	public static  Connection getConnection() throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/vam.sql.training?autoReconnect=true&useSSL=false", "root", "root");
	}
}
