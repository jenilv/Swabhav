package com.techlabs.composite;

public class Developer implements Employee {

	private int baseSalary;
	private String name;

	public Developer(int baseSalary, String name) {
		this.baseSalary = baseSalary;
		this.name = name;
	}

	public int getBaseSalary() {
		return baseSalary;
	}

	public String getName() {
		return name;
	}

	@Override
	public int getSalary() {
		return baseSalary;
	}

}
