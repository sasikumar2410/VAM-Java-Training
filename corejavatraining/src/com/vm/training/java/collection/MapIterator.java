package com.vm.training.java.collection;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public class MapIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String , Integer> hm=new HashMap<String,Integer>();
		hm.put("Sasi",1);
		hm.put("Shashank",2);
		hm.put("Rocky",3);

		/*
		 * for(<String,Integer> h:hm.entrySet()) { System.out.println(h); }
		 */
		for(Integer i:hm.values())
		{
			System.out.println(i);
			
		}
		/*
		 * for(String i:hm.keys()) { System.out.println(i);
		 * 
		 * }
		 */
	}

}
