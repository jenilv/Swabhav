package com.techlabs.composite;

import java.util.ArrayList;
import java.util.List;

public class Manager implements Employee {

	private int baseSalary;
	private String name;
	private int commision;
	private List<Developer> developers;

	public Manager(int baseSalary, String name, int commision) {
		this.baseSalary = baseSalary;
		this.name = name;
		this.commision = commision;
	}

	public int getBaseSalary() {
		return baseSalary;
	}

	public String getName() {
		return name;
	}

	public int getCommision() {
		return commision;
	}

	public List<Developer> getDevelopers() {
		if (developers == null) {
			developers = new ArrayList<>();
		}

		return developers;
	}

	@Override
	public int getSalary() {
		return baseSalary + commision;
	}

	public void addDeveloper(Developer developer) {
		if (developers == null) {
			developers = new ArrayList<>();
		}

		developers.add(developer);
	}
}
