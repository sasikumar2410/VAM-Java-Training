package com.vm.training.java.AssignmentOnCollections;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class ScoreAnalyzer 
{
	
	private LinkedList<Integer> runsData=new LinkedList<Integer>();
	

	/**
	 * creating a parameterized Constructor passing instance variable of ScoreAnalyzer class
	 * @param playerName
	 * @param runData
	 */
	public ScoreAnalyzer( LinkedList<Integer> runData) {
		super();
		
		this.runsData = runData;
	}
	
	public ScoreAnalyzer() {
		super();
	}

	/**
	 *Here we are generating getters and Setters for instance variable of ScoreAnalyzer class
	 * @return
	 */
	
	public LinkedList<Integer> getRunData() {
		return runsData;
	}
	public void setRunData(LinkedList<Integer> runData) {
		this.runsData = runData;
	}
	/**
	 * This method is used to add the elements into list
	 * @param runs
	 */
	void addRunsToList(int runs)
	{
		runsData.add(runs);
	}
	/**
	 * This method is used to calculate the run rate  
	 * @return
	 */
	double calcRunRate()
	{
		double run=0;
		Iterator<Integer> iterator=runsData.iterator();
		while(iterator.hasNext())
		{
			run=run+iterator.next();
		}
		return (run/50);
		
	}
	/**
	 * This method is used to calculate the lowest score
	 * @return
	 */
	int lowestRunsScored()
	{
		return Collections.min(runsData);
	}
	/**
	 * This method is used to print all the data that was present in List
	 */
	void displayRuns()
	{
		for(Integer s: runsData)
		{
			System.out.print(s+" ");
		}
	}

	int CountPlayers()
	{
		return runsData.size();
	}

	

}
