package com.vm.training.client;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.vm.training.entity.DBCalss;

public class MyDtaBaseClient
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Resource resource=new ClassPathResource("Database.xml");  
	    BeanFactory factory=new XmlBeanFactory(resource);
	    DBCalss dbCalss =(DBCalss) factory.getBean("db");
	    dbCalss.displayDetailsOfDataBase();
	}

}
