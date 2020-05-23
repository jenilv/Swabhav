package com.techlabs.strategy;

public class UpiStrategy implements PaymentStrategy {

	private String upiId;

	public UpiStrategy(String upiId) {
		this.upiId = upiId;
	}

	@Override
	public void pay(int amount) {
		System.out.println(amount + " paid with UPI");
	}

}
