package com.vm.training.java.serilization;

import java.io.Serializable;

public class Employee implements Serializable
{
 String id;
 String name;
 String comapani;
public Employee(String id, String name, String comapani) {
	super();
	this.id = id;
	this.name = name;
	this.comapani = comapani;
}
 
}
