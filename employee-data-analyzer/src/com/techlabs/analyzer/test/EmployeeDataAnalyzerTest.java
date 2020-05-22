package com.techlabs.analyzer.test;

import java.util.List;
import java.util.Scanner;

import com.techlabs.analyzer.Employee;
import com.techlabs.analyzer.EmployeeHelper;

public class EmployeeDataAnalyzerTest {

	public static void main(String[] args) {

		EmployeeHelper employeeHelper = new EmployeeHelper();

		Scanner scanner = new Scanner(System.in);
		boolean didNotExit = true;

		System.out.println("Enter employee data source:\n" + "1. Offline\n" + "2. Online");
		int source = scanner.nextInt();
		System.out.println("Enter url");
		List<Employee> employees = employeeHelper.loadEmployees(source, scanner.next());

		while (didNotExit) {
			System.out.println("What would you like to do?\n" + "1. Display all employees\n"
					+ "2. Display all distinct employees\n" + "3. Employee with highest salary\n"
					+ "4. Employees by department");
			switch (scanner.nextInt()) {
			case 1: {
				for (Employee employee : employees) {
					System.out.println(employee.toString());
				}

				break;
			}
			case 2: {
				for (Employee employee : employeeHelper.getDistinctEmployees(employees)) {
					System.out.println(employee.toString());
				}
			}
			case 3: {
				System.out.println(employeeHelper.getEmployeeWithHighestSalary(employees).toString());
				break;
			}
			case 4: {
				System.out.println("Enter department number");
				for (Employee employee : employeeHelper.getEmployeesByDepartment(employees, 30)) {
					System.out.println(employee);
				}
				break;
			}
			default:
				break;
			}
		}
	}
}
