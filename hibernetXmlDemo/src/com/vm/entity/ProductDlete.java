package com.vm.entity;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.mysql.cj.x.protobuf.MysqlxExpect.Open;

public class ProductDlete {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		
		SessionFactory sessionFactory=cfg.buildSessionFactory();
		Session session=sessionFactory.openSession();
		Product product = null;
		try
		{
			product=session.get(Product.class, new Integer(2));
			Transaction tx = session.beginTransaction();
			session.delete(product);
			tx.commit();
		}
		catch (Exception e) 
		{
		System.out.println("Product does not exist");
		
		}
		
		session.close();
		sessionFactory.close();

	}

}
