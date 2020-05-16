package com.techlabs.college;

import java.util.Date;

public class Professor extends Person {

	private int salary;

	public Professor(int id, String address, Date dateOfBirth, int salary) {
		super(id, address, dateOfBirth);
		this.salary = salary;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

}
