package com.vm.training.java.newfuture;

import java.util.List;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.io.*;

public class ProductTestStream {
	/**
	 * this method is used to count the number of product in the product class
	 * @param al
	 */
	static long  totalProductCapacity(ArrayList<ProductDemo> al)
	{
		long count=al.stream().count();
		//System.out.println("The total count of product is :"+count);
		return count;
	}
	/**
	 * this method is used to prints the data where price > 16000
	 * @param al
	 * @return 
	 */
	static List<ProductDemo> productByPrice(ArrayList<ProductDemo> al)
	{
	//List<ProductDemo> l=(List<ProductDemo>) al.stream().filter(s->s.getP_price()>=16000).collect(Collectors.toList());
		return al.stream().filter(s->s.getP_price()>=16000).collect(Collectors.toList());
	}
	/**
	 * This method is used to prints the data by p_category
	 * @param al
	 */
	static List<ProductDemo> productByCategory(ArrayList<ProductDemo> al)
	{
		//List<ProductDemo> l2=(List<ProductDemo>) al.stream().filter(s->s.getP_category().equalsIgnoreCase("Berry")).collect(Collectors.toList());
		return al.stream().filter(s->s.getP_category().equalsIgnoreCase("Berry")).collect(Collectors.toList());
	}
	
	 /**
	  *This method is used to prints the data by p_price and p_quantity
	  * @param al
	  */
	static List<String> productByQuantityAndPrice(ArrayList<ProductDemo> al)
	{
		//List<ProductDemo> l3=(List<ProductDemo>) al.stream().map(m->m.getP_price()+" "+m.getP_quantity()).collect(Collectors.toList());
		//System.out.println(l);
		return al.stream().map(m->m.getP_price()+" "+m.getP_quantity()).collect(Collectors.toList());
	}
	/**
	 * This method is used to print then data by p_quantity and p_category by passing the limit
	 * @param al
	 */
	static List<String> productByQuantityAndCategory(ArrayList<ProductDemo> al)
	{
		//List<ProductDemo> l4=(List<ProductDemo>) al.stream().filter(s->s.getP_quantity()>15).filter(s1->s1.getP_category().equalsIgnoreCase("electronic"));
		//System.out.println(l);
		return  al.stream().map(s->s.getP_quantity()+" "+s.getP_category().equals("Berry")).collect(Collectors.toList());
	}
	/**
	 * This method is used to print the p_name to UpperCase 
	 * @param al
	 */
	static List<String> productNameToUpperCase(ArrayList<ProductDemo> al)
	{
	  //List<String> l5=(List<String>) al.stream().map(m->m.getP_name().toUpperCase()).collect(Collectors.toList());
		//System.out.println(l);
		return 	 al.stream().map(m->m.getP_name().toUpperCase()).collect(Collectors.toList());
	}
	/**
	 * This method is used to print the count of the product by category
	 * @param al
	 * @return 
	 */
	static long productCountByCategory(ArrayList<ProductDemo> al)
	{
		
		List<ProductDemo> l6=(List<ProductDemo>) al.stream().filter(s->s.getP_category().equalsIgnoreCase("Berry")).collect(Collectors.toList());
		long count1=((Collection<ProductDemo>) l6).stream().count();
		System.out.println(count1);
		return ((Collection<ProductDemo>) l6).stream().count();
	}
	
	public static void main(String[] args)throws IOException
	{
		ArrayList<ProductDemo> productlist=new ArrayList<ProductDemo>();
		productlist.add(new ProductDemo(1, "Samsung", "electronics", 10, 125000));
		productlist.add(new ProductDemo(2, "Apple", "electronics", 12, 250000));
		productlist.add(new ProductDemo(3, "Realme", "electronics", 13, 100000));
		productlist.add(new ProductDemo(4, "Honor", "electronics", 10, 150000));
		productlist.add(new ProductDemo(5, "BlueBerry", "Berry", 25, 25250));
		productlist.add(new ProductDemo(6, "BlackBerry", "Berry", 35, 15000));
		productlist.add(new ProductDemo(7, "CrawnBerry", "Berry", 45, 14060));
		productlist.add(new ProductDemo(8, "StrawBerry", "Berry", 25, 10500));
		productlist.add(new ProductDemo(9, "Bat", "Playing", 10, 11000));
		productlist.add(new ProductDemo(10, "Ball", "Playing", 10, 9000));
		productlist.add(new ProductDemo(11, "Wickets", "Playing", 10, 5000));
		productlist.add(new ProductDemo(12, "Gloves", "Playing", 10, 10000));
		 
		
		//productlist.stream().map(m->m.getP_name().toUpperCase()).forEach(System.out::println);
		
		
		
		System.out.println("========list by ProductCapacity=========");
		System.out.println(totalProductCapacity(productlist));
		
		System.out.println("========list by Category==========");
		//List pbc=productByCategory(productlist);
		System.out.println(productByCategory(productlist));
		
		System.out.println("========list by Price=============");
		//List pbp=productByPrice(productlist);
		System.out.println(productByPrice(productlist));
		
		System.out.println("========list by QuantityAndCategory=========");
		System.out.println(productByQuantityAndCategory(productlist));
		
		System.out.println("========list by QuantityAndPrice==========");
		System.out.println(productByQuantityAndPrice(productlist));
		
		System.out.println("========list by CountByCategory=========");
		System.out.print(productCountByCategory(productlist));
		
		System.out.println("========list by NameToUpperCase=========");
		List upperCase=productNameToUpperCase(productlist);
		System.out.println(upperCase);
		
		
	}

}
