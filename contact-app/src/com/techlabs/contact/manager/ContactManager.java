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

public class ContactManager {

	private List<Contact> allContacts;
	private final String FILE_NAME = "./Contacts.txt";

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

	public void addToContacts(Contact contact) {
		allContacts.add(contact);
		saveAllContacts();
	}

	public Contact modifyContactByName(String contactFirstName) {

		Contact contactToModify = null;
		for (Contact contact : allContacts) {
			if (contact.getFirstName().equalsIgnoreCase(contactFirstName)) {
				contactToModify = contact;
				break;
			}
		}

		allContacts.remove(contactToModify);
		return contactToModify;
	}

	public Contact searchContactsByName(String contactFirstName) {
		for (Contact contact : allContacts) {
			if (contact.getFirstName().equalsIgnoreCase(contactFirstName)) {
				return contact;
			}
		}

		return null;
	}

	public void deleteContact(String contactFirstName) {
		Contact contactToDelete = null;
		for (Contact contact : allContacts) {
			if (contact.getFirstName().equalsIgnoreCase(contactFirstName)) {
				contactToDelete = contact;
				break;
			}
		}

		if (contactToDelete != null) {
			allContacts.remove(contactToDelete);
		}
	}

	public List<Contact> getContacts() {
		return allContacts;
	}
}
