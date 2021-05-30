package com.vm.training.java.newfuture;


//::
interface Validate
{
	void validatelogin();
}
class Car
{
	void mylogin()
	{
		System.out.println("yu can login now by using password");
	}
}
public class MethodReferenceMode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Validate v=()->System.out.println("login valifate");
		v.validatelogin();
		
		
	}

}
