package com.vm.training.java.collectionproject;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class RemoveDuplicatesFromList
{
	public static void main(String[] args) {
		HashMap hm=new HashMap();
		hm.put("dhoni","captain");
		hm.put("virat","viceCaptain");
		hm.put("uv","Smasher");
		hm.put("dhoni","BestFinisher");
		
		System.out.println("elements of hm : "+hm);
		
		LinkedHashMap lhm=new LinkedHashMap();
		lhm.put("dhoni","captain");
		lhm.put("virat","viceCaptain");
		lhm.put("uv","Smasher");
		lhm.put("dhoni","BestFinisher");
		
		System.out.println("elements of lhm : "+lhm);
		
	}
}
