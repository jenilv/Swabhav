package com.techlabs.inheritance;

public class Base {

	private String foo;

	public Base() {
		System.out.println("Base class constructor is called");
	}

	public Base(String foo) {
		this.foo = foo;
	}

	public String getFoo() {
		return foo;
	}
}
