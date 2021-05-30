package com.vm.training.java.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.io.*;
class Movie implements Comparable<Movie>
{
	  String name;
	  private double ratings;
	  private int year;
	public int compareTo(Movie m) {
	    // TODO Auto-generated method stub
	    return this.year-m.year;
	  } 
	

	  public Movie(String name, double ratings, int year) {
	    super();
	    this.name = name;
	    this.ratings = ratings;
	    this.year = year;
	  }

	  public String getName() {
	    return name;
	  }

	  public double getRatings() {
	    return ratings;
	  }

	  public int getYear() {
	    return year;
	  }	
		
}
public class TestComparableComparetor
{
	public static void main(String[] args)
	{
		ArrayList<Movie> arr=new ArrayList<Movie>();
		arr.add(new Movie("ASVR",7.2,2018));
		arr.add(new Movie("JLK",7.0,2018));
		arr.add(new Movie("NP",7.5,2018));
		arr.add(new Movie("JG",7.1,2018));
		Collections.sort(arr);
	    
	    System.out.println("Movies after Sorting : ");
	    for(Movie movie: arr)
	    {
	      System.out.println(movie.getName()+" "+movie.getRatings()+" "+movie.getYear());
	    }
	}
}
