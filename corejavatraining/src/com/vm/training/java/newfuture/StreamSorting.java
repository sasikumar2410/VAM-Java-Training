package com.vm.training.java.newfuture;

import java.util.ArrayList;

public class StreamSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(2);
		al.add(3);
		al.add(1);
		al.add(5);
		al.add(6);
		al.add(7);
		al.forEach(System.out::println);
		System.out.println("======Sort========");
		al.stream().sorted().forEach(System.out::println);
		//al.forEach(System.out::println);
		
		
		
		ArrayList<String> al1=new ArrayList<String>();
		al1.add("Sasi");
		al1.add("Akhil");
		al1.add("Balu");
		al1.forEach(System.out::println);
		System.out.println("======Sort========");
		al1.stream().sorted().forEach(System.out::println);
		//al1.forEach(System.out::println);
	}

}
