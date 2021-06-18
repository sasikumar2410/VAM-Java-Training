package com.vm.training.entity;


import java.util.List;
import java.util.Set;

public class Restarunt 
{
	private String name;
	private IhotDrink ihotDrink;
	private IsoftDrink isoftDrink;
	private Set menu;
	private List menu1;
	
	public void setMenu1(List menu1) {
		this.menu1 = menu1;
	}
	public void setMenu(Set menu) {
		this.menu = menu;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setIhotDrink(IhotDrink ihotDrink) {
		this.ihotDrink = ihotDrink;
	}
	public void setIsoftDrink(IsoftDrink isoftDrink) {
		this.isoftDrink = isoftDrink;
	}
	public void dispalyRestaruntDetails()
	{
		System.out.println("Name : "+name);
		System.out.println("Menu : "+menu);
		System.out.println("Menu : "+menu1);
		isoftDrink.drink();
		ihotDrink.prepare();
	}
}
