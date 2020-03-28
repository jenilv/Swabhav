package com.techlabs.customer;

public class Customer {

	private String id;
	private String name;
	private int orders;
	private static int customerId = 100;

	public Customer(String name, int orders) {
		this.name = name;
		this.orders = orders;
		this.id = "C" + customerId++;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getOrders() {
		return orders;
	}

}
