package com.vm.training.java.util;

import java.util.HashMap;
import java.util.Map;

import com.vm.training.java.bean.*;

public class CollectionUntil {

private static Map<Integer, Product> products = new HashMap<Integer,Product>();
    
    static
    {
        products.put(100, new Product(100, "laptop", "electronics", 78000));
        products.put(101, new Product(101, "mobile", "electronics", 46000));
        products.put(102, new Product(102, "t-shirt", "cloth", 1500));

    }

    public static Map<Integer,Product> getProducts()
    {
        return products;
    }

}
