package com.vm.training.java.exceptionhabler;

public class MaintainMinimumBalance extends Exception
{
  String s;

public MaintainMinimumBalance(String s) {
	super();
	this.s = s;
}

@Override
public String toString() {
	return "MaintainMinimumBalance [s=" + s + "]";
}
  
}
