package com.techlabs.account;

public class Account {

	private static int ACCOUNT_NUMBER = 100;
	private int accountNumber;
	private String accountName;
	private double balance;
	private boolean success = false;
	private final int MINIMUM_BALANCE = 500;

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber() {
		this.accountNumber = ACCOUNT_NUMBER++;
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

	public void withdraw(double amount) {
		if (balance - amount > MINIMUM_BALANCE) {
			balance = balance - amount;
			success = true;
		} else {
			success = false;
		}
	}

	public boolean isSuccess() {
		return success;
	}

	public void deposit(double amount) {
		balance = balance + amount;
	}
}
