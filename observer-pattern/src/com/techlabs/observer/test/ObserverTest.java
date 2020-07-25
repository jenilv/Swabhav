package com.techlabs.observer.test;

import com.techlabs.observer.Account;
import com.techlabs.observer.EmailListener;

public class ObserverTest {

	public static void main(String[] args) {

		Account account = new Account(1234567890, "JV", 10000);
		account.addListener(new EmailListener());
		account.deposit(1000);
	}
}
