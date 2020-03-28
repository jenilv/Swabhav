package com.techlabs.student.test;

import com.techlabs.student.Student2;

public class Student2Test {

	public static void main(String[] args) {
		Student2 s1 = new Student2(1, "abc");
		printInfo(s1);
		System.out.println("--------");
		Student2 s2 = new Student2(2, "xyz");
		printInfo(s2);
		System.out.println("--------");
		Student2 s3 = new Student2(3, "lmn", 8.0);
		printInfo(s3);
		System.out.println("--------");
	}

	private static void printInfo(Student2 student) {
		System.out.println("Student id: " + student.getId());
		System.out.println("Student name: " + student.getName());
		System.out.println("Student cgpa: " + student.getCgpa());
		System.out.println("Student count: " + student.getStudentCount());
	}
}
