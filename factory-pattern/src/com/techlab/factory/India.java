package com.techlab.factory;

public class India implements Country {

	@Override
	public String getCurrency() {

		return "Rupees";
	}

	@Override
	public String getSymbol() {
		return "₹";
	}

}
