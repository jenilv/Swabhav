package com.techlab.factory;

public class USA implements Country {

	@Override
	public String getCurrency() {

		return "US Dollar";
	}

	@Override
	public String getSymbol() {
		return "$";
	}

}
