package com.vm.training.java.assignments;

public class TestAnimal {

	public static void main(String[] sasi)
	{
		// TODO Auto-generated method stub
     Animal a=new Animal();
     a.walk();
     
     
     System.out.println("-----------printing walk() of bird using animal class reference variable 'a1'--------");
     //we can access only walk method bocs parent can't access the child class method
     Animal a1=new Bird();
     a1.walk();
      
     
     System.out.println("----------printing all methods that were present in bird class by using reference variable of bird class 'b'---------- ");
     //Bird obj 'b' can access the method of parent class method that were present 
     Bird b=new Bird();
     b.walk();
     b.fly();
     b.Sing();
	}

}
