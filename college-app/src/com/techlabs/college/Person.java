package com.techlabs.college;

import java.util.Date;

public class Person {

	private int id;
	private String address;
	private Date dateOfBirth;

	public Person(int id, String address, Date dateOfBirth) {
		this.id = id;
		this.address = address;
		this.dateOfBirth = dateOfBirth;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

}
