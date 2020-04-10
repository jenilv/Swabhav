package com.techlabs.student;

public class Student2 {

	private int id;
	private String name;
	private double cgpa;
	private static int count = 0;

	static {
		int count = 0;
		System.out.println("Inside static block");
	}

	public Student2(int id, String name, double cgpa) {
		this.id = id;
		this.name = name;
		this.cgpa = cgpa;
		count++;
		System.out.println("Inside constructor1 block");
	}

	public Student2(int id, String name) {
		this.id = id;
		this.name = name;
		this.cgpa = 7.0;
		count++;
		System.out.println("Inside constructor2 block");
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getCgpa() {
		return cgpa;
	}

	public static int getStudentCount() {
		return count;
	}
}
