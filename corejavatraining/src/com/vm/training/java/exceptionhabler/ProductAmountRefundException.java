package com.vm.training.java.exceptionhabler;

public class ProductAmountRefundException extends Exception
{
	String message;

	public ProductAmountRefundException(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
