package com.vm.training.java.bean;

public class Product {
	private int productId;
	private String productName;
	private String productQuality;
	
	public Product() {
		super();
	}

	public Product(int productId, String productName, String productQuality) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productQuality = productQuality;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductQuality() {
		return productQuality;
	}

	public void setProductQuality(String productQuality) {
		this.productQuality = productQuality;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productQuality=" + productQuality
				+ "]";
	}
	
	
}
