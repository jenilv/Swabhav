package com.techlabs.account;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public abstract class Account {

	protected int accountNumber;
	protected String accountName;
	protected double balance;
	protected boolean canWithdraw;
	private Calendar createdOn;
	private Calendar dateOfBirth;

	public Account(int accountNumber, String accountName, double balance, String createdOn, String dateOfBirth) {
		this.accountNumber = accountNumber;
		this.accountName = accountName;
		this.balance = balance;

		SimpleDateFormat sdf = new SimpleDateFormat("mm/dd/yyyy");

		try {
			this.createdOn = Calendar.getInstance();
			this.createdOn.setTime(sdf.parse(createdOn));
			this.dateOfBirth = Calendar.getInstance();
			this.dateOfBirth.setTime(sdf.parse(dateOfBirth));
		} catch (ParseException e) {
			e.printStackTrace();
		}

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

	public boolean isCanWithdraw() {
		return canWithdraw;
	}

	public void setCanWithdraw(boolean canWithdraw) {
		this.canWithdraw = canWithdraw;
	}

	public Calendar getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Calendar createdOn) {
		this.createdOn = createdOn;
	}

	public Calendar getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Calendar dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public abstract boolean withdraw(int amount);
}
