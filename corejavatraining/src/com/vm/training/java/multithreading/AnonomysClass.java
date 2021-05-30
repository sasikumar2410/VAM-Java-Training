package com.vm.training.java.multithreading;
/**
 * 
 * @author sasi chowdary
 *
 */
class parent
{
	void phone()
	{
		System.out.println("samsung");
	}
}
/**
 * 
 * @author sasi chowdary
 *
 */
class child extends parent
{
	
}
public class AnonomysClass {

/**
 * 	
 * @param args
 */
	public static void main(String[] args) 
	{
	 	child c=new child();
	 	c.phone();
	 	child c1=new child()
	 			{
	 				void phone()
	 				{
	 					System.out.println("i phone");
	 				}
	 			};
	 	c1.phone();
	}

}
