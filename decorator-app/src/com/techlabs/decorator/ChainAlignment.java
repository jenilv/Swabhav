package com.techlabs.decorator;

public class ChainAlignment extends BikeServices {

	public ChainAlignment(IBikeService bbs) {
		super(bbs);
	}

	@Override
	public String getDescription() {
		return "Chain alignment";
	}

	@Override
	public int getCost() {
		return bbs.getCost() + 100;
	}

}
