package com.techlabs.basic.app;

public class StringTest {

	public static void main(String[] args) {
		test();
	}

	public static void test() {
		String string = "jenil";
		System.out.println(string.hashCode());
		System.out.println(string.toUpperCase().hashCode());
		String tempString = string;
		System.out.println(tempString == string);
		System.out.println(tempString.hashCode());
		System.out.println(tempString.toUpperCase().hashCode());
		tempString = new String(string);
		System.out.println(tempString == string);
		System.out.println(tempString.hashCode());
		System.out.println(tempString.toUpperCase().hashCode());
	}
}
