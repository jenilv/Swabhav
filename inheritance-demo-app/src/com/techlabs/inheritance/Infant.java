package com.techlabs.inheritance;

public class Infant extends Man {

	@Override
	public void plays() {
		System.out.println("Infant is playing");
	}

	@Override
	public void reads() {
		System.out.println("Infant is reading");
	}

}
