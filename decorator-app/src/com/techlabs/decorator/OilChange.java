package com.techlabs.decorator;

public class OilChange extends BikeServices {

	public OilChange(IBikeService bbs) {
		super(bbs);
	}

	@Override
	public String getDescription() {
		return "Oil change";
	}

	@Override
	public int getCost() {
		return bbs.getCost() + 150;
	}

}
