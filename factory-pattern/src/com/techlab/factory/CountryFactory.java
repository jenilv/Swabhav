package com.techlab.factory;

public class CountryFactory {

	public static Country getCountry(CountryName countryName) {

		switch (countryName) {
		case INDIA: {
			return new India();
		}
		case UK: {
			return new UK();
		}
		case USA: {
			return new USA();
		}

		default: {
			return null;
		}
		}
	}
}
