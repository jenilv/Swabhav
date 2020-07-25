package com.techlabs.proxy;

public class Account {

	private int accountNumber;
	private String accountName;
	private double balance;
	private String branch;
	private float rateOfInterest;

	public Account(int accountNumber, String accountName, double balance, String branch, float rateOfInterest) {
		this.accountNumber = accountNumber;
		this.accountName = accountName;
		this.balance = balance;
		this.branch = branch;
		this.rateOfInterest = rateOfInterest;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public String getAccountName() {
		return accountName;
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(int amount) {
		balance = balance + amount;
	}

	public boolean withdraw(int amount) {
		if (amount > 10000) {
			return false;
		}

		if (balance - amount > 1000) {
			balance = balance - amount;
			return true;
		} else {
			return false;
		}
	}

	public String getBranch() {
		return branch;
	}

	public float getRateOfInterest() {
		return rateOfInterest;
	}

	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", accountName=" + accountName + ", balance=" + balance
				+ ", branch=" + branch + ", rateOfInterest=" + rateOfInterest + "]";
	}
}
