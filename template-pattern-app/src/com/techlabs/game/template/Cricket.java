package com.techlabs.game.template;

public class Cricket extends Game {

	@Override
	public void initialize() {
		System.out.println("Initialize cricket");
	}

	@Override
	public void startPlay() {
		System.out.println("Start platying cricket");
	}

	@Override
	public void stopPlay() {
		System.out.println("Stop playing cricket");
	}

}
