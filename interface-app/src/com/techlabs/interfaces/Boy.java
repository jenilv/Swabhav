package com.techlabs.interfaces;

public class Boy implements IEmotionable {

	@Override
	public void cry() {
		System.out.println("Boy is crying");
	}

	@Override
	public void laugh() {
		System.out.println("Boy is laughing");
	}

}
