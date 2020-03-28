package com.techlabs.inheritance;

public class Boy extends Man {

	@Override
	public void plays() {
		System.out.println("Boy is playing");
	}

	@Override
	public void reads() {
		System.out.println("Boy is reading");
	}

	public void eats() {
		System.out.println("Boy is eating");
	}

}
