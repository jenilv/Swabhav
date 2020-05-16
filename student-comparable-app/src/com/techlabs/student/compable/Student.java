package com.techlabs.student.compable;

public class Student implements Comparable<Student> {

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
	public int compareTo(Student o) {
		if (this.rollNo > o.getRollNo()) {
			return 1;
		} else if (this.rollNo < o.getRollNo()) {
			return -1;
		} else {
			return 0;
		}
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}

}
