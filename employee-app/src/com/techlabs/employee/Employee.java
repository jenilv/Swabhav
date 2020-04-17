package com.techlabs.employee;

public abstract class Employee {

	private int empId;
	private String empName;
	protected float basicpay;

	public Employee(int empId, String empName, float basicpay) {
		this.empId = empId;
		this.empName = empName;
		this.basicpay = basicpay;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public float getBasicpay() {
		return basicpay;
	}

	public void setBasicpay(float basicpay) {
		this.basicpay = basicpay;
	}

	public abstract double calculateSalary();
}
