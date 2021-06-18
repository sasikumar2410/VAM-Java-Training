package com.vm.client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.vm.config.MyAppConfig;
import com.vm.entity.Employee;

public class App {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		//	AnnotationConfigApplicationContext context	=new AnnotationConfigApplicationContext(MyAppConfig.class);
		AnnotationConfigApplicationContext context	=new AnnotationConfigApplicationContext();
		context.scan("com.vm");
		context.refresh();
		Employee employee= (Employee) context.getBean("e1");
		System.out.println(employee.getId());
		System.out.println(employee.getName());
	}

}
