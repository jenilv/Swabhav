package com.techlabs.analyzer;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class EmployeeHelper {

	public List<Employee> loadEmployees(int source, String url) {
		if (source <= 0 || source >= 2 || url.equals("")) {
			return null;
		}
		Scanner scanner = null;
		if (source == 1) {
			try {
				scanner = new Scanner(new File(url));
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		} else if (source == 2) {
			try {
				scanner = new Scanner(new URL(url).openStream());
			} catch (MalformedURLException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		List<Employee> employees = new ArrayList<>();
		while (scanner.hasNext()) {
			String line = scanner.next();
			String[] lineSplit = line.replaceAll("'", "").split(",");
			int employeeId = Integer.parseInt(lineSplit[0]);
			String employeeName = lineSplit[1];
			String designation = lineSplit[2];
			int managerId = Integer.parseInt(lineSplit[3].equals("NULL") ? "0" : lineSplit[3]);
			SimpleDateFormat sdf = new SimpleDateFormat("d-MMM-yy");
			Date dateOfJoining = null;
			try {
				dateOfJoining = sdf.parse(lineSplit[4]);
			} catch (ParseException e) {
				e.printStackTrace();
			}
			int salary = Integer.parseInt(lineSplit[5].equals("NULL") ? "0" : lineSplit[5]);
			int commission = Integer.parseInt(lineSplit[6].equals("NULL") ? "0" : lineSplit[6]);
			int departmentNumber = Integer.parseInt(lineSplit[7].equals("NULL") ? "0" : lineSplit[7]);
			employees.add(new Employee(employeeId, employeeName, designation, managerId, dateOfJoining, salary,
					commission, departmentNumber));
		}
		scanner.close();
		return employees;
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
}
