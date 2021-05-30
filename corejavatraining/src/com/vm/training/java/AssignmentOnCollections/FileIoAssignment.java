package com.vm.training.java.AssignmentOnCollections;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class FileIoAssignment
{
	/**
	 * This methos is used to print the list by removing the delhi from the list
	 * @param lhs
	 */
	static void deleteTheSpecificElement(Set<String> lhs)
	{
		String s="Delhi";
		lhs.remove(s);
		for (String string : lhs) {
			System.out.println(string);
		}
	}
	/**
	 * This method is used to print the state name starts with 'K'
	 * @param lhs
	 */
	static void displayTheStateNameStartWithK(Set<String> lhs)
	{
		for(String s:lhs)
		{
			if(s.startsWith("K"))
			{
				System.out.println(s);
			}
		}
	}
	/**
	 * This method is used to print the list in sorted order
	 * @param lhs
	 */
	static void sortTheList(Set<String> lhs)
	{
		TreeSet<String> ts=new TreeSet<String>(lhs);
		System.out.println(ts);
	}
	public static void main(String[] args) throws IOException
	{
		FileReader fr=new FileReader("F:\\Personal\\valuemomentum\\Assignments\\States.txt");
		BufferedReader br=new BufferedReader(fr);
		Set<String> lhs=new LinkedHashSet<String>();
		
		String readlines=br.readLine();
		while(readlines!=null)
		{
			
			lhs.add(readlines);
			readlines=br.readLine();
		}	
		System.out.println("============Data that was present int the LinkedHashSet============");
		int count=0;
		for (String s : lhs)
		{
			//System.out.println(s);
			count++;
		}
		System.out.println("==========No of states that was present in the list============");
		System.out.println(count);
		
		System.out.println("==========Remove delhi from the List and display============");
		deleteTheSpecificElement(lhs);
		 
		System.out.println("==========print the state name starting with 'k'  ============");
		displayTheStateNameStartWithK(lhs);
		
		System.out.println("=========print the list in sorted order============");
		sortTheList(lhs);
		
	}

}
