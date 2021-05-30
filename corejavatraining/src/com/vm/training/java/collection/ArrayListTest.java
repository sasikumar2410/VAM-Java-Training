package com.vm.training.java.collection;
import java.util.*;
public class ArrayListTest 
{
	@SuppressWarnings("deprecation")
	public static void main(String[] args) 
	{
		ArrayList arraylist=new ArrayList();
		arraylist.add("sasi kumar");
		arraylist.add("Gadiparthi");
		arraylist.add("Employee At ValueMomentum");
		arraylist.add(new Integer(5700));
		//System.out.println(arraylist);
		arraylist.add(3, "As a java Developer");
		//System.out.println(arraylist);
		ArrayList<ArrayList> a1=new ArrayList<ArrayList>();
	}
}
