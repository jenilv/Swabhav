package com.techlabs.student;

public class Student {

	private int id;
	private String address;
	private double rollNumber;

	public Student() {
	}

	public Student(int id, String address, double rollNumber) {
		this.id = id;
		this.address = address;
		this.rollNumber = rollNumber;
	}

	public void setId(String id) {
		id = id;
	}

	public int getId() {
		return id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		address = address;
	}

	public double getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(String rollNumber) {
		rollNumber = rollNumber;
	}

}
