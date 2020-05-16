package com.techlabs.crudable;

public class InvoiceDb implements ICrudable {

	@Override
	public void create() {
		System.out.println("Creating Invoice");
	}

	@Override
	public void read() {
		System.out.println("Reading Invoice");
	}

	@Override
	public void update() {
		System.out.println("Updating Invoice");
	}

	@Override
	public void delete() {
		System.out.println("Deleting Invoice");
	}

}
