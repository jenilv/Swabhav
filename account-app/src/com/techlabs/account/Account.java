package com.techlabs.account;

import java.io.Serializable;

public class Account implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private static int ACCOUNT_NUMBER = 100;
	private int accountNumber;
	private String accountName;
	private double balance;
	private boolean success = false;
	private final int MINIMUM_BALANCE = 500;

	public Account(int accountNumber, String accountName, double balance) {
		this.accountNumber = accountNumber;
		this.accountName = accountName;
		this.balance = balance;
	}

	public Account() {
	}

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
