package com.techlabs.builder.account.test;

import com.techlabs.builder.account.Account;

public class AccountBuilderTest {

	public static void main(String[] args) {
		Account account = new Account.Builder(123).setAccountName("J").setBalance(10000).setBranch("Andheri")
				.setRateOfInterest(10.5f).build();

		System.out.println(account);
	}
}
