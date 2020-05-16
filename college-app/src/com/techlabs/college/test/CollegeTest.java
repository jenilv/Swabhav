package com.techlabs.college.test;

import java.util.Date;

import com.techlabs.college.Branch;
import com.techlabs.college.Person;
import com.techlabs.college.Professor;
import com.techlabs.college.Student;

public class CollegeTest {

	public static void main(String[] args) {
		Person student = new Student(1, "Mum", new Date(), Branch.SCIENCE);

		Person professor = new Professor(2, "Mum", new Date(), 10000);

		printInfo(student);
		System.out.println("------------");
		printInfo(professor);
	}

	private static void printInfo(Person person) {
		System.out.println("ID: " + person.getId());
		System.out.println("Address: " + person.getAddress());
		System.out.println("Date of Birth: " + person.getDateOfBirth());

		if (person instanceof Student) {
			System.out.println("Student branch: " + ((Student) person).getBranch());
		} else if (person instanceof Professor) {
			System.out.println("Professor Salary: " + ((Professor) person).getSalary());
		}
	}

}
