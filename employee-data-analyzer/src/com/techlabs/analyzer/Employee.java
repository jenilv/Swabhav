package com.techlabs.analyzer;

import java.util.Date;

public class Employee {

	private int employeeId;
	private String employeeName;
	private String designation;
	private int managerId;
	private Date dateOfJoining;
	private int salary;
	private int commission;
	private int departmentNumber;

	public Employee(int employeeId, String employeeName, String designation, int managerId, Date dateOfJoining,
			int salary, int commission, int departmentNumber) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.designation = designation;
		this.managerId = managerId;
		this.dateOfJoining = dateOfJoining;
		this.salary = salary;
		this.commission = commission;
		this.departmentNumber = departmentNumber;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public String getDesignation() {
		return designation;
	}

	public int getManagerId() {
		return managerId;
	}

	public Date getDateOfJoining() {
		return dateOfJoining;
	}

	public int getSalary() {
		return salary;
	}

	public int getCommission() {
		return commission;
	}

	public int getDepartmentNumber() {
		return departmentNumber;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", designation=" + designation
				+ ", managerId=" + managerId + ", dateOfJoining=" + dateOfJoining + ", salary=" + salary
				+ ", commission=" + commission + ", departmentNumber=" + departmentNumber + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + employeeId;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (employeeId != other.employeeId)
			return false;
		return true;
	}

}
