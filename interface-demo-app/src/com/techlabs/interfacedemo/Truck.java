package com.techlabs.interfacedemo;

public class Truck implements IMovable {

	@Override
	public void start() {
		System.out.println("Truck is starting");
	}

	@Override
	public void stop() {
		System.out.println("Truck is stopping");
	}

}
