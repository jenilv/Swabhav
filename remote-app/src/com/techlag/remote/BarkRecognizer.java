package com.techlag.remote;

import java.util.List;

public class BarkRecognizer {

	private DogDoor door;

	public BarkRecognizer(DogDoor door) {
		this.door = door;
	}

	public void recognize(Bark bark) {
		System.out.println("Bark recognizer heard: " + bark.getSound());
		List<Bark> allowedBarks = door.getAllowedBarks();
		for (Bark allowedBark : allowedBarks) {
			if (allowedBark.equals(bark)) {
				door.open();
				return;
			}
		}
		System.out.println("Not allowed");
	}

}
