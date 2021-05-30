package com.vm.training.java.miniproject;
import java.util.*;
import java.awt.MenuItem;
import java.io.*;
public class Restaurant 
{
	public static void main(String[] sasi) {
		Scanner sc=new Scanner(System.in);
		System.out.println("pls select '1' for veg and '2' for non_veg");
		int s=sc.nextInt();
		String item_name;
		String item_type;
		int item_cost;
		if(s==1)
		{
			//System.out.println("item name");
			item_name=sc.next();
			
			//System.out.println("item type");
			item_type=sc.next();
			
			//System.out.println("item cost");
			item_cost=sc.nextInt();
			
			System.out.println("\n");
			System.out.println("Details of menu ");
			Menu m=new MenuItems(item_name,item_type,item_cost) {
			};
			m.items_veg();
		}
		else if(s==2)
		{
			//System.out.println("pls enter item name");
			item_name=sc.nextLine();
			
			//System.out.println("item type");
			item_type=sc.next();
			
			//System.out.println("item cost");
			item_cost=sc.nextInt();
			
			System.out.println("\n");
			System.out.println("Details of menu ");
			Menu m2=new MenuItems(item_name,item_type,item_cost)
			{
			};
			m2.items_non_veg();
		}
	System.out.println("-------------------------------------------------------------------------------------------");
	
	//System.out.println("offer id");
	int o_id=sc.nextInt();
	
	//System.out.println("offer code");
	int o_code=sc.nextInt();
	
	//System.out.println("offer discount");
	int o_discount=sc.nextInt();
	
	System.out.println("\n");
	System.out.println("Details of Offers ");
	Offers o=new OfferDetails(o_id, o_code,o_discount) {
	};
	o.offers();
	System.out.println("-------------------------------------------------------------------------------------------");
	
	//System.out.println("customer name");
	String c_name=sc.next();
	
	//System.out.println("customer id");
	int c_id=sc.nextInt();
	
	//System.out.println("customer reserved table");
	int c_table=sc.nextInt();
	
	//System.out.println("customer discount");
	int c_discount=o_discount;
	
	//System.out.println("customer time slot");
	String c_timeslot=sc.next();
	
	//System.out.println("customer phone number");
	long c_phone_no=sc.nextLong();
	
	System.out.println("\n");
	System.out.println("Details of Customer ");
	Customer c=new CustomerDetails(c_name,c_id,c_table,c_discount,c_timeslot,c_phone_no) {
	};
	c.costomer();	
	
	System.out.println("-------------------------------------------------------------------------------------------");
	
	//System.out.println("orderr id");
	int or_id=sc.nextInt();
	
	//System.out.println("orderr item");
	String or_item=sc.next();
	
	//System.out.println("orderr table");
	int or_table=c_table;
	
	System.out.println("\n");
	System.out.println("Details of Orders ");
	Order order=new OrderDetails(or_id,or_item,or_table) {
	};
	order.order();
	System.out.println("-------------------------------------------------------------------------------------------");
	
	//System.out.println("billing id");
	int b_id=c_id;
	
	//System.out.println("total amount with discount");
	if(s==1)
	{
		int b_amount=0;
		b_amount=(b_amount)-(o_discount);
	}
	else if(s==2)
	{
		int b_amount1=0;
	 b_amount1=(b_amount1)-(o_discount);
	}
	
	System.out.println("\n");
	System.out.println("Details of Billing ");
	Billing billing=new BillingDetails(1,200) {
	};
	billing.billing();
	}
}
