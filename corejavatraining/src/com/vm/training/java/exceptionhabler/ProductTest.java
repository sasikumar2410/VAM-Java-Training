package com.vm.training.java.exceptionhabler;

import java.util.Scanner;

public class ProductTest {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter p_name");
		String product_name=sc.next();
		System.out.println("enter p_cost");
		int product_cost=sc.nextInt();
		System.out.println(" enter p_time_taken");
		int prduct_time_taken=sc.nextInt();
		System.out.println("pls conform p_name");
		String product_name1=sc.next();
		try
		{
			if(product_cost>35000)
			{
				throw new ProductDidNotReceiveException("Product not found in the site amount is miss matching");
			}
			else
			{
				System.out.println("Product found");
			}
			if(product_name.equals(product_name1))
			{
				System.out.println("product was in good condition");
			}
			else
			{
				throw new ProductDamagedOrMissingException("product wsa damaged");
			}
			if(prduct_time_taken>5)
			{
				throw new ProductAmountRefundException("Amount refunded back ");
			}
			else
			{
				System.out.println("No Amount refund back i got my product");
			}
			
				
		}
		
		catch(ProductDamagedOrMissingException e)
		{
			e.printStackTrace();
		}
		catch(ProductDidNotReceiveException e)
		{
			e.printStackTrace();
		}
		catch(ProductAmountRefundException e)
		{
			e.printStackTrace();
		}
	}

}
