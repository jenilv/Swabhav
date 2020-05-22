package com.techlabs.ocp;

public class FixedDeposit {

	private int accountNumber;
	private String accountName;
	private double amount;
	private double principle;
	private int years;
	private Festival festival;

	public FixedDeposit(int accountNumber, String accountName, double amount, double principle, int years,
			Festival festival) {
		this.accountNumber = accountNumber;
		this.accountName = accountName;
		this.amount = amount;
		this.principle = principle;
		this.years = years;
		this.festival = festival;
	}

	public final int getAccountNumber() {
		return accountNumber;
	}

	public final String getAccountName() {
		return accountName;
	}

	public final double getAmount() {
		return amount;
	}

	public final double getPrinciple() {
		return principle;
	}

	public final int getYears() {
		return years;
	}

	public final Festival getFestival() {
		return festival;
	}

	public double calculateSimpleInterest() {
		return (principle * years * festival.getRate()) / 100;
	}
}
