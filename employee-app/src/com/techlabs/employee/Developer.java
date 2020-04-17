package com.techlabs.employee;

public class Developer extends Employee {

	private static final int BONUS = 30;

	public Developer(int empId, String empName, float basicpay) {
		super(empId, empName, basicpay);
	}

	@Override
	public double calculateSalary() {
		return basicpay + (basicpay * (BONUS / 100));
	}

	public static int getBonus() {
		return BONUS;
	}

}
