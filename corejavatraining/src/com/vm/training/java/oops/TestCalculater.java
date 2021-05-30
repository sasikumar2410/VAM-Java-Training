package com.vm.training.java.oops;

public class TestCalculater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculater c=new Calculater();
		System.out.println(c.add(100,200));
		System.out.println(c.add(100, 200, 100));
		System.out.println(c.add(100, 100, 100, 100));
	}

}
