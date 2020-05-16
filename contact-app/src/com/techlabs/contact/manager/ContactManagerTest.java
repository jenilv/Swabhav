package com.techlabs.contact.manager;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

import com.techlabs.contact.Contact;

public class ContactManagerTest {

	@Test
	public void testAddToContacts() {
		ContactManager contactManager = new ContactManager();
		Contact contact = new Contact();
		contact.setEmailId("asf");
		contact.setFirstName("GAF");
		contact.setLastName("ASFSA");
		contact.setPhoneNumber(213123);
		contactManager.addToContacts(contact);

		assertEquals(contactManager.getContacts().size(), 8);
	}

	@Test
	public void testModifyContactByName() {
		fail("Not yet implemented");
	}

	@Test
	public void testSearchContactsByName() {
		fail("Not yet implemented");
	}

	@Test
	public void testDeleteContact() {
		fail("Not yet implemented");
	}

}
