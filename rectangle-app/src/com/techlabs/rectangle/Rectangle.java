package com.techlabs.rectangle;

public class Rectangle {

	private int width;
	private int height;
	private final int START_RANGE = 1;
	private final int END_RANGE = 100;

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
