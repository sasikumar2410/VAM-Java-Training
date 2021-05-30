package com.vm.training.java.newfuture;

interface test
{
	void display();
}
public class LamdaDemo {

	public static void main(String[] args) {
		
		test t= ()->
		{
			System.out.println("heelo");
			System.out.println("welcome to java");
		};
		t.display();
		System.out.println("==============================");
		test t1=()->System.out.println("hello welcome to java");
		t1.display();
	}

}
