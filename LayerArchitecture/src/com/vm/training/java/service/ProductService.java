package com.vm.training.java.service;

import java.util.Map;

import com.vm.training.java.bean.Product;
import com.vm.training.java.dao.ProductDAO;
import com.vm.training.java.dao.IproductDAO;

public class ProductService implements IProductService {

	IproductDAO productDao=new ProductDAO();
	@Override
	public Product getByProductID(int id) 
	{
		
		return productDao.getProductByID(id);
	}
	@Override
	public Map<Integer, Product> getAllProducts() {
		// TODO Auto-generated method stub
		return productDao.getAllProducts();
	}
}