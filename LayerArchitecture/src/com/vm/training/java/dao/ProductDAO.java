package com.vm.training.java.dao;

import java.util.Map;

import com.vm.training.java.bean.Product;
import com.vm.training.java.util.CollectionUntil;
public class ProductDAO implements IproductDAO
{
	
	//CollectionUtil collectionutil= new CollectionUtil();
	@Override
	public Product getProductByID(int id) 
	{
		Map <Integer,Product> hashmap= CollectionUntil.getProducts();
		Product product = hashmap.get(id);
		return product;
	}

	@Override
	public Map getAllProducts() {
		
		return CollectionUntil.getProducts();
	}
	
}