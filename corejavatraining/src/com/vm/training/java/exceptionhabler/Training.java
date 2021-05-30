package com.vm.training.java.exceptionhabler;
class ThrowsTest 
{
	void train()throws Exception
	{
		System.out.println("zero knowledge in .Net");
	}
	void trainAllsub()throws Exception
	{
		specifictraing();
		System.out.println("can train all sub theotitically");
	}
	void specifictraing()throws Exception
	{
		train();
		System.out.println("can only train java & angular");
	}
}
public class Training 
{
//exception is handled by main class at present. If it is not going to handled JVM is taking care of it
 public static void main(String[] args) throws Exception {
	 ThrowsTest throwtest=new ThrowsTest();
	 throwtest.train();
     throwtest.specifictraing();
     throwtest.trainAllsub();
}
	
}

