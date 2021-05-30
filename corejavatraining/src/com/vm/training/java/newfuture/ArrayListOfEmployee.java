package com.vm.training.java.newfuture;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayListOfEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> arraylistofemployee=new ArrayList<Employee>();
		arraylistofemployee.add(new Employee("VAM5733", "SASIKUMAR GADIPARTHI","D&C", 300000, 21));
		arraylistofemployee.add(new Employee("VAM5732", "NIKHIL","D&C", 300000, 25));
		arraylistofemployee.add(new Employee("VAM5731", "SASIKUMAR GADIPARTHI","JAVA DEV", 30000, 24));
		arraylistofemployee.add(new Employee("VAM5730", "RAKESH","Q&A", 30000, 21));
		arraylistofemployee.add(new Employee("VAM5728", "SHASHANK BOMPALLY","D&C", 300000, 22));

		arraylistofemployee.forEach(System.out::println);

		System.out.println("========count of emp======");
		long empcount= arraylistofemployee.stream().count();
		System.out.println("count of employee is :"+empcount);
		System.out.println("=========disply only D&C lob=========");
		arraylistofemployee.stream().filter(s->s.getLob().equalsIgnoreCase("D&C")).forEach(System.out::println);
		System.out.println("=========Name start with 's'=========");
		arraylistofemployee.stream().filter(s1->s1.getName().startsWith("S")).forEach(s->System.out.println(s));
		System.out.println("========employee count salary > 50000");
		long empcountofsalary=arraylistofemployee.stream().filter(s2->s2.getSalary()>50000).count();
		System.out.println(empcountofsalary);
		System.out.println("==========employe name and its lenght============");
		arraylistofemployee.stream().map(m-> m.getId()+" "+m.getName()+" "+m.getName().length()).forEach(System.out::println);
		System.out.println("============Salary with 20% more from basic salary==========");
		arraylistofemployee.stream().map(m-> m.getId()+" "+m.getName()+" "+m.getLob()+" "+m.getSalary()+" "+(m.getSalary()*(0.20)+m.getSalary())+" "+m.getAge()).forEach(System.out::println);
		
		System.out.println("=============Sort by name====================");
		
		arraylistofemployee.stream().sorted((p1,p2)->
		{
			return p1.getName().compareTo(p2.getName());
		}).forEach(System.out::println); 
		
		
		System.out.println("=============Sort by salary by using comparator===========");
		arraylistofemployee.stream().sorted(Comparator.comparing(Employee::getSalary)).forEach(System.out::println);
		
		
		System.out.println("=============Sort by age by using comparator===========");
		arraylistofemployee.stream().sorted(Comparator.comparing(Employee::getAge)).forEach(System.out::println);
		
		
		
		System.out.println("=============Sort by name by using comparator===========");
		arraylistofemployee.stream().sorted(Comparator.comparing(Employee::getName)).forEach(System.out::println);
		
		
		System.out.println("=============Sort by name by using comparator===========");
		arraylistofemployee.stream().sorted(Comparator.comparing(Employee::getName).reversed()).forEach(System.out::println);
		
		System.out.println("===============Sum of salarys=============");
		long sum=arraylistofemployee.stream().collect(Collectors.summarizingInt(Employee::getSalary)).getSum();
		System.out.println(sum);
		
		System.out.println("===============Sum of salarys of D&c=============");
		long sum1=arraylistofemployee.stream().filter(s->s.getLob().equals("D&C")).collect(Collectors.summarizingInt(Employee::getSalary)).getSum();
		System.out.println(sum1);
		
		
		System.out.println("=============Unique data========");
		List<Employee> uniqueemp=arraylistofemployee.stream().distinct().collect(Collectors.toList());
		uniqueemp.forEach(System.out::println);
		
		
		System.out.println("==============Slip command=======");
		long sk=2;
		arraylistofemployee.stream().skip(sk).forEach(System.out::println);
		
		
		System.out.println("=============limit command========");
		long lm=2;
		arraylistofemployee.stream().limit(lm).forEach(System.out::println);;
	}
}
