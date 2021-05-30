package com.vm.training.java.miniproject;

public abstract class OrderDetails implements Order
{
	int order_id; String order_item; int order_tableNumber;
	
	public OrderDetails(int order_id, String order_item, int order_tableNumber) {
		super();
		this.order_id = order_id;
		this.order_item = order_item;
		this.order_tableNumber = order_tableNumber;
	}
   

	public void order() {
		// TODO Auto-generated method stub
	System.out.println("OrderDetails [order_id=" + order_id + ", order_item=" + order_item + ", order_tableNumber="
				+ order_tableNumber + "]");	
	}

}
