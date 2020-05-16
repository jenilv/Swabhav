package com.techlabs.customer;

import java.util.Date;
import java.util.List;

public class Order {

	private int orderId;
	private Date orderDate;
	private List<LineItem> lineItems;

	public Order(int orderId, Date orderDate, List<LineItem> lineItems) {
		this.orderId = orderId;
		this.orderDate = orderDate;
		this.lineItems = lineItems;
	}

	public final int getOrderId() {
		return orderId;
	}

	public final Date getOrderDate() {
		return orderDate;
	}

	public final List<LineItem> getLineItems() {
		return lineItems;
	}

	public void addToLineItems(LineItem lineItem) {
		if (lineItems != null) {

			boolean isPresent = false;

			for (LineItem item : lineItems) {
				if (lineItem.getProduct().getProductId() == item.getProduct().getProductId()) {
					isPresent = true;
					item.setQuantitiy(item.getQuantity() + lineItem.getQuantity());
				}
			}

			if (!isPresent) {
				lineItems.add(lineItem);
			}
		}
	}

	public boolean removeFromLineItem(int lineItemId) {
		LineItem lineItemToDelete = null;
		for (LineItem lineItem : lineItems) {
			if (lineItemId == lineItem.getLineItemId()) {
				lineItemToDelete = lineItem;
			}
		}

		return lineItems.remove(lineItemToDelete);
	}

	public double getTotalPrice() {
		double totalPrice = 0;

		for (LineItem lineItem : lineItems) {
			totalPrice += lineItem.calculatePrice();
		}

		return totalPrice;
	}
}
