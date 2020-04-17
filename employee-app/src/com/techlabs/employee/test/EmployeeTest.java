package com.techlabs.employee.test;

import com.techlabs.employee.Analyst;
import com.techlabs.employee.Developer;
import com.techlabs.employee.Employee;
import com.techlabs.employee.Manager;

public class EmployeeTest {

	public static void main(String[] args) {

		Developer developer = new Developer(1, "JV", 10000);
		Analyst analyst = new Analyst(2, "JEN", 12000);
		Manager manager = new Manager(3, "Jenil", 20000);

		printInfo(developer);
		printInfo(analyst);
		printInfo(manager);
	}

	private static void printInfo(Employee employee) {

		System.out.println("Employee ID: " + employee.getEmpId());
		System.out.println("Employee Name: " + employee.getEmpName());
		System.out.println("Employee Basic Pay: " + employee.getBasicpay());

		if (employee instanceof Analyst) {
			System.out.println("Employee Perks: " + ((Analyst) employee).getPerks());
		} else if (employee instanceof Developer) {
			System.out.println("Employee Bonus: " + ((Developer) employee).getBonus());
		} else if (employee instanceof Manager) {
			System.out.println("Employee HRA: " + ((Manager) employee).getHra());
			System.out.println("Employee TA: " + ((Manager) employee).getTa());
			System.out.println("Employee DA: " + ((Manager) employee).getDa());
		}
		System.out.println("------");

//		what is the purpose of using instanceof
//		is it possible to display the things which are not present in base class without instanceof
//		can we display the details of any class through instance of if it is not extending base class
	}

}
