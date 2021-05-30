package com.vm.training.java.assignmentsone;
public class Car {
	  int year_of_modeal;
	  String make;
	  int speed;
	  public Car(int year_of_modeal, String make) {
	    super();
	    this.year_of_modeal = year_of_modeal;
	    this.make = make;
	    this.speed =0;
	  }
	  public int getYear_of_modeal() {
	    return year_of_modeal;
	  }
	  public void setYear_of_modeal(int year_of_modeal) {
	    this.year_of_modeal = year_of_modeal;
	  }
	  public String getMake() {
	    return make;
	  }
	  public void setMake(String make) {
	    this.make = make;
	  }
	  public int getSpeed() {
	    return speed;
	  }
	  public void setSpeed(int speed) {
	    this.speed = speed;
	  }
	  void accelerater()
	  {
	    speed= 5+speed;
	    }
	  void brake()
	  {
	    speed= speed-5;
	    }

	}