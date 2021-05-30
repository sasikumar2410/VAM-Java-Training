package com.vm.training.java.AssignmentOnCollections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class TestScoreAnalyzer
{
	
	public static void main(String[] args)
	{
		ScoreAnalyzer score=new ScoreAnalyzer();
		System.out.println("Enter runs: ");
		boolean repeat=true;
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			int n=sc.nextInt();
			if(n==-1)
			{
				break;
			}
			score.addRunsToList(n);

		}
		System.out.print("Runs Scored : ");
		score.displayRuns();
		System.out.println();
		System.out.println("==================================");
		System.out.println("Run rate :"+score.calcRunRate());
		System.out.println("==================================");
		System.out.println("Lowest runs scored :"+score.lowestRunsScored());
		System.out.println("==================================");
		System.out.println("Total no of players :"+score.CountPlayers());
	}

}
