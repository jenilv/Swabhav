package com.techlabs.shoppingcart;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Customer {

	private int customerId;
	private String customerName;
	private Calendar purchaseDate;
	private String address;

	private List<Product> cart;

	public Customer(int customerId, String customerName, Calendar purchaseDate, String address) {
		this.customerId = customerId;
		this.customerName = customerName;
		this.purchaseDate = purchaseDate;
		this.address = address;

		getCart();
	}

	public int getCustomerId() {
		return customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public Calendar getPurchaseDate() {
		return purchaseDate;
	}

	public String getAddress() {
		return address;
	}

	public List<Product> getCart() {
		if (cart != null) {
			return cart;
		} else {
			cart = new ArrayList<>();
			return cart;
		}
	}

	public void setCart(List<Product> cart) {
		this.cart = cart;
	}
}
