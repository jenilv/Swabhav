package com.techlabs.basic.app;

public class Overloading {

	public static void main(String[] args) {
		print(true);
		print('A');
		print(4);
		print(4l);
		print(4.0);
		print(4.0f);
		print(new char[] {'a', 'b', 'c', 'v'});
		print("Hello");
	}

	private static void print(boolean b) {
		System.out.println(b);
	}

	private static void print(char c) {
		System.out.println(c);
	}

	private static void print(int i) {
		System.out.println(i);
	}

	private static void print(long l) {
		System.out.println(l);
	}

	private static void print(float f) {
		System.out.println(f);
	}

	private static void print(double d) {
		System.out.println(d);
	}

	private static void print(char[] arr) {
		System.out.println(arr);
	}

	private static void print(String s) {
		System.out.println(s);
	}
}
