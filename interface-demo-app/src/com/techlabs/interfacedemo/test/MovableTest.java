package com.techlabs.interfacedemo.test;

import com.techlabs.interfacedemo.Bike;
import com.techlabs.interfacedemo.Car;
import com.techlabs.interfacedemo.IMovable;
import com.techlabs.interfacedemo.Truck;

public class MovableTest {

	public static void main(String[] args) {
		Truck truck = new Truck();

		Car car = new Car();

		Bike bike = new Bike();
		new Thread(new Runnable() {

			@Override
			public void run() {
				printDetails(truck);
			}
		}).start();
		new Thread(new Runnable() {

			@Override
			public void run() {
				printDetails(car);
			}
		}).start();
		new Thread(new Runnable() {

			@Override
			public void run() {
				printDetails(bike);
			}
		}).start();
	}

	private static void printDetails(IMovable movable) {
		movable.start();
		movable.stop();
	}

}
