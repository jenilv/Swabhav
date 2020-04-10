package com.techlabs.contact.manager;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.techlabs.contact.Contact;
import com.techlabs.contact.test.ContactTest;

public class ContactManager {

	private List<Contact> allContacts;
	private final String FILE_NAME = "E:\\Jenil\\java\\Swabhav\\contact-app\\contacts\\Contacts.txt";

	public ContactManager() {
		getAllContacts();
	}

	private void saveAllContacts() {
		FileOutputStream fileOutputStream = null;
		ObjectOutputStream objectOutputStream = null;
		try {
			fileOutputStream = new FileOutputStream(FILE_NAME);
			objectOutputStream = new ObjectOutputStream(fileOutputStream);
			objectOutputStream.writeObject(allContacts);
			getAllContacts();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (fileOutputStream != null) {
				try {
					fileOutputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (objectOutputStream != null) {
				try {
					objectOutputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	private void getAllContacts() {
		FileInputStream fileInputStream = null;
		ObjectInputStream objectInputStream = null;
		try {
			fileInputStream = new FileInputStream(FILE_NAME);
			if (fileInputStream.available() != 0) {
				objectInputStream = new ObjectInputStream(fileInputStream);
				allContacts = (List<Contact>) objectInputStream.readObject();
			} else {
				allContacts = new ArrayList<>();
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			if (fileInputStream != null)
				try {
					fileInputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			if (objectInputStream != null)
				try {
					objectInputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}

		}
	}

	public void addToContacts() {
		Contact contact = new Contact();
		System.out.println("Enter First Name");
		contact.setFirstName(ContactTest.SCANNER.next());
		System.out.println("Enter Last Name");
		contact.setLastName(ContactTest.SCANNER.next());
		System.out.println("Enter Phone Number");
		contact.setPhoneNumber(Long.valueOf(ContactTest.SCANNER.next()));
		System.out.println("Enter EmailID");
		contact.setEmailId(ContactTest.SCANNER.next());

		System.out.println("Saving Contact\n" + contact.toString());
		allContacts.add(contact);
		saveAllContacts();
	}

	public void modifyContactByName() {

		Contact contactToModify = null;
		System.out.println("Enter contact first name to modify");
		String contactName = ContactTest.SCANNER.next();
		for (Contact contact : allContacts) {
			if (contact.getFirstName().equalsIgnoreCase(contactName)) {
				contactToModify = contact;
				break;
			}
		}

		allContacts.remove(contactToModify);

		if (contactToModify == null) {
			System.out.println("Could not find contact with name: " + contactName);
		} else {
			boolean notFinished = true;
			while (notFinished) {
				System.out.println(
						"What would you like to modify?\n 1. First Name\n 2. Last Name\n 3.Phone Number\n 4. Email ID\n 5. Done");
				switch (ContactTest.SCANNER.nextInt()) {
				case 1: {
					System.out.println("Enter new First Name");
					contactToModify.setFirstName(ContactTest.SCANNER.next());
					break;
				}
				case 2: {
					System.out.println("Enter new Last Name");
					contactToModify.setLastName(ContactTest.SCANNER.next());
					break;
				}
				case 3: {
					System.out.println("Enter new Phone Number");
					contactToModify.setPhoneNumber(Long.valueOf(ContactTest.SCANNER.next()));
					break;
				}
				case 4: {
					System.out.println("Enter new EmailID");
					contactToModify.setEmailId(ContactTest.SCANNER.next());
					break;
				}
				case 5: {
					System.out.println("Saving Contact\n" + contactToModify.toString());
					allContacts.add(contactToModify);
					saveAllContacts();
					notFinished = false;
					break;
				}
				default: {
					System.out.println("Invalid Option!");
					break;
				}
				}
			}
		}

	}

	public void searchContactsByName() {
		System.out.println("Enter contact first name to search");
		String contactName = ContactTest.SCANNER.next();
		for (Contact contact : allContacts) {
			if (contact.getFirstName().equalsIgnoreCase(contactName)) {
				System.out.println("Contact First Name: " + contact.getFirstName());
				System.out.println("Contact Last Name: " + contact.getLastName());
				System.out.println("Contact Phone Number: " + contact.getPhoneNumber());
				System.out.println("Contact EmailID: " + contact.getEmailId());
				break;
			}
		}
	}

	public void deleteContact() {
		System.out.println("Enter contact first name to delete");
		String contactName = ContactTest.SCANNER.next();
		Contact contactToDelete = null;
		for (Contact contact : allContacts) {
			if (contact.getFirstName().equalsIgnoreCase(contactName)) {
				contactToDelete = contact;
				break;
			}
		}

		if (contactToDelete == null) {
			System.out.println("Contact not found");
		} else {
			System.out.println("Are you sure you want to delete\n" + contactToDelete.toString() + "?\n 1. Yes\n 2.No");
			if (ContactTest.SCANNER.nextInt() == 1) {
				allContacts.remove(contactToDelete);
				saveAllContacts();
			}
		}
	}

	public void displayContacts() {
		if (allContacts.size() > 0)
			for (Contact contact : allContacts) {
				System.out.println("Contact First Name: " + contact.getFirstName());
				System.out.println("Contact Last Name: " + contact.getLastName());
				System.out.println("Contact Phone Number: " + contact.getPhoneNumber());
				System.out.println("Contact EmailID: " + contact.getEmailId());
				System.out.println("-------------");
			}
		else {
			System.out.println("No contacts to display. Add some!");
		}
	}
}
