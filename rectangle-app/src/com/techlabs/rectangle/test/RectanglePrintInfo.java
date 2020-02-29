package com.techlabs.rectangle.test;

import com.techlabs.rectangle.Rectangle;

public class RectanglePrintInfo {

	public static void main(String[] args) {
		Rectangle small = new Rectangle();
		small.setHeight(5);
		small.setWidth(10);
		printInfo(small);
		System.out.println("==================");
		Rectangle big = new Rectangle();
		big.setHeight(50);
		big.setWidth(100);
		big.calculateArea();
		printInfo(big);
	}

	public static void printInfo(Rectangle rectangle) {
		System.out.println(rectangle.getHeight());
		System.out.println(rectangle.getWidth());
		System.out.println(rectangle.calculateArea());
	}

}
