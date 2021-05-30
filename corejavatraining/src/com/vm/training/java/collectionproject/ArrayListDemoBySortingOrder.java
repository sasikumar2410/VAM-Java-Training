package com.vm.training.java.collectionproject;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemoBySortingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> javabatch=new ArrayList<String>();
		javabatch.add("Ravi");
		javabatch.add("John");
		javabatch.add("Anil");
		javabatch.add("Kumar");
		ArrayList<String> sqlbatch=new ArrayList<String>();
		sqlbatch.add("Sourab");
		sqlbatch.add("Ankita");
		sqlbatch.add("John");
		sqlbatch.add("Kumar");
		sqlbatch.add("Manoj");
		System.out.println(javabatch);
		System.out.println(sqlbatch);
		javabatch.removeAll(sqlbatch);
		javabatch.addAll(sqlbatch);
		Collections.sort(javabatch);
		
		System.out.println("After removing duplicates");
		System.out.println(javabatch);
	}

}
