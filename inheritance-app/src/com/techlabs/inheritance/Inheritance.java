package com.techlabs.inheritance;

public class Inheritance {

	public static void main(String[] args) {
		Base base = new Base("base foo");
		System.out.println(base.getFoo());
		Child childClass = new Child("foo");
		System.out.println(childClass.getFoo());

		Base b = new Child("C");
	}
}
