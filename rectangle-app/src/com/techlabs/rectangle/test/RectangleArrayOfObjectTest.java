package com.techlabs.rectangle.test;

import com.techlabs.rectangle.Rectangle;

public class RectangleArrayOfObjectTest {

	public static void main(String[] args) {

		Rectangle[] rectangles = new Rectangle[4];

		rectangles[0] = new Rectangle();
		Rectangle r1 = new Rectangle();
		r1.setHeight(4);
		r1.setWidth(8);

		Rectangle r2 = new Rectangle();
		r2.setHeight(6);
		r2.setWidth(10);

		Rectangle r3 = new Rectangle();
		r3.setHeight(10);
		r3.setWidth(40);

		rectangles[1] = r1;
		rectangles[2] = r2;
		rectangles[3] = r3;

		printInfo(rectangles);
	}

	private static void printInfo(Rectangle[] rectangles) {
		for (Rectangle rectangle : rectangles) {
			printInfo(rectangle);
		}
	}

	private static void printInfo(Rectangle rectangle) {
		System.out.println("Height " + rectangle.getHeight());
		System.out.println("Width " + rectangle.getWidth());
		System.out.println("Area " + rectangle.calculateArea());
	}
}
