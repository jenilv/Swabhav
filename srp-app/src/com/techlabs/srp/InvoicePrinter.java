package com.techlabs.srp;

public class InvoicePrinter {

	private Invoice invoice;

	public InvoicePrinter(Invoice invoice) {
		this.invoice = invoice;
	}

	public void printInvoice() {
		System.out.println("Invoice Number: " + invoice.getInvoiceNumber());
		System.out.println("Invoice Name: " + invoice.getInvoiceName());
		System.out.println("Invoice Amount: " + invoice.getAmount());
		System.out.println("Invoice Discount Percentage: " + invoice.getDiscountPercentage());
		System.out.println("Invoice GST Percentage: " + invoice.getGST());
		System.out.println("Invoice GST Amount: " + invoice.calculateGST());
		System.out.println("Invoice Discount Amount: " + invoice.calculateDiscount());
		System.out.println("Invoice Total Cost: " + invoice.calculateTotalCost());
	}

}
