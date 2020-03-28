package com.techlabs.customer.test;

import com.techlabs.customer.Customer;

public class CustomerTest {

	public static void main(String[] args) {
		Customer c1 = new Customer("ABC", 10);
		printInfo(c1);
		System.out.println("--------");
		Customer c2 = new Customer("DEF", 20);
		printInfo(c2);
		System.out.println("--------");
		Customer c3 = new Customer("GHI", 40);
		printInfo(c3);
	}

	private static void printInfo(Customer customer) {
		System.out.println("Customer id: " + customer.getId());
		System.out.println("Customer name: " + customer.getId());
		System.out.println("Customer orders: " + customer.getOrders());
	}
}
