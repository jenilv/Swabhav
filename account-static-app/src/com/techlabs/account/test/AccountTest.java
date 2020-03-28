package com.techlabs.account.test;

import com.techlabs.account.Account;

public class AccountTest {

	public static void main(String[] args) {
		Account a1 = new Account(1500);
		System.out.println(a1.getMinimumBalance());

		Account a2 = new Account(3500);
		Account.setMinimumBalance(1000);
		System.out.println(a1.getMinimumBalance());
		System.out.println(a2.getMinimumBalance());

		Account a3 = new Account(4500);
		System.out.println(a3.getMinimumBalance());

		a1.deposit(100);
		a2.withdraw(200);

		a3.deposit(280);
		a2.deposit(300);

		a3.withdraw(300);
		System.out.println(a3.getCount());
		System.out.println(a3);
		System.out.println(a3.toString());

	}
}
