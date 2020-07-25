package com.techlabs.builder.account;

public class Account {

	private int accountNumber;
	private String accountName;
	private double balance;
	private String branch;
	private float rateOfInterest;

	public Account(Builder builder) {
		accountNumber = builder.accountNumber;
		accountName = builder.accountName;
		balance = builder.balance;
		branch = builder.branch;
		rateOfInterest = builder.rateOfInterest;
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

	public static class Builder {

		private int accountNumber;
		private String accountName;
		private double balance;
		private String branch;
		private float rateOfInterest;

		public Builder(int accountNumber) {
			this.accountNumber = accountNumber;
		}

		public Builder setAccountName(String accountName) {
			this.accountName = accountName;
			return this;
		}

		public Builder setBalance(double balance) {
			this.balance = balance;
			return this;
		}

		public Builder setBranch(String branch) {
			this.branch = branch;
			return this;
		}

		public Builder setRateOfInterest(float rateOfInterest) {
			this.rateOfInterest = rateOfInterest;
			return this;
		}

		public Account build() {
			return new Account(this);
		}
	}
}
