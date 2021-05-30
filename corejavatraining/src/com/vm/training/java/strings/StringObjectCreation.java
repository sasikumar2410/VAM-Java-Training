package com.vm.training.java.strings;

import java.util.*;

public class StringObjectCreation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 * String s1=new String("Value Momentum"); String s2="Value Momentum";
		 * System.out.println(s1==s2);//false System.out.println(s1.equals(s2));//true
		 * 
		 * int i=1; int j=1; System.out.println(i==j);
		 * 
		 * System.out.println(s1.concat("Training")); System.out.println(s1.equals(s2));
		 * System.out.println(s1.charAt(4)); System.out.println(s1.toUpperCase());
		 * System.out.println(s1.toLowerCase()); String s3=s1.replace('m', 'n');
		 * System.out.println(s3); System.out.println(s3.compareTo(s1));
		 * System.out.println(s3.endsWith(s2));  */
		/*
		 * String s4="    value  momentum     "; System.out.println(s4);
		 * System.out.println(s4.trim());
		 */
		 

		String s5 = "When the intern () method is executed then it checks whether the String equals to this String Object is in the pool or not.";
        String s6=sc.next();
        String[] s7=s5.split(" ");
        int count=0;
        for(int i=0;i<s7.length;i++)
        {
        	if(s6.equals(s7[i]))
        	{
        		count++;
        	}
        }
        System.out.println("The word "+s6+" "+"occurs "+count+" times.");
	}

}
