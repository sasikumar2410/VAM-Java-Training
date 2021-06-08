package com.vm.entity;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class HqlDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		
		SessionFactory sessionFactory=cfg.buildSessionFactory();
		Session session=sessionFactory.openSession();
		
		Query<Product> query=session.createQuery("from Product");
		List<Product> list=query.list();
		for (Product product : list) {
			System.out.println("ID: "+product.getProduct_id()+" ProductName: "+product.getProduct_name()+" ProductCategory "+product.getProduct_category()+" ProductPrice: "+product.getProduct_price());
		}
		System.out.println("==========================");
		list.forEach(System.out::println);
	}

}
