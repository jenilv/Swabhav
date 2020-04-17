package com.techlabs.employee;

public class Analyst extends Employee {

	private static final int PERKS = 20;

	public Analyst(int empId, String empName, float basicpay) {
		super(empId, empName, basicpay);
	}

	@Override
	public double calculateSalary() {
		return basicpay + (basicpay * (PERKS / 100));
	}

	public static int getPerks() {
		return PERKS;
	}

}
