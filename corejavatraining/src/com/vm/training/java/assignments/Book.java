package com.vm.training.java.assignments;

public abstract class Book implements IBook

{
	String title;
	
	public Book(String title)
	{
		this.title=title;
	}
	@Override
	public void setTitle() {
		// TODO Auto-generated method stub
		System.out.println("The book name is : "+title);
		
	}

	
}
   
