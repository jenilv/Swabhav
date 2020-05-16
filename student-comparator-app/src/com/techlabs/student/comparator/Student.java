package com.techlabs.student.comparator;

public class Student {

	private int rollNo;
	private String firstName;
	private String lastName;

	public Student(int rollNo, String firstName, String lastName) {
		this.rollNo = rollNo;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public int getRollNo() {
		return rollNo;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}

}
