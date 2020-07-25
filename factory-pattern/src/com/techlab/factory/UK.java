package com.techlab.factory;

public class UK implements Country {

	@Override
	public String getCurrency() {

		return "Pounds";
	}

	@Override
	public String getSymbol() {
		return "£";
	}

}
