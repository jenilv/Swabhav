package com.techlabs.circle;

public class Circle {

	private float radius;
	private final float PI = 3.14f;

	public float getRadius() {
		return radius;
	}

	public void setRadius(float radius) {
		this.radius = radius;
	}

	public float calculateArea() {
		return PI * radius * radius;
	}

	public float calculatePerimeter() {
		return 2 * PI * radius;
	}
}
