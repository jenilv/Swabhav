package com.techlabs.inheritance;

public class Child extends Base {

	private String foo;

	public Child() {
		System.out.println("Child class constructor is called");
	}

	public Child(String foo) {
		super(foo);
		this.foo = foo;
	}

	public String getFoo() {
		return super.getFoo();
	}

	public void childMethod() {
		System.out.println("printing from child class");
	}
}
