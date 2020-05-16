package com.techlabs.college;

import java.util.Date;

public class Student extends Person {

	private Branch branch;

	public Student(int id, String address, Date dateOfBirth, Branch branch) {
		super(id, address, dateOfBirth);
		this.branch = branch;
	}

	public Branch getBranch() {
		return branch;
	}

	public void setBranch(Branch branch) {
		this.branch = branch;
	}

	@Override
	public String toString() {
		return "Student [branch=" + branch + "]";
	}

}
