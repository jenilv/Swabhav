package com.techlab.synchronous;

public class PrintTimeWorker implements Runnable {

	@Override
	public void run() {
		DisplayTime displayTime = new DisplayTime();
		while (true) {
			System.out.println(displayTime.getTime());
		}
	}
}
