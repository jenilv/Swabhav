package com.techlabs.rectangle.test;

import com.techlabs.rectangle.Rectangle;

public class RectangleTest2 {

	public static void main(String[] args) {

		Rectangle[] rectangles = new Rectangle[5];
		rectangles[0] = createRectangle(10, 20, "Black");
		rectangles[1] = createRectangle(05, 10, "Blue");
		rectangles[2] = createRectangle(23, 46, "Green");
		rectangles[3] = createRectangle(02, 4, "Red");
		rectangles[4] = createRectangle(03, 6, "Pink");

		printInfo(rectangles);
	}

	private static Rectangle createRectangle(int height, int width, String color) {
		Rectangle rectangle = new Rectangle();
		rectangle.setHeight(height);
		rectangle.setWidth(width);
		rectangle.setColor(color);
		return rectangle;
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
		System.out.println("Color " + rectangle.getColor());
		System.out.println("-------------");
	}
}
