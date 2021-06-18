package com.vm;

import java.util.List;
import java.util.Optional;

import javax.activation.CommandObject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.vm.dao.IProductDao;
import com.vm.entity.Product;

@SpringBootApplication
public class SptingBootDemo1Application implements CommandLineRunner{
	@Autowired
	IProductDao iProductDao;
	public static void main(String[] args) {
		
		SpringApplication.run(SptingBootDemo1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("-------This is my first Spring application-------");
		Product product=new Product(101, "Laptop", "Electronics",88000);
		iProductDao.save(product);
		System.out.println("---------find all product-------------");
		List<Product> list=iProductDao.findAll();
		list.forEach(System.out::println);
		System.out.println("=======Find by Id==========");
		Optional<Product> listById=iProductDao.findById(105);
		System.out.println(listById);
		System.out.println("========Find By Category========");
		List<Product> listByCategory=iProductDao.findByCategory("Fruits");
		listByCategory.forEach(System.out::println);
		

	}
	

}
