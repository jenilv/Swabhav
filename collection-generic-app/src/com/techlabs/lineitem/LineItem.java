package com.techlabs.lineitem;

public class LineItem {

	private int id;
	private double unitPrice;
	private int quantity;
	private String name;

	public LineItem(int id, double unitPrice, int quantity, String name) {
		this.id = id;
		this.unitPrice = unitPrice;
		this.quantity = quantity;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public int getQuantity() {
		return quantity;
	}

	public String getName() {
		return name;
	}

}
