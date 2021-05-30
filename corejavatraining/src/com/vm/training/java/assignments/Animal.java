package com.vm.training.java.assignments;

public class Animal
{
 void walk()
 {
	 System.out.println("I can walking");
 }
}
class Bird extends Animal
{
	//walk() method that can extended from Super class because child can access the method of parent class
	void walk()
	{
		System.out.println("I can walk");
	}
	void fly()
	{
		System.out.println("I can fly");
	}
	void Sing()
	{
		System.out.println("I can sing");
	}
}
