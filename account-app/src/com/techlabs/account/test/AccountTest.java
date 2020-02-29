package com.techlabs.account.test;

import com.techlabs.account.Account;

public class AccountTest {

	public static void main(String[] args) {

		Account account = new Account();
		account.setAccountName("JV");
		account.setAccountNumber(1);
		account.setBalance(1000);
		account.deposit(100);

		double bal = account.withdraw(501);
		if (bal != -1) {
			System.out.println("Balance left " + bal);
		} else {
			System.out.println("Unable to withdraw");
		}
	}
}
