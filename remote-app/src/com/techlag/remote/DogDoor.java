package com.techlag.remote;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class DogDoor {

	private boolean open;
	private List<Bark> allowedBarks;

	public DogDoor() {
		this.open = false;
		this.allowedBarks = new ArrayList<>();
	}

	public void open() {
		System.out.println("the dog door opens");
		open = true;

		final Timer timer = new Timer();

		timer.schedule(new TimerTask() {
			@Override
			public void run() {
				close();
				timer.cancel();
			}
		}, 5000);
	}

	public void close() {
		System.out.println("The dog door closes");
		open = false;
	}

	public boolean isOpen() {
		return open;
	}

	public final List<Bark> getAllowedBarks() {
		return allowedBarks;
	}

	public void addAllowedBarks(Bark bark) {
		allowedBarks.add(bark);
	}
}
