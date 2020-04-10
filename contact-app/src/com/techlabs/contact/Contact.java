package com.techlabs.contact;

import java.io.Serializable;

public class Contact implements Serializable {

	private String firstName;
	private String lastName;
	private long phoneNumber;
	private String emailId;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	@Override
	public String toString() {
		return "Contact[First Name = " + firstName + ", Last Name = " + lastName + ", Phone Number = " + phoneNumber
				+ ", Email Id = " + emailId + "]";
	}

}
