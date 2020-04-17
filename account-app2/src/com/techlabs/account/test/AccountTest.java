package com.techlabs.account.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import com.techlabs.account.Account;
import com.techlabs.account.CurrentAccount;
import com.techlabs.account.SavingAccount;

public class AccountTest {

	public static void main(String[] args) {

		SavingAccount savingAccount = new SavingAccount(1, "J", 2000, "01/01/2010", "01/01/1990");
		CurrentAccount currentAccount = new CurrentAccount(2, "JV", 5000, "02/05/2012", "03/02/1991");
		SavingAccount savingAccount2 = new SavingAccount(3, "Jen", 6000, "05/06/2015", "08/12/1980");

		savingAccount.deposit(15000);

		currentAccount.deposit(20000);

		savingAccount.withdraw(1000);
		currentAccount.withdraw(2000);
		List<Account> accounts = new ArrayList<>();

		accounts.add(savingAccount);
		accounts.add(savingAccount2);
		accounts.add(currentAccount);

//		printAccountInfo(savingAccount);
//		System.out.println("------");
//		printAccountInfo(currentAccount);
		writeAccountToFile(accounts);

		Account ac = findRichAccountHolder(accounts);
		List<Account> a = findYoungAccountHolders(accounts);
		System.out.println();
	}

	private static void printAccountInfo(Account account) {
		System.out.println("Account Number: " + account.getAccountNumber());
		System.out.println("Account Name: " + account.getAccountName());
		System.out.println("Account Balance: " + account.getBalance());
		System.out.println("Can withdraw: " + account.isCanWithdraw());
	}

	private static Account findRichAccountHolder(List<Account> accounts) {
		Account rich = accounts.get(0);
		for (Account account : accounts) {
			if (account.getBalance() > rich.getBalance()) {
				rich = account;
			}
		}

		return rich;
	}

	private static List<Account> findYoungAccountHolders(List<Account> accounts) {
		List<Account> youngList = new ArrayList<>();
		for (Account account : accounts) {
			if (Calendar.getInstance().get(Calendar.YEAR) - account.getDateOfBirth().get(Calendar.YEAR) >= 30) {
				youngList.add(account);
			}
		}
		return youngList;
	}

	private static void writeAccountToFile(List<Account> accounts) {
		try {
			File file = new File("./Accounts.csv");
			file.createNewFile();
			BufferedWriter writer = new BufferedWriter(new FileWriter(file));
			writer.write("Type,Number,Name,Balance,createdOn,Age\n");
			for (Account account : accounts) {
				writer.write("Type," + account.getAccountNumber() + "," + account.getAccountName() + ","
						+ account.getBalance() + "," + account.getCreatedOn().getTime() + ","
						+ String.valueOf(
								Calendar.getInstance().get(Calendar.YEAR) - account.getDateOfBirth().get(Calendar.YEAR))
						+ "\n");
			}
			writer.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
