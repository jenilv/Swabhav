package com.techlabs.account;

public class Account {

	private int accountNumber;
	private String accountName;
	private double balance;
	private final int MINIMUM_BALANCE = 500;

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double withdraw(double amount) {
		if (balance - amount > MINIMUM_BALANCE) {
			balance = balance - amount;
			return balance;
		} else {
			return -1;
		}
	}

	public void deposit(double amount) {
		balance = balance + amount;
	}
}
