package com.techlabs.shoppingcart.test;

import java.util.Calendar;
import java.util.Scanner;

import com.techlabs.shoppingcart.Customer;
import com.techlabs.shoppingcart.CustomerManager;
import com.techlabs.shoppingcart.Product;

public class ShoppingCartTest {

	public static void main(String[] args) {

		Customer customer = new Customer(1, "JV", Calendar.getInstance(), "Mumbai");
		CustomerManager manager = new CustomerManager(customer);

		Scanner scanner = new Scanner(System.in);

		boolean didNotExit = true;
		while (didNotExit) {
			System.out.println(
					"What would you like to do?\n 1. Add Product to Cart\n 2. Search Product in Cart\n 3. Delete From Cart.\n 4. Total Cart Cost.\n 5. Display Cart.\n 6. Exit");
			switch (scanner.nextInt()) {
			case 1: {
				Product product = new Product();
				System.out.println("Enter Product ID");
				product.setProductId(scanner.nextInt());
				System.out.println("Enter Product Name");
				product.setProductName(scanner.next());
				System.out.println("Enter product price");
				product.setUnitPrice(Double.valueOf(scanner.next()));
				System.out.println("Enter Discount");
				product.setDiscount(scanner.nextInt());

				System.out.println("Adding product to cart\n" + product.toString());
				manager.addIntoCart(product);
				break;
			}
			case 2: {
				System.out.println("Enter Product Name");
				Product product = manager.searchFromCart(scanner.next());
				if (product != null) {
					System.out.println(product.toString());
				} else {
					System.out.println("Product not found!");
				}
				break;
			}
			case 3: {
				System.out.println("Enter product name to delete");
				manager.deleteFromCart(scanner.next());
				System.out.println("Product deleted!");
			}
			case 4: {
				System.out.println("Total cart cost is: " + manager.totalCartCost());
			}
			case 5: {
				for (Product product : manager.getAllProducts()) {
					System.out.println("Product ID: " + product.getProductId());
					System.out.println("Product Name: " + product.getProductName());
					System.out.println("Product Cost: " + product.getUnitPrice());
					System.out.println("Product Discount: " + product.getDiscount());
				}
				break;
			}
			case 6: {
				System.out.println("Exiting!");
				didNotExit = false;
				break;
			}
			default: {
				System.out.println("Invalid option!");
				break;
			}
			}
		}
		scanner.close();

	}
}
