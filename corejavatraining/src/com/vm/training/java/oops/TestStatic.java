package com.vm.training.java.oops;


	class A{
		static int i=0;
		A()
		{
			i++;
			System.out.println(i);
		}
	/*public static void dis()
		{
			System.out.println(i);
		}*/
	
	}
	public class TestStatic
	{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
     A a1=new A();
     A a2=new A();
	}
}
