package com.vm.training.java.AssignmentOnCollections;

public class ScoreCard 
{
	String name;
	int score;
	/**
	 * This was the constructor with parameters of ScoreCard class
	 * @param name
	 * @param score
	 */
	public ScoreCard(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}
	/**
	 * Here we generated getters and Setters methods for ScoreCard class variable
	 */
	public ScoreCard() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}

}	
