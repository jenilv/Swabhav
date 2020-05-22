package com.techlabs.srp.test;

import com.techlabs.srp.Invoice;
import com.techlabs.srp.InvoicePrinter;

public class InvoiceTest {

	public static void main(String[] args) {
		Invoice invoice = new Invoice(1, "Invoice1", 5000, 10);
		InvoicePrinter invoicePrinter = new InvoicePrinter(invoice);
		invoicePrinter.printInvoice();
	}
}
