package com.vm.entity;

import java.util.List;
import java.util.Scanner;

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
		System.out.println("==============================");
		Query<Product> query2=session.createQuery("select p from Product p where p.product_price>5000");
		List<Product> list2=query2.list();
		list2.forEach(System.out::println);
		System.out.println("===============================");
		System.out.println("Query By passing parametrs :");
		Query<Product> query3=session.createQuery("select p from Product p where p.product_price> :pric");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the price limit :");
		int n=sc.nextInt();
		query3.setParameter("pric",n);
		List<Product> list3=query2.list();
		list3.forEach(System.out::println);
	}

}
