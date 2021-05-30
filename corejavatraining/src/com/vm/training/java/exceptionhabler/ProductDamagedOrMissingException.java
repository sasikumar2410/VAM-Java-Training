package com.vm.training.java.exceptionhabler;

public class ProductDamagedOrMissingException extends Exception
{
	String message;

	
	public ProductDamagedOrMissingException(String message) {
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
