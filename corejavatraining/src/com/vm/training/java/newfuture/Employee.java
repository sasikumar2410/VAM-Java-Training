package com.vm.training.java.newfuture;

public class Employee {

	private String id;
	private String name;
	private String lob;
	private int salary;
	private int age;
	
	
	
	public Employee(String id, String name, String lob, int salary, int age) {
		super();
		this.id = id;
		this.name = name;
		this.lob = lob;
		this.salary = salary;
		this.age = age;
	}
	
	
	
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLob() {
		return lob;
	}
	public void setLob(String lob) {
		this.lob = lob;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}





	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", lob=" + lob + ", salary=" + salary + ", age=" + age + "]";
	}
	
	

}
