package com.techlabs.customer;

public class LineItem {

	private int lineItemId;
	private int quantity;
	private Product product;

	public LineItem(int lineItemId, int quantity, Product product) {
		this.lineItemId = lineItemId;
		this.quantity = quantity;
		this.product = product;
	}

	public final int getLineItemId() {
		return lineItemId;
	}

	public final int getQuantity() {
		return quantity;
	}

	public final Product getProduct() {
		return product;
	}

	public void setQuantitiy(int quantitiy) {
		this.quantity = quantitiy;
	}

	public double calculatePrice() {
		return quantity * product.getPrice();
	}
}
