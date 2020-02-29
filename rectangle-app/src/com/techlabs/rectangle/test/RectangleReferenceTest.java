package com.techlabs.rectangle.test;

import com.techlabs.rectangle.Rectangle;

public class RectangleReferenceTest {

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		Rectangle r2;

		r2 = r1;

		r2.setWidth(r2.getWidth() + 1);
		r2.setHeight(r2.getHeight() + 1);

		System.out.println(r1.getHeight());
		System.out.println(r1.getWidth());
		System.out.println(r1.hashCode());
		System.out.println("==================");
		System.out.println(r2.getHeight());
		System.out.println(r2.getWidth());
		System.out.println(r2.hashCode());
	}

}
