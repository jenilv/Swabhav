package com.techlabs.employee;

public class Manager extends Employee {

	private static final int HRA = 50;
	private static final int TA = 40;
	private static final int DA = 30;

	public Manager(int empId, String empName, float basicpay) {
		super(empId, empName, basicpay);
	}

	@Override
	public double calculateSalary() {
		return basicpay + (basicpay * (HRA / 100)) + (basicpay * (TA / 100)) + (basicpay * (DA / 100));
	}

	public static int getHra() {
		return HRA;
	}

	public static int getTa() {
		return TA;
	}

	public static int getDa() {
		return DA;
	}

}
