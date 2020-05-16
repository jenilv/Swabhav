package com.techlabs.lineitem.test;

import java.util.ArrayList;

import com.techlabs.lineitem.LineItem;

public class LineItemTest {

	public static void main(String[] args) {
		ArrayList<LineItem> cart = new ArrayList<>();
		cart.add(new LineItem(101, 10, 30, "Apple"));
		cart.add(new LineItem(105, 5, 15, "Banana"));
		cart.add(new LineItem(199, 2, 85, "ToothPaste"));

		print(cart);
	}

	private static void print(ArrayList<LineItem> lineItems) {
		for (LineItem lineItem : lineItems) {
			System.out.println(lineItem.getId());
			System.out.println(lineItem.getName());
			System.out.println(lineItem.getQuantity());
			System.out.println(lineItem.getUnitPrice());
			System.out.println("------");
		}
	}
}
