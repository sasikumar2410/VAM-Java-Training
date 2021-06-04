package com.vm.training.java.casestudy;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class TrainDAO 
{

	Train train;

	@SuppressWarnings("unused")
	public Train findTrain( int train_num) throws Exception
	{
		/**
		 * this was the connection 
		 * we connected to database
		 */
		Connection con=DBconnection.getConnection();
		PreparedStatement p = con.prepareStatement("select * from train where train_num=?");
		p.setInt(1,train_num);
		ResultSet rs=p.executeQuery();
		while(rs.next())
		{
			int train_no=rs.getInt("train_num");
			String train_name=rs.getString("train_name");
			String train_source=rs.getString("train_source");
			String train_destination=rs.getString("train_destination");
			Double ticket_price=rs.getDouble("ticket_price");
			train=new Train(train_num,train_name,train_source,train_destination,ticket_price);
			System.out.println(train_name);
			if(rs==null)
			{
				System.out.println("Train no not found");
			}
		}
		return train;
	}
}
