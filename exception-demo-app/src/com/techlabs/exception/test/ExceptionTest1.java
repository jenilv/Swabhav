package com.techlabs.exception.test;

public class ExceptionTest1 {

	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = a / b;
		System.out.println("Result is: " + c);

		System.out.println("End of Program");
	}
}
