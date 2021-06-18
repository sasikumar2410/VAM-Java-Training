package com.vm.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.vm.entity1.Product;

public class ProductApp {

	public static void main(String[] args) {
		SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
		Session session=sessionFactory.getCurrentSession();
		Transaction transaction=session.beginTransaction();
		Product product=new Product();
		product.setPname("Samsung");
		product.setPquantity(10);
		product.setPrice(75000);
		session.save(product);
		transaction.commit();		
	}

}
