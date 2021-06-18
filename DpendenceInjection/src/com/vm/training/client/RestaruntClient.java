package com.vm.training.client;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import com.vm.training.entity.Restarunt;
import com.vm.training.entity.Tea;

public class RestaruntClient {

	public static void main(String[] args)
	{
		
		Resource resource=new ClassPathResource("object.xml");  
	    BeanFactory factory=new XmlBeanFactory(resource);
	    Restarunt restarunt=(Restarunt) factory.getBean("rs");
	    restarunt.dispalyRestaruntDetails();
	}

}
