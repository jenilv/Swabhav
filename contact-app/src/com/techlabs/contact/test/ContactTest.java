package com.techlabs.contact.test;

import java.util.Scanner;

import com.techlabs.contact.manager.ContactManager;

public class ContactTest {

	public static final Scanner SCANNER = new Scanner(System.in);

	public static void main(String[] args) {
		ContactManager contactManager = new ContactManager();

		boolean didNotExit = true;
		while (didNotExit) {
			System.out.println(
					"What would you like to do?\n 1. Add Contact\n 2. Modify Contact By Name\n 3. Search Contact By Name.\n 4. Delete Contact.\n 5. Display Contacts.\n 6. Exit");
			switch (SCANNER.nextInt()) {
			case 1: {
				contactManager.addToContacts();
				break;
			}
			case 2: {
				contactManager.modifyContactByName();
				break;
			}
			case 3: {
				contactManager.searchContactsByName();
				break;
			}
			case 4: {
				contactManager.deleteContact();
				break;
			}
			case 5: {
				contactManager.displayContacts();
				break;
			}
			case 6: {
				System.out.println("Exiting!");
				didNotExit = false;
				break;
			}
			default: {
				System.out.println("Invalid Option!\n");
				break;
			}
			}
		}

		SCANNER.close();
	}
}
