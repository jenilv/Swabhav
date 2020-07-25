package com.techlabs.game.template;

public class Football extends Game {

	@Override
	public void initialize() {
		System.out.println("Initialize Football");
	}

	@Override
	public void startPlay() {
		System.out.println("Start platying Football");
	}

	@Override
	public void stopPlay() {
		System.out.println("Stop playing Football");
	}

}
