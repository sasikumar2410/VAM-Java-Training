package com.vm.training.java.client;

import java.util.*;
import java.util.logging.Filter;
import java.util.stream.Collectors;

import com.vm.training.java.entity.HotDrink;
import com.vm.training.java.entity.SoftDrink;
import com.vm.training.java.entity.ThickShake;

public class ThickShakeApp
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("======WELCOME TO THICKSHAKE FACTORY=========");
		System.out.println("1.ThickShake");
		System.out.println("2.SoftDrinks");
		System.out.println("3.HotDrinks");
		System.out.println("======PLESE SELECT WHAT CATEGORY YOU =======");

		int c=sc.nextInt();
	try{
		switch (c)
		{
		
		case 1:
			/**
			 * Adding ThickShake class to ArrayList and adding data
			 * ArrayList is ThickShake Type
			 */
			ArrayList<ThickShake> thickShakes=new ArrayList<ThickShake>();
			/**
			 * Adding elements to the list
			 */
			thickShakes.add(new ThickShake("BelgianChocolate", 222));
			thickShakes.add(new ThickShake("ChocoBrownie",222));
			thickShakes.add(new ThickShake("PeanutButter", 222));
			thickShakes.add(new ThickShake("MexicanVanilla",211));
			thickShakes.add(new ThickShake("OreoNutella", 250));
			thickShakes.add(new ThickShake("KitKatThickShake", 230));
			thickShakes.stream().forEach(System.out::println);
			System.out.println("====PLEASE SELECT WHAT YOU WANT FROM THE LIST=====");
			String s=sc.next();
			System.out.println("====SELECTED ITEM & ITS COST=====");
			/**
			 * here we are doing filler operation based on item we had choosen and printing
			 */
			List list=thickShakes.stream().filter(m->m.getTsName().toLowerCase().equals(s)).collect(Collectors.toList());
			list.forEach(System.out::println);
			break;
			
		case 2:
			/**
			 * Adding SoftDrink class to ArrayList and Adding data to to list
			 * ArrayList is SoftDrink Type
			 */
			ArrayList<SoftDrink> softDrinks=new ArrayList<SoftDrink>();
			/**
			 * Adding elements to the list
			 */
			softDrinks.add(new SoftDrink("CokeZero", 230));
			softDrinks.add(new SoftDrink("pepsi", 75));
			softDrinks.add(new SoftDrink("Sprit", 100));
			softDrinks.add(new SoftDrink("ThumsUp", 100));
			softDrinks.stream().forEach(System.out::println);
			System.out.println("====PLEASE SELECT WHAT YOU WANT FROM THE LIST=====");
			String s2=sc.next();
			/**
			 * here we are doing filler operation based on item we had choosen and printing
			 */
			List list2= softDrinks.stream().filter(m->m.getdName().toLowerCase().equals(s2)).collect(Collectors.toList());
			System.out.println("====SELECTED ITEM & ITS COST=====");
			list2.forEach(System.out::println);
			break;
		case 3:
			/**
			 * Adding HotDrink to ArrayList and Addind Data To The List
			 * ArrayList is HotDrink Type
			 */
			ArrayList<HotDrink> hotDrinks=new ArrayList<HotDrink>();
			/**
			 * Adding elements to the list
			 */
			hotDrinks.add(new HotDrink("Carlsberg", 120));
			hotDrinks.add(new HotDrink("KingFisher", 110));
			hotDrinks.add(new HotDrink("Tuborg", 120));
			hotDrinks.add(new HotDrink("Bira91", 220));
			hotDrinks.stream().forEach(System.out::println);
			System.out.println("====PLEASE SELECT WHAT YOU WANT FROM THE LIST=====");
			String s3=sc.next();
			/**
			 * here we are doing filler operation based on item we had choosen and printing
			 */
			List list3=hotDrinks.stream().filter(m->m.gethName().toLowerCase().equals(s3)).collect(Collectors.toList());
			System.out.println("====SELECTED ITEM & ITS COST=====");
			list3.forEach(System.out::println);
			break;
		default:
			System.out.println("==========Plese Enter Numbers Between 1 ot 3========="); 
			break;
		}
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
		System.out.println("===========THANKS FOR VISITING SIR/MADAM===========");
		
	}

}
