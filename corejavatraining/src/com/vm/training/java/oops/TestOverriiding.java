package com.vm.training.java.oops;
public class TestOverriiding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 GrandFather gf=new GrandFather(70);
	 gf.walk();
	 /*Father f=new Father(70,50,20);
	 f.walk();*/
	 Son s=new Son(70,50,20);
	 s.walk();
	 GrandFather f=new Son(70,50,20);
	 f.walk();
	}

}
