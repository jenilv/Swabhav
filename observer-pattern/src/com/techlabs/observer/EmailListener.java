package com.techlabs.observer;

public class EmailListener implements Listener {

	@Override
	public void update(String string) {
		System.out.println(string);
	}
}
