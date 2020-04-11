package com.techlabs.contact.test;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import com.techlabs.contact.Contact;
import com.techlabs.contact.manager.ContactManager;

public class ContactTest {

	public static final Scanner SCANNER = new Scanner(System.in);
	public static final String FILE_PATH = "./Contacts.txt";

	public static void main(String[] args) {

		try {
			new File(FILE_PATH).createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}

		ContactManager contactManager = new ContactManager();

		boolean didNotExit = true;
		while (didNotExit) {
			System.out.println(
					"What would you like to do?\n 1. Add Contact\n 2. Modify Contact By Name\n 3. Search Contact By Name.\n 4. Delete Contact.\n 5. Display Contacts.\n 6. Exit");
			switch (SCANNER.nextInt()) {
			case 1: {
				Contact contact = new Contact();
				System.out.println("Enter First Name");
				contact.setFirstName(SCANNER.next());
				System.out.println("Enter Last Name");
				contact.setLastName(SCANNER.next());
				System.out.println("Enter Phone Number");
				contact.setPhoneNumber(Long.valueOf(SCANNER.next()));
				System.out.println("Enter EmailID");
				contact.setEmailId(SCANNER.next());

				System.out.println("Saving Contact\n" + contact.toString());
				contactManager.addToContacts(contact);
				break;
			}
			case 2: {
				Contact contactToModify = contactManager.modifyContactByName(SCANNER.next());
				boolean notFinished = true;
				while (notFinished) {
					System.out.println(
							"What would you like to modify?\n 1. First Name\n 2. Last Name\n 3.Phone Number\n 4. Email ID\n 5. Done");
					switch (SCANNER.nextInt()) {
					case 1: {
						System.out.println("Enter new First Name");
						contactToModify.setFirstName(SCANNER.next());
						break;
					}
					case 2: {
						System.out.println("Enter new Last Name");
						contactToModify.setLastName(SCANNER.next());
						break;
					}
					case 3: {
						System.out.println("Enter new Phone Number");
						contactToModify.setPhoneNumber(Long.valueOf(SCANNER.next()));
						break;
					}
					case 4: {
						System.out.println("Enter new EmailID");
						contactToModify.setEmailId(SCANNER.next());
						break;
					}
					case 5: {
						System.out.println("Saving Contact\n" + contactToModify.toString());
						contactManager.addToContacts(contactToModify);
						notFinished = false;
						break;
					}
					default: {
						System.out.println("Invalid Option!");
						break;
					}
					}
				}
				break;
			}
			case 3: {
				System.out.println("Enter contact first name to search");
				Contact contact = contactManager.searchContactsByName(SCANNER.next());
				printContact(contact);
				break;
			}
			case 4: {
				System.out.println("Enter contact first name to delete");
				contactManager.deleteContact(SCANNER.next());
				System.out.println("Contact deleted!");
				break;
			}
			case 5: {
				List<Contact> contacts = contactManager.getContacts();
				printContactList(contacts);
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

	private static void printContact(Contact contact) {
		System.out.println("Contact First Name: " + contact.getFirstName());
		System.out.println("Contact Last Name: " + contact.getLastName());
		System.out.println("Contact Phone Number: " + contact.getPhoneNumber());
		System.out.println("Contact EmailID: " + contact.getEmailId());
		System.out.println("-------------");
	}

	private static void printContactList(List<Contact> contacts) {
		if (contacts.size() > 0) {
			for (Contact contact : contacts) {
				printContact(contact);
			}
		} else {
			System.out.println("No contacts to display. Add some!");
		}
	}
}
