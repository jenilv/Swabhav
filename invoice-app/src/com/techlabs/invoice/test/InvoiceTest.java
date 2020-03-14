package com.techlabs.invoice.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import com.techlabs.invoice.Invoice;

public class InvoiceTest {

	public static void main(String[] args) {

		Invoice invoice = new Invoice(1, "First", 1000, 10, 18);
		printInvoiceInfo(invoice);
		File invoiceFile = new File(System.getProperty("user.dir") + "\\invoice.txt");
		try {
			if (invoiceFile.createNewFile()) {
				writeInvoiceInfoToFile(invoiceFile, invoice);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void printInvoiceInfo(Invoice invoice) {
		System.out.println("Invoice No: " + invoice.getNo() + "\n");
		System.out.println("Invoice Name: " + invoice.getName() + "\n");
		System.out.println("Invoice Amount: " + invoice.getAmount() + "\n");
		System.out.println("Invoice Discount Percentage: " + invoice.getDiscountPercentage() + "\n");
		System.out.println("Invoice GST: " + invoice.getGST() + "\n");
		System.out.println("Invoice Calculate Discount: " + invoice.calculateDiscount() + "\n");
		System.out.println("Invoice Calculate GST: " + invoice.calculateGST() + "\n");
		System.out.println("Invoice Calculate Total Cost: " + invoice.calculateTotalCost() + "\n");
	}

	private static void writeInvoiceInfoToFile(File file, Invoice invoice) {
		try {
			BufferedWriter br = new BufferedWriter(new FileWriter(file));
			br.write("Invoice No: " + invoice.getNo() + "\n");
			br.write("Invoice Name: " + invoice.getName() + "\n");
			br.write("Invoice Amount: " + invoice.getAmount() + "\n");
			br.write("Invoice Discount Percentage: " + invoice.getDiscountPercentage() + "\n");
			br.write("Invoice GST: " + invoice.getGST() + "\n");
			br.write("Invoice Calculate Discount: " + invoice.calculateDiscount() + "\n");
			br.write("Invoice Calculate GST: " + invoice.calculateGST() + "\n");
			br.write("Invoice Calculate Total Cost: " + invoice.calculateTotalCost() + "\n");
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
