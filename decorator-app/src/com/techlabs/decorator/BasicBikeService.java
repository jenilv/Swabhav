package com.techlabs.decorator;

public class BasicBikeService implements IBikeService {

	@Override
	public String getDescription() {
		return "Basic bike service";
	}

	@Override
	public int getCost() {
		return 300;
	}

}
