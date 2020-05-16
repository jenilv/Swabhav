package com.techlabs.interfaces;

public class Man implements ISocializable, IEmotionable {

	@Override
	public void cry() {
		System.out.println("Man is crying");
	}

	@Override
	public void laugh() {
		System.out.println("Man is laughing");
	}

	@Override
	public void wish() {
		System.out.println("Man is wishing");
	}

	@Override
	public void depart() {
		System.out.println("Man is departing");
	}

}
