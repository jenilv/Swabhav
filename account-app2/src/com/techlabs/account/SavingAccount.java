package com.techlabs.account;

public class SavingAccount extends Account {

	public SavingAccount(int accountNumber, String accountName, double balance, String createdOn, String dateOfBirth) {
		super(accountNumber, accountName, balance, createdOn, dateOfBirth);
	}

	@Override
	public boolean withdraw(int amount) {

		if (amount > 10000) {
			return false;
		}

		if (balance - amount > 1000) {
			balance = balance - amount;
			canWithdraw = true;
			return true;
		} else {
			return false;
		}
	}

}
