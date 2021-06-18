package com.vm.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.vm.entity.Employee;

public class App {

	public static void main(String[] args)
	{
		SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
		Session session=sessionFactory.getCurrentSession();
		Transaction transaction=session.beginTransaction();
		Employee employee=new Employee();
		employee.setName("shashank");
		employee.setDpt("hr");
		session.save(employee);
		transaction.commit();
	}

}
