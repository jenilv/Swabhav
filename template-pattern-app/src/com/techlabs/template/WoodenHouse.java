package com.techlabs.template;

public class WoodenHouse extends HouseTemplate {

	@Override
	public void buildWalls() {
		System.out.println("Building Walls");
	}

	@Override
	public void buildPillars() {
		System.out.println("Building Pillars");
	}

}
