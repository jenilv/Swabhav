package com.techlabs.rectangle.test;

import com.techlabs.rectangle.Rectangle;

public class RectangleTest {

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		// without setting
		System.out.println(r1.getHeight());
		System.out.println(r1.getWidth());
		// setting height and width
		r1.setHeight(10);
		r1.setWidth(20);
		// calculating and printing
		System.out.println(r1.getHeight());
		System.out.println(r1.getWidth());
		System.out.println(r1.calculateArea());
	}

}
