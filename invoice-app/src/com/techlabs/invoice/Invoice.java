package com.techlabs.invoice;

public class Invoice {

	private int no;
	private String name;
	private double amount;
	private double discountPercentage;
	private float GST;

	public Invoice(int no, String name, double amount, double discountPercentage, float GST) {
		super();
		this.no = no;
		this.name = name;
		this.amount = amount;
		this.discountPercentage = discountPercentage;
		this.GST = GST;
	}

	public int getNo() {
		return no;
	}

	public String getName() {
		return name;
	}

	public double getAmount() {
		return amount;
	}

	public double getDiscountPercentage() {
		return discountPercentage;
	}

	public float getGST() {
		return GST;
	}

	public double calculateDiscount() {
		return amount - (amount * (discountPercentage / 100));
	}

	public double calculateGST() {
		return calculateDiscount() * (GST / 100);
	}

	public double calculateTotalCost() {
		return calculateDiscount() + calculateGST();
	}
}
