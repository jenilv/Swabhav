package com.techlabs.circle;

public class CircleTest2 {

	public static void main(String[] args) {

		Circle circles[] = new Circle[5];
		circles[0] = createCircle(10, "Black");
		circles[1] = createCircle(05, "Blue");
		circles[2] = createCircle(23, "Green");
		circles[3] = createCircle(02, "Red");
		circles[4] = createCircle(03, "Pink");

		printInfo(circles);
	}

	private static Circle createCircle(int radius, String color) {
		Circle circle = new Circle();
		circle.setRadius(radius);
		circle.setColor(color);
		return circle;
	}

	private static void printInfo(Circle[] circles) {
		for (Circle circle : circles) {
			printInfo(circle);
		}
	}

	private static void printInfo(Circle circle) {
		System.out.println("Radius " + circle.getRadius());
		System.out.println("Color " + circle.getColor());
		System.out.println("Area " + circle.calculateArea());
		System.out.println("Perimeter " + circle.calculatePerimeter());
		System.out.println("-------------");
	}
}