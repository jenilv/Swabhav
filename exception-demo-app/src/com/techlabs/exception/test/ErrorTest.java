package com.techlabs.exception.test;

public class ErrorTest {

	public static void main(String[] args) {
		recursivePrint(1);
	}

	public static void recursivePrint(int num) {
		System.out.println("Number: " + num);

		if (num == 0)
			return;
		else
			recursivePrint(++num);
	}

}
