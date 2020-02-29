package com.techlabs.rectangle.test;

import com.techlabs.rectangle.Rectangle;

public class RectangleAnonymousTest {

	public static void main(String[] args) {
		System.out.println(new Rectangle());
		System.out.println(new Rectangle().getHeight());

		printInfo(new Rectangle());
	}

	public static void printInfo(Rectangle r) {
		System.out.println(r.getWidth());
	}
}
