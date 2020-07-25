package com.techlabs.observer;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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
	private List<Listener> listeners;

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
			for (Listener listener : listeners) {
				String xString = "XXXXXX";
				String string = amount + " deposited to account number " + xString
						+ String.valueOf(accountNumber).substring(5, String.valueOf(accountNumber).length()) + " on "
						+ new SimpleDateFormat("dd/MM/yyyy hh:mm:ss").format(new Date()) + ". Account balance: "
						+ balance;
				listener.update(string);
			}
		} else {
			success = false;
		}
	}

	public boolean isSuccess() {
		return success;
	}

	public void deposit(double amount) {
		balance = balance + amount;

		for (Listener listener : listeners) {
			String xString = "XXXXXX";
			String string = amount + " deposited to account number " + xString
					+ String.valueOf(accountNumber).substring(5, String.valueOf(accountNumber).length()) + " on "
					+ new SimpleDateFormat("dd/MM/yyyy hh:mm:ss").format(new Date()) + ". Account balance: " + balance;
			listener.update(string);
		}
	}

	public List<Listener> getListeners() {
		if (listeners != null) {
			return listeners;
		} else {
			listeners = new ArrayList<>();
			return listeners;
		}

	}

	public void addListener(Listener listener) {
		if (listeners == null) {
			listeners = new ArrayList<>();
		}
		listeners.add(listener);
	}

}
