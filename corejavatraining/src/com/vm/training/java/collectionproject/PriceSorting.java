package com.vm.training.java.collectionproject;

import java.util.Comparator;

class PriceSorting implements Comparator<Product>
{

	@Override
	public int compare(Product o1, Product o2) {
		// TODO Auto-generated method stub
		if(o1.getP_cost()==o2.getP_cost())
			return 0;
		else if(o1.getP_cost()>o2.getP_cost())
			return 1;
		else
		return -1;
	}
	
}
