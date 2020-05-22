package com.techlabs.lsp;

public class Rectangle {

	protected int height;
	protected int width;

	public Rectangle(int height, int width) {
		this.height = height;
		this.width = width;
	}

	public void setHeight(int newHeight) {
		height = newHeight;
	}

	public void setWidth(int newWidth) {
		width = newWidth;
	}

	public int getArea() {
		return width * height;
	}
}