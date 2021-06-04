package com.vm.training.java.dao;

import java.util.Map;

import com.vm.training.java.bean.*;

public interface IproductDAO 
{
	Product getProductByID(int id);
	Map<Integer,Product> getAllProducts();

}
