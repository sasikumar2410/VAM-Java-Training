package com.vm.training.java.miniproject;

public  abstract class MenuItems implements Menu
{
	
	  String item_name; String item_type; int item_cost; String
	  item_avilableornot;
	
	public  MenuItems() {
		super();
		
		this.item_name = item_name;
		this.item_type = item_type;
		this.item_cost = item_cost;
		this.item_avilableornot = item_avilableornot;
	}
	
	public MenuItems(String item_name, String item_type, int item_cost1) {
		super();
		this.item_name = item_name;
		this.item_type = item_type;
		this.item_cost = item_cost1;
		
	}

	public void items_veg()
	{
		// TODO Auto-generated method stub
		System.out.println("MenuItems [item_name=" + item_name + ", item_type=" + item_type + ", item_cost=" + item_cost
				 + "]");
	}
	public void items_non_veg()
	{
		// TODO Auto-generated method stub
		System.out.println("MenuItems [item_name=" + item_name + ", item_type=" + item_type + ", item_cost=" + item_cost
				+  "]");
		
	}
	
	
}
