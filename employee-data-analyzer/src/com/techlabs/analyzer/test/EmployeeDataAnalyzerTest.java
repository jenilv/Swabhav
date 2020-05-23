package com.techlabs.analyzer.test;

import java.util.List;
import java.util.Scanner;

import com.techlabs.analyzer.Analyzer;
import com.techlabs.analyzer.Employee;

public class EmployeeDataAnalyzerTest {

	public static void main(String[] args) {

		Analyzer analyzer = new Analyzer();

		Scanner scanner = new Scanner(System.in);
		boolean didNotExit = true;

		System.out.println("Enter employee data source:\n" + "1. Offline\n" + "2. Online");
		int source = scanner.nextInt();
		System.out.println("Enter url");
		List<Employee> employees = null;

		if (source == 1) {
			employees = analyzer.loadEmployeesFromFile(scanner.next());
		} else if (source == 2) {
			employees = analyzer.loadEmployeesFromUrl(scanner.next());
		} else {
			System.out.println("Invalid source.\n" + "Exiting!");
			didNotExit = false;
		}

		while (didNotExit) {
			System.out.println("What would you like to do?\n" + "1. Display all employees\n"
					+ "2. Display all distinct employees\n" + "3. Employee with highest salary\n"
					+ "4. Employees by department\n" + "5. Clerk with highest salary\n"
					+ "6. Minimum salary by department");
			switch (scanner.nextInt()) {
			case 1: {
				for (Employee employee : employees) {
					System.out.println(employee.toString());
				}

				break;
			}
			case 2: {
				for (Employee employee : analyzer.getDistinctEmployees(employees)) {
					System.out.println(employee.toString());
				}
			}
			case 3: {
				System.out.println(analyzer.getEmployeeWithHighestSalary(employees).toString());
				break;
			}
			case 4: {
				System.out.println("Enter department number");
				for (Employee employee : analyzer.getEmployeesByDepartment(employees, scanner.nextInt())) {
					System.out.println(employee);
				}
				break;
			}
			case 5: {
				System.out.println(analyzer.getClerkWithHighestSalary(employees).toString());
			}
			case 6: {
				System.out.println("Enter department number");
				System.out.println(analyzer.getMinimumSalaryByDepartment(employees, scanner.nextInt()).toString());
			}
			default:
				break;
			}
		}
		scanner.close();
	}

}
