package com.techlag.remote.test;

import com.techlag.remote.Bark;
import com.techlag.remote.BarkRecognizer;
import com.techlag.remote.DogDoor;

public class RemoteTest {

	public static void main(String[] args) {

		DogDoor door = new DogDoor();
//		Remote remote = new Remote(door);
//
//		remote.pressButton();
//		System.out.println("Going out");
//
//		try {
//			Thread.sleep(10000);
//		} catch (InterruptedException e) {
//			System.out.println("Door closed. Opening now.");
//			remote.pressButton();
//		}

		Bark bark = new Bark("Woof");
		door.addAllowedBarks(bark);
		BarkRecognizer barkRecognizer = new BarkRecognizer(door);
		barkRecognizer.recognize(new Bark("Woof"));

	}
}
