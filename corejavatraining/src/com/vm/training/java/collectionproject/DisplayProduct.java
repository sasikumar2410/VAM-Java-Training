package com.vm.training.java.collectionproject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class DisplayProduct {
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ArrayList<Product> al=new ArrayList<Product>();
		al.add(new Product(1,"apple",15000));
		al.add(new Product(2,"realme",1500));
		al.add(new Product(3,"honor",1700));
		al.add(new Product(4,"samsung",2500));
		
		  for(Product p:al) 
		  { 
			 System.out.println(p); 
		  }
		  
		  
		  for(Product pp:al)
		    {
		    	if(pp.getP_cost()>10000)
		    	{
		    		System.out.println(pp.getP_name());
		    	}
		    }
		 
		/* System.out.println(al); */
		  Collections.sort(al, new PriceSorting());
		  System.out.println("====AFTER SORTING====");
		  for(Product p:al) 
		  { 
			 System.out.println(p); 
		  }
	}
	
    
}
