package com.techlabs.rectangle;

public class Rectangle {

	private int width;
	private int height;
	private String color;

	private final int START_RANGE = 1;
	private final int END_RANGE = 100;
	private final String DEFAULT_COLOR = "Yellow";

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = getValidDimension(width);
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = getValidDimension(height);
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

	public int calculateArea() {
		return height * width;
	}

	private int getValidDimension(int dimension) {
		if (dimension <= START_RANGE) {
			return START_RANGE;
		} else if (dimension > END_RANGE) {
			return END_RANGE;
		} else {
			return dimension;
		}
	}
}
