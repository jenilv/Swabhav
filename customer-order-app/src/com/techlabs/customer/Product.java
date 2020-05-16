package com.techlabs.customer;

public class Product {

	private int productId;
	private String productName;
	private double price;

	public Product(int productId, String productName, double price) {
		this.productId = productId;
		this.productName = productName;
		this.price = price;
	}

	public final int getProductId() {
		return productId;
	}

	public final String getProductName() {
		return productName;
	}

	public final double getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", price=" + price + "]";
	}

}
