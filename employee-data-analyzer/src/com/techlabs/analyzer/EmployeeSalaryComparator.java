package com.techlabs.analyzer;

import java.util.Comparator;

public class EmployeeSalaryComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		if (o1.getSalary() == o2.getSalary()) {
			return 0;
		} else if (o2.getSalary() > o2.getSalary()) {
			return 1;
		} else {
			return -1;
		}
	}
}
