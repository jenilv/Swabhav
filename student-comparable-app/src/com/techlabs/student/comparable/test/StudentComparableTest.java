package com.techlabs.student.comparable.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.techlabs.student.compable.Student;

public class StudentComparableTest {

	public static void main(String[] args) {
		Student s1 = new Student(4, "A", "G");
		Student s2 = new Student(6, "G", "V");
		Student s3 = new Student(2, "J", "V");
		Student s4 = new Student(3, "R", "B");
		Student s5 = new Student(1, "V", "R");

		List<Student> students = new ArrayList<>();
		students.add(s1);
		students.add(s2);
		students.add(s3);
		students.add(s4);
		students.add(s5);

		for (Student student : students) {
			System.out.println(student.toString());
		}
		System.out.println("-----");
		Collections.sort(students);

		students.forEach(System.out::println);
	}

	private static void printInfo(Student student) {
		System.out.println("Student Roll No: " + student.getRollNo());
		System.out.println("Student First Name: " + student.getFirstName());
		System.out.println("Student Last Name: " + student.getLastName());
	}

}
