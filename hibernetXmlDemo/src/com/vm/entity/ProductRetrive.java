package com.vm.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ProductRetrive {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml"); 

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Product o=null;
		try
		{
			o=session.load(Product.class,new Integer(1));
			System.out.println("load product name :"+o.getProduct_name());
			System.out.println("load product name :"+o.getProduct_category());
			System.out.println("load product name :"+o.getProduct_price());
			System.out.println("=====Loaded successfuly==========");
		}
		catch(Exception e)
		{
			System.out.println("Row does not exist");
		}
		session.close();
		factory.close();

	}

}
