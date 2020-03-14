package com.techlabs.invoice.test;

import com.techlabs.invoice.Invoice;

public class InvoiceTest {

	public static void main(String[] args) {

		Invoice invoice = new Invoice(1, "First", 1000, 10, 18);
		System.out.println(invoice.calculateDiscount());
		System.out.println(invoice.calculateGST());
		System.out.println(invoice.calculateTotalCost());
	}
}
