package com.techlabs.circle;

public class Circle {

	private float radius;
	private String color;
	private final float PI = 3.14f;
	private final String DEFAULT_COLOR = "Yellow";

	public float getRadius() {
		return radius;
	}

	public void setRadius(float radius) {
		this.radius = radius;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		if (color.equalsIgnoreCase("black") || color.equalsIgnoreCase("blue") || color.equalsIgnoreCase("red")) {
			this.color = color;
		} else {
			this.color = DEFAULT_COLOR;
		}

	}

	public float calculateArea() {
		return PI * radius * radius;
	}

	public float calculatePerimeter() {
		return 2 * PI * radius;
	}
}
