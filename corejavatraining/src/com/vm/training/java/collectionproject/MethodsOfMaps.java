package com.vm.training.java.collectionproject;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap.KeySetView;

public class MethodsOfMaps {

	static void addelement(LinkedHashMap lhm,String name,String mobile)
	{
		
		lhm.put(name,mobile);
		System.out.println(lhm);
	}
	
	 static void remove(LinkedHashMap lhm,String name) {
		// TODO Auto-generated method stub
		lhm.remove(name);
		System.out.println(lhm);
		}
	 static void display(LinkedHashMap lhm)
	 {
		 lhm.entrySet();
	 }
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
       LinkedHashMap lhm= new LinkedHashMap();
       addelement(lhm, "sasi","9177832283");
       addelement(lhm, "shashank","12345678");
       addelement(lhm, "rocky","456716456");
       remove(lhm, "rocky");
       display(lhm);
	}

}
