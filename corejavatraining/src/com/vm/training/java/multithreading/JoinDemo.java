package com.vm.training.java.multithreading;
class Project extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println(Thread.currentThread().getName());
		}
	}
}
class WorkingOnProject extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println(Thread.currentThread().getName());
		}
	}
}
class Presentaion extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println(Thread.currentThread().getName());
		}
	}
}
public class JoinDemo {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Project project=new Project();
		WorkingOnProject wop=new WorkingOnProject();
		Presentaion presentaion=new Presentaion();
		
		
		
		project.setName("Project");
		wop.setName("WorkingOnProject");
		presentaion.setName("Presentaion");
		
		
		project.start();
		project.join();
		
		
		wop.start();
		presentaion.start();
	}

}
