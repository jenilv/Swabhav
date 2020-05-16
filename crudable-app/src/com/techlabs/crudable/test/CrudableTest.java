package com.techlabs.crudable.test;

import com.techlabs.crudable.AddressDb;
import com.techlabs.crudable.CustomerDb;
import com.techlabs.crudable.ICrudable;
import com.techlabs.crudable.InvoiceDb;

public class CrudableTest {

	public static void main(String[] args) {

		ICrudable address = new AddressDb();
		printInfo(address);
		System.out.println("------");
		ICrudable customer = new CustomerDb();
		printInfo(customer);
		System.out.println("------");
		ICrudable invoice = new InvoiceDb();
		printInfo(invoice);
	}

	private static void printInfo(ICrudable iCrudable) {
		iCrudable.create();
		iCrudable.read();
		iCrudable.update();
		iCrudable.delete();
	}
}
