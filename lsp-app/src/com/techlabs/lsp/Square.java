package com.techlabs.lsp;

public class Square extends Rectangle {

	public Square(int side) {
		super(side, side);
	}

	@Override
	public void setHeight(int newHeight) {
		super.height = newHeight;
		super.width = newHeight;
	}

	@Override
	public void setWidth(int newWidth) {
		super.height = newWidth;
		super.width = newWidth;
	}
}