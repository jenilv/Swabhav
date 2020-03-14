package com.techlabs.student.test;

import com.techlabs.student.Student;

public class StudentTest {

	public static void main(String[] args) {

		Student student1 = new Student(6, "J", 3);
		System.out.println(student1.getAddress());
		System.out.println(student1.getRollNumber());
		System.out.println(student1.getId());

		Student student2 = new Student(3, "JEN", 233);
		System.out.println(student2.getAddress());
		System.out.println(student2.getRollNumber());
		System.out.println(student2.getId());

		Student student = new Student(1, "JENIL", 33);
		System.out.println(student.getAddress());
		System.out.println(student.getRollNumber());
		System.out.println(student.getId());

	}
}
