package com.techlabs.circle;

public class CircleTest {

	public static void main(String[] args) {

		Circle[] circles = new Circle[5];

		Circle c1 = new Circle();
		c1.setRadius(5);
		circles[0] = c1;

		Circle c2 = new Circle();
		c2.setRadius(10);
		circles[1] = c2;

		Circle c3 = new Circle();
		c3.setRadius(6);
		circles[2] = c3;

		Circle c4 = new Circle();
		c4.setRadius(7);
		circles[3] = c4;

		Circle c5 = new Circle();
		c5.setRadius(9);
		circles[4] = c5;

		printInfo(circles);
		System.out.println("-------------------------");
		Circle biggestCircle = findBiggestCircle(circles);
		printInfo(biggestCircle);
		System.out.println("=========================");
		Circle biggestPerimeter = findBiggestPerimeter(circles);
		printInfo(biggestPerimeter);
	}

	private static void printInfo(Circle[] circles) {
		for (Circle circle : circles) {
			printInfo(circle);
		}
	}

	private static void printInfo(Circle circle) {
		System.out.println("Radius " + circle.getRadius());
		System.out.println("Area " + circle.calculateArea());
		System.out.println("Perimeter " + circle.calculatePerimeter());
	}

	private static Circle findBiggestCircle(Circle[] circles) {
		Circle biggestCircle = circles[0];
		for (Circle circle : circles) {
			if (circle.getRadius() > biggestCircle.getRadius()) {
				biggestCircle = circle;
			}
		}
		return biggestCircle;
	}

	private static Circle findBiggestPerimeter(Circle[] circles) {
		Circle biggestCircle = circles[0];
		for (Circle circle : circles) {
			if (circle.calculatePerimeter() > biggestCircle.calculatePerimeter()) {
				biggestCircle = circle;
			}
		}
		return biggestCircle;
	}
}
