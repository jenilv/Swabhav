package com.techlabs.interfacedemo;

public class Bike implements IMovable {

	@Override
	public void start() {
		System.out.println("Bike is starting");
	}

	@Override
	public void stop() {
		System.out.println("Bike is stopping");
	}

}
