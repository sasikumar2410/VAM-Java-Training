package com.vm.training.java.newfuture;

@FunctionalInterface
interface length{
	int len(String string);
}

@FunctionalInterface
interface Reverse{
	String revers(String string);
}
public class LamdaString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		length l=(s)->
		{
			System.out.println("The lenght of String is "+s.length());
			return 0;
		};
		l.len("Sas ikumar");
		
		System.out.println("=================================");
		
		Reverse r=(s)->
		{
			
			StringBuffer s1=new StringBuffer(s);
			System.out.println(s1.reverse());
			System.out.println("============individual char======Reverse============");
			for(int i=s1.length()-1;i>=0;i--)
			{ 
				System.out.println(s1.charAt(i));
			}
			 
			return s;
			
		};
		r.revers("Sasi kumar");
	}

}
