package com.techlabs.account;

public class Account {

	private double balance;
	private static int MINIMUM_BALANCE;
	private int totalNumOfTransaction;

	static {
		MINIMUM_BALANCE = 500;
//		totalNumOfTransaction = 0;
	}

	public Account(double balance) {
		this.balance = balance;
		totalNumOfTransaction = 0;
	}

	public static int getMinimumBalance() {
		return MINIMUM_BALANCE;
	}

	public static void setMinimumBalance(int minimumBalance) {
		MINIMUM_BALANCE = minimumBalance;
	}

	public double getBalance() {
		return balance;
	}

	public int getTotalNumOfTransaction() {
		return totalNumOfTransaction;
	}

	public void deposit(int amount) {
		balance = balance + amount;
		totalNumOfTransaction++;
	}

	public boolean withdraw(int amount) {
		if (balance - amount > MINIMUM_BALANCE) {
			balance = balance - amount;
			totalNumOfTransaction++;
			return true;
		} else {
			return false;
		}
	}

	public int getCount() {
		return totalNumOfTransaction;
	}

	@Override
	public String toString() {
		return "Account[" + balance + "," + MINIMUM_BALANCE + "," + totalNumOfTransaction + "]";
	}
//1. which keyword will be used to call method of child class inside base class.
//	2. which keyword will be used to call method of parent class inside child class.
//	
}
