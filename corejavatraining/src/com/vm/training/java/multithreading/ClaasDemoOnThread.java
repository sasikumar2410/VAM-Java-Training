package com.vm.training.java.multithreading;

class Employee extends Thread
{
	public void run()
	{
		System.out.println("this is the task of employee");
	}
}
class Student implements Runnable
{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("this is the task of student");
	}
	
}
public class ClaasDemoOnThread {
	public static void main(String[] args) {
		Employee emp=new Employee();
		emp.start();
		
		
		Student st=new Student();
		Thread t1=new Thread(st);
		t1.start();
	}
}
