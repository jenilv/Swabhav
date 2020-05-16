package com.techlabs.customer.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import com.techlabs.customer.Customer;
import com.techlabs.customer.LineItem;
import com.techlabs.customer.Order;
import com.techlabs.customer.Product;

public class CustomerTest {

	public static void main(String[] args) {

		Product product = new Product(1, "Paper", 100);
		Product product2 = new Product(2, "Pen", 50);

		LineItem lineItem = new LineItem(1, 2, product);
		LineItem lineItem2 = new LineItem(2, 3, product2);
		LineItem lineItem3 = new LineItem(3, 5, product);
		LineItem lineItem4 = new LineItem(4, 3, product2);

		List<LineItem> itemsForOrder1 = new ArrayList<>();
		itemsForOrder1.add(lineItem);
		itemsForOrder1.add(lineItem2);

		Order order = new Order(1, new Date(), itemsForOrder1);
		order.addToLineItems(lineItem3);

//		List<LineItem> itemsForOrder2 = new ArrayList<>();
//		itemsForOrder2.add(lineItem3);
//		itemsForOrder2.add(lineItem4);
//		Order order2 = new Order(2, new Date(), itemsForOrder2);
//		order2.addToLineItems(lineItem4);
		order.removeFromLineItem(1);

		Customer customer = new Customer(1, "JV", "Mum", Arrays.asList(order));

		printInfo(customer);
	}

	private static void printInfo(Customer customer) {
		System.out.println("Customer details are");
		System.out.println("Customer Id: " + customer.getCustomerId());
		System.out.println("Customer Name: " + customer.getCustomerName());
		System.out.println("Customer Address: " + customer.getCustomerAddress());
		System.out.println("**********");
		System.out.println("Order Details");
		for (Order order : customer.getListOfOrders()) {
			System.out.println("Order Date: " + order.getOrderDate());
			for (LineItem lineItem : order.getLineItems()) {
				System.out.println(lineItem.getProduct().toString());
				System.out.println("Quantity: " + lineItem.getQuantity());
				System.out.println("Total Price: " + lineItem.calculatePrice());
			}
			System.out.println("Total order Price: " + order.getTotalPrice());
			System.out.println("=========");
		}

	}
}
