package com.techlabs.account.test;

import com.techlabs.account.Account;

public class AccountTest {

	public static void main(String[] args) {

		Account account = new Account();
		account.setAccountName("JV");
		account.setAccountNumber();
		account.setBalance(1000);
		account.deposit(100);
		account.withdraw(600);

		printInfo(account);

	}

	private static void printInfo(Account account) {
		System.out.println("Account Name: " + account.getAccountName());
		System.out.println("Account Number: " + account.getAccountNumber());
		System.out.println("Account Balance: " + account.getBalance());

		if (account.isSuccess()) {
			System.out.println("Remaining balance:" + account.getBalance());
		} else {
			System.out.println("Insufficient balance. Minimum balance should be more than 500.");
		}
	}
}
