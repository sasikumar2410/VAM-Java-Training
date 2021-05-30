package com.vm.training.java.oops;
//this the class to test how to access the inner cls through outer class 
public class InnerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer outer=new Outer();
		//to call the inner class we need to have the reference of outer class .outer
		Outer.Inner inner= outer.new Inner(); 
		inner.display();
	}  

}
