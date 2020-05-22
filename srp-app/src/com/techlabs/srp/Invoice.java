package com.techlabs.srp;

public class Invoice {

	private int invoiceNumber;
	private String invoiceName;
	private double amount;
	private double discountPercentage;
	private static final float GST = 12;

	public Invoice(int invoiceNumber, String invoiceName, double amount, double discountPercentage) {
		this.invoiceNumber = invoiceNumber;
		this.invoiceName = invoiceName;
		this.amount = amount;
		this.discountPercentage = discountPercentage;
	}

	public final int getInvoiceNumber() {
		return invoiceNumber;
	}

	public final String getInvoiceName() {
		return invoiceName;
	}

	public final double getAmount() {
		return amount;
	}

	public final double getDiscountPercentage() {
		return discountPercentage;
	}

	public final float getGST() {
		return GST;
	}

	public double calculateDiscount() {
		return amount * (discountPercentage / 100);
	}

	public double calculateGST() {
		return (amount - calculateDiscount()) * (GST / 100);
	}

	public double calculateTotalCost() {
		return amount - calculateDiscount() + calculateGST();
	}
}
