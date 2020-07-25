package com.techlab.automobile.factory;

public class AutoMobileFactory {

	public IAutoMobile make(AutoType autoType) {
		switch (autoType) {
		case AUDI:
			return new Audi();
		case TESLA:
			return new Tesla();
		case BMW:
			return new BMW();
		default:
			return null;
		}
	}
}
