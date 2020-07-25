package com.techlabs.proxy;

import java.time.LocalDateTime;

public class AccountProxy extends Account {

	public AccountProxy(int accountNumber, String accountName, double balance, String branch, float rateOfInterest) {
		super(accountNumber, accountName, balance, branch, rateOfInterest);
	}

	@Override
	public void deposit(int amount) {
		System.out.println("Time before deposit: " + LocalDateTime.now());
		super.deposit(amount);
		System.out.println("Time after deposit: " + LocalDateTime.now());
	}
}
