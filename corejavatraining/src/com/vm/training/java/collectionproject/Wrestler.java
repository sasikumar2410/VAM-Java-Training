package com.vm.training.java.collectionproject;

import java.util.Comparator;

public class Wrestler implements Comparator<Wrestler>
{
 private String w_name;
 private int w_weight;
 private float height;
public Wrestler(String w_name, int w_weight, float height) {
	super();
	this.w_name = w_name;
	this.w_weight = w_weight;
	this.height = height;
}
public String getW_name() {
	return w_name;
}
public void setW_name(String w_name) {
	this.w_name = w_name;
}
public int getW_weight() {
	return w_weight;
}
public void setW_weight(int w_weight) {
	this.w_weight = w_weight;
}
public float getHeight() {
	return height;
}
public void setHeight(float height) {
	this.height = height;
}
@Override
public String toString() {
	return "Wrestler [w_name=" + w_name + ", w_weight=" + w_weight + ", height=" + height + "]";
}
@Override
public int compare(Wrestler o1, Wrestler o2) {
	// TODO Auto-generated method stub
	return 0;
}
 
}
