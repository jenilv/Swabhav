package com.techlabs.basic.app;

public class WrapperTest {

	public static void main(String[] args) {
		int ii = 4;
		Integer integer = 4;
		Integer integer2 = new Integer(ii);
		int a = integer2;

		Integer i = 22;
		Double d = 35.0;
		d = d + i;
		System.out.println("value of d is " + d);

		int s = 22;
		Double double1 = 35.0;
		double1 = double1 + s;
		System.out.println(double1.getClass());
	}

}
