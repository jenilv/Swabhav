package com.techlabs.ocp;

public enum Festival {

	NORMAL(5), HOLI(10), DIWALI(20);

	private int rate;

	Festival(int rate) {
		this.rate = rate;
	}

	public final int getRate() {
		return rate;
	}

}
