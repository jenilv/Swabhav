package com.techlabs.shoppingcart;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class CustomerManager {

	private final String FILE_NAME = "/resources/Customer.csv";
	private List<Product> cart;

	public CustomerManager(Customer customer) {
		this.cart = customer.getCart();
		try {
			new File(FILE_NAME).createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void saveCart() {
		FileOutputStream fileOutputStream = null;
		ObjectOutputStream objectOutputStream = null;
		try {
			fileOutputStream = new FileOutputStream(FILE_NAME);
			objectOutputStream = new ObjectOutputStream(fileOutputStream);
			objectOutputStream.writeObject(cart);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (fileOutputStream != null) {
				try {
					fileOutputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (objectOutputStream != null) {
				try {
					objectOutputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}

	private void getCart() {
		FileInputStream fileInputStream = null;
		ObjectInputStream objectInputStream = null;
		try {
			fileInputStream = new FileInputStream(FILE_NAME);
			if (fileInputStream.available() != 0) {
				objectInputStream = new ObjectInputStream(fileInputStream);
				cart = (List<Product>) objectInputStream.readObject();
			} else {
				cart = new ArrayList<>();
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			if (fileInputStream != null)
				try {
					fileInputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			if (objectInputStream != null)
				try {
					objectInputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}

		}
	}

	public void addIntoCart(Product product) {
		cart.add(product);
		saveCart();
	}

	public Product searchFromCart(String productName) {

		for (Product product : cart) {
			if (product.getProductName().equalsIgnoreCase(productName)) {
				return product;
			}
		}

		return null;
	}

	public void deleteFromCart(String productName) {
		Product productToDelete = null;
		for (Product product : cart) {
			if (product.getProductName().equalsIgnoreCase(productName)) {
				productToDelete = product;
			}
		}

		cart.remove(productToDelete);
		saveCart();
	}

	public double totalCartCost() {
		double totalCost = 0;
		for (Product product : cart) {
			totalCost += product.getUnitPrice();
		}

		return totalCost;
	}

	public List<Product> getAllProducts() {
		return cart;
	}
}