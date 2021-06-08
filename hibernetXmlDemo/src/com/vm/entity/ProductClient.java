package com.vm.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class ProductClient {
	public static void main(String[] args) 
	{
//		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure().build();  
//		
//		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();  
//
//		SessionFactory factory = meta.getSessionFactoryBuilder().build();  
//		Session session = factory.openSession();  
//		Transaction t = session.beginTransaction();  
//		
//		Product product = new Product();
//		product.setProduct_name("Laptop");
//		product.setProduct_category("Electronics");
//		product.setProduct_price(50000);
//		
//		session.save(product);
//		t.commit();
//		factory.close();
//		session.close();
		
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml"); 

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Product p=new Product();

		p.setProduct_category("electronic");
		p.setProduct_name("samsung");
		p.setProduct_price(20000);

		Transaction tx = session.beginTransaction();
		session.save(p);
		System.out.println("Object saved successfully.....!!");
		tx.commit();
		session.close();
		factory.close();
		
	}
}
