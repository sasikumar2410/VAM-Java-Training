package com.vm.training.java.concurrent;

import java.util.Collections;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

 public class ConcurrentDemo 
{
	public static void main(String[] args) {
		//HashMap<String, Integer> hm=new HashMap<String, Integer>();
		ConcurrentHashMap<String , Integer> hm=new ConcurrentHashMap<String,Integer>();
		hm.put("Sasi",1);
		hm.put("Shashank",2);
		hm.put("Rocky",3);
		System.out.println(hm);
		hm.computeIfAbsent("Kutti", a->4);
		hm.computeIfAbsent("Teja", a->5);
		hm.computeIfAbsent("Nikhil", a->6);
		hm.computeIfAbsent("Siva", a->7);
		System.out.println(hm);
		for(Integer i:hm.values())
		{
			System.out.println(i);
			hm.computeIfAbsent("Vasi", a->8);
		}
		System.out.println(hm);
		//hm.computeIfPresent("sasi", b->1);
		System.out.println("============hm value==============");
		System.out.println(hm.containsValue(1));
		System.out.println(hm.containsValue(2));
		System.out.println(hm.containsValue(3));
		System.out.println(hm.containsValue(4));
		System.out.println(hm.containsValue(5));
		System.out.println(hm.containsValue(6));
		System.out.println(hm.containsValue(7));
		
		
		System.out.println("==========Key Value==================");
		
		System.out.println(hm.containsKey("Sasi"));
		System.out.println(hm.containsKey("Shashank"));
		System.out.println(hm.containsKey("Rocky"));
		System.out.println(hm.containsKey("Siva"));
		System.out.println(hm.containsKey("Nikhil"));
		System.out.println(hm.containsKey("Kutti"));
		System.out.println(hm.containsKey("Nikhil"));
		
	}
}
