package com.techlabs.account.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.techlabs.account.Account;

public class AccountTestFile {

	public static void main(String[] args) {

		File readFile = new File("E:\\Jenil\\java\\Swabhav\\account-app\\account_info\\Account.txt");
		List<Account> accounts = createAccount(readFile);
		File writeFile = new File("E:\\Jenil\\java\\Swabhav\\account-app\\account_info\\AccountDetails.txt");
		try {
			if (writeFile.createNewFile()) {
				writeAccountInfoToFile(accounts, writeFile);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static List<Account> createAccount(File file) {
		Account account;
		List<Account> accounts = new ArrayList<Account>();

		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			String s;
			account = new Account();
			account.setAccountNumber();
			while ((s = br.readLine()) != null) {
				if (s.contains("Account Name")) {
					account.setAccountName(s.split(":")[1]);
				} else if (s.contains("Account Balance")) {
					account.setBalance(Integer.valueOf(s.split(":")[1]));
				} else if (s.contains("Deposit")) {
					account.deposit(Integer.valueOf(s.split(":")[1]));
				} else if (s.contains("=====")) {
					accounts.add(account);
					account = new Account();
					account.setAccountNumber();
				}
			}
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return accounts;
	}

	private static void writeAccountInfoToFile(List<Account> accounts, File file) {
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(file));
			for (Account account : accounts) {
				bw.write("Account Name = " + account.getAccountName() + "\n");
				bw.write("Account Number = " + account.getAccountNumber() + "\n");
				account.withdraw(600);
				if (account.isSuccess()) {
					bw.write("Remaining balance = " + account.getBalance() + "\n");
				} else {
					bw.write("Insufficient balance. Minimum balance should be more than 500.\n");
				}
				bw.write("=============\n");
			}
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
