package com.techlabs.decorator;

public class BikeServices implements IBikeService {

	protected IBikeService bbs;

	public BikeServices(IBikeService bbs) {
		this.bbs = bbs;
	}

	@Override
	public String getDescription() {
		return "Basic bike service";
	}

	@Override
	public int getCost() {
		return 300;
	}

}
