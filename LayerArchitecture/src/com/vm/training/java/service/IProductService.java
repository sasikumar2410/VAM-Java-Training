package com.vm.training.java.service;
import java.util.Map;

import com.vm.training.java.bean.Product;
public interface IProductService {
	Product getByProductID(int id);
	Map<Integer,Product> getAllProducts();
}
