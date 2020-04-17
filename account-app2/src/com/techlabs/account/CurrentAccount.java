package com.techlabs.account;

public class CurrentAccount extends Account {

	public CurrentAccount(int accountNumber, String accountName, double balance, String createdOn, String dateOfBirth) {
		super(accountNumber, accountName, balance, createdOn, dateOfBirth);
	}

	@Override
	public boolean withdraw(int amount) {

		if (amount > 5000) {
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

//		in saving account withdrawal amount should not be more than 10000.
//		current account withdrawal
//		Why is it necessary to use abstract method inside abstract class?
//		can one abstract class consist of concrete methods
//		is it possible to create an object of abstract class?
}
