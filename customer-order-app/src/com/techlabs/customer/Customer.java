package com.techlabs.customer;

import java.util.List;

public class Customer {

	private int customerId;
	private String customerName;
	private String customerAddress;
	private List<Order> listOfOrders;

	public Customer(int customerId, String customerName, String customerAddress, List<Order> listOfOrders) {
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerAddress = customerAddress;
		this.listOfOrders = listOfOrders;
	}

	public final int getCustomerId() {
		return customerId;
	}

	public final String getCustomerName() {
		return customerName;
	}

	public final String getCustomerAddress() {
		return customerAddress;
	}

	public final List<Order> getListOfOrders() {
		return listOfOrders;
	}

	public void addOrder(Order order) {
		if (listOfOrders != null) {
			listOfOrders.add(order);
		}
	}

	private Order searchOrder(int orderId) {
		for (Order order : listOfOrders) {
			if (orderId == order.getOrderId()) {
				return order;
			}
		}

		return null;
	}

	public boolean removeOrder(int orderId) {
		Order orderToRemove = null;
		for (Order order : listOfOrders) {
			if (orderId == order.getOrderId()) {
				orderToRemove = order;
			}
		}

		return listOfOrders.remove(orderToRemove);
	}
}
