package com.techlabs.student.comparator.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.techlabs.student.comparator.FirstNameComparator;
import com.techlabs.student.comparator.RollNoComparator;
import com.techlabs.student.comparator.Student;

public class StudentComparatorTest {

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
		Collections.sort(students, new RollNoComparator());

		students.forEach(System.out::println);
		System.out.println("-----");
		Collections.sort(students, new FirstNameComparator());

		students.forEach(System.out::println);
	}

	private static void printInfo(Student student) {
		System.out.println("Student Roll No: " + student.getRollNo());
		System.out.println("Student First Name: " + student.getFirstName());
		System.out.println("Student Last Name: " + student.getLastName());
	}

}
