package com.vm.training.java.collection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Movie1 implements Comparable<Movie1>
{
  private double rating;
  private String name;
  private int year;
  
  //used to sort movies by year
  public int compareTo(Movie1 m)
  {
    return this.year - m.year;
  }
  //constructor
  public Movie1(String nm,double rt,int yr)
  {
    this.name=nm;
      this.rating=rt;
      this.year=yr;
  
  }
  
  //getter methods for accessing private data
  public double getRating() {
    return rating;
  }
  public String getName() {
    return name;
  }
  public int getYear() {
    return year;
  }
}

class RatingCompare implements Comparator<Movie1>
{
  public int compare(Movie1 m1,Movie1 m2) {
    if(m1.getRating()<m2.getRating()) return -1;
    if(m1.getRating()>m2.getRating()) return 1;
    else return 0;
  }
}
class NameCompare implements Comparator<Movie1>
{
  public int compare(Movie1 m1,Movie1 m2) {
    return m1.getName().compareTo(m2.getName());
  }
}


//Driver class
class TestMovie2{
  public static void main(String [] args) {
    ArrayList<Movie1> list=new ArrayList<Movie1>();
    list.add(new Movie1("Force Awakens",8.3,2015));
    list.add(new Movie1("Stars wars",8.3,1977));
    list.add(new Movie1("Empire strikes back",8.3,1980));
    list.add(new Movie1("Return of the jedi",8.4,1983));
    //sort by rating :1 create an object of ratingcompare
    //                2 call collections.sort
    //                3 print sorted list
    
    System.out.println("sorted by rating");
    RatingCompare ratingCompare=new RatingCompare();
    Collections.sort(list,ratingCompare);
    for(Movie1 movie:list)
      System.out.println(movie.getRating() +""+
    movie.getName()+""+movie.getYear());
    
    
    //call overloaded sort method with ratingcompare
    //(same three steps as above)
    System.out.println("Sorted by name");
    NameCompare nameCompare=new NameCompare();
    Collections.sort(list,nameCompare);
    for(Movie1 movie:list)
    {
      System.out.println(movie.getYear() +""+
                           movie.getRating()+""+
                     movie.getName()+"");
    }
  }
}