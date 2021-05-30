package com.vm.training.java.AssignmentOnCollections;
import java.util.*;
import java.util.Map.Entry;
public class TestScoreCard {
	/**
	 * This method is used to display the players name only
	 * @param hm
	 */
	static void dipalyPlayersname(HashMap<String,Integer> hm)
	{
		for (String iterable_element : hm.keySet()) 
		{
			System.out.println(iterable_element);
		}
	}
	/**
	 * This method is used to display the player name and Score
	 * @param hm
	 */
	static void scoreByplayers(HashMap<String,Integer> hm)
	{
		System.out.println(hm);
	}
	/**
	 * This method is used to display the total Score of players
	 * @param hm
	 */
	static void totalScore(HashMap<String,Integer> hm)
	{
		int sum=0;
		for(Integer i:hm.values())
		{
			sum=sum+i;
		}
		System.out.println(sum);
	}
	/**
	 * This method is used to print the Name By HighScore 
	 * @param hm
	 */
	static void printNameByHighScore(HashMap<String,Integer> hm)
	{
		Map.Entry<String, Integer> withMax=null;
		for(Entry<String, Integer> i:hm.entrySet())
		{
			if(withMax==null||i.getValue().compareTo(withMax.getValue())>0)
			{
				withMax=i;
			}
		}
		System.out.println(withMax);
	}
	
	
	/**
	 * main method 
	 * @param args
	 */
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		HashMap<String ,Integer> hm=new HashMap<String, Integer>();
		hm.put("Rahane" , 20);
		hm.put("Rahul", 30);
		hm.put( "Kohli", 150 );
		hm.put("Dhoni", 187);
		hm.put("Lokesh", 10);
		
		System.out.println("=======Players Name======");
		dipalyPlayersname(hm);
		System.out.println("=======players Score=====");
		scoreByplayers(hm);
		System.out.println("=======Total Score======");
		totalScore(hm);
		System.out.println("=======Player name by high score========");
		printNameByHighScore(hm);
		
	}

}
