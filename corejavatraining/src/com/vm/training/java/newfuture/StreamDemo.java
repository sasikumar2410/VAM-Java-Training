package com.vm.training.java.newfuture;

import java.util.ArrayList;

public class StreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		al.add(6);
		al.add(7);
		
		al.forEach(s->System.out.println(s));
		
		long count =al.stream().count();
		System.out.println("total element present in stream"+count);
		
		System.out.println("num > 2");
		
	}

}
