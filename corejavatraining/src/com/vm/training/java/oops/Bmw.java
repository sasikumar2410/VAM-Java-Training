package com.vm.training.java.oops;

public class Bmw extends Car {

	
	Bmw(String moddel) {
		super(moddel);
		System.out.println(model);
		// TODO Auto-generated constructor stub
	}


	@Override
	void ac() {
		// TODO Auto-generated method stub
		System.out.println("split AC");
	}


	@Override
	void indicators() {
		// TODO Auto-generated method stub
		System.out.println("regular and rear mirror");
	}


}
