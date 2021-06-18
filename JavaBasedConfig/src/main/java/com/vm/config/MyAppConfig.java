package com.vm.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.vm.entity.Employee;

@Configuration
public class MyAppConfig 
{
	@Bean(name="e1")
	public Employee getEmployee()
	{
		Employee employee=new Employee();
		employee.setId(5733);
		employee.setName("Sasi");
		return employee;
		
	}
}
