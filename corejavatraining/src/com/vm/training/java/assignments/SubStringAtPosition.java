package com.vm.training.java.assignments;

public class SubStringAtPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="The quick brown fox jumps over the lazy dog";
		System.out.println("orginal string "+s1);
		String s2=s1.substring(10,26);
		StringBuffer sb=new StringBuffer(s2);
		System.out.println("sub string"+sb);
	}

}
