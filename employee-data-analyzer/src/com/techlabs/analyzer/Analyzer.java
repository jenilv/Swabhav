package com.techlabs.analyzer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Analyzer {

	public List<Employee> loadEmployeesFromFile(String url) {
		if (url == null || url.equals("")) {
			return null;
		}
		return new FileLoader(url).parseEmployees().loadEmployees();
	}

	public List<Employee> loadEmployeesFromUrl(String url) {
		if (url == null || url.equals("")) {
			return null;
		}
		return new UrlLoader(url).parseEmployees().loadEmployees();
	}

	public List<Employee> getDistinctEmployees(List<Employee> employees) {
		Set<Employee> set = new LinkedHashSet<>(employees);
		return new ArrayList<>(set);
	}

	public Employee getEmployeeWithHighestSalary(List<Employee> employees) {
		List<Employee> distinctEmployees = getDistinctEmployees(employees);
		distinctEmployees.sort(new EmployeeSalaryComparator());
		return distinctEmployees.get(0);
	}

	public List<Employee> getEmployeesByDepartment(List<Employee> employees, int departmentNumber) {
		List<Employee> distinctEmployees = getDistinctEmployees(employees);
		List<Employee> employeesByDepartment = new ArrayList<Employee>();

		for (Employee employee : distinctEmployees) {
			if (employee.getDepartmentNumber() == departmentNumber) {
				employeesByDepartment.add(employee);
			}
		}

		return employeesByDepartment;
	}

	public Employee getClerkWithHighestSalary(List<Employee> employees) {
		List<Employee> distinctEmployees = getDistinctEmployees(employees);
		List<Employee> clerks = new ArrayList<Employee>();
		for (Employee employee : distinctEmployees) {
			if (employee.getDesignation().equalsIgnoreCase("clerk")) {
				clerks.add(employee);
			}
		}

		Collections.sort(clerks, new EmployeeSalaryComparator());
		return clerks.get(0);
	}

	public Employee getMinimumSalaryByDepartment(List<Employee> employees, int departmentNumber) {
		List<Employee> employeesByDepartment = getEmployeesByDepartment(employees, departmentNumber);
		Collections.sort(employeesByDepartment, new EmployeeSalaryComparator());
		return employeesByDepartment.get(0);
	}
}
