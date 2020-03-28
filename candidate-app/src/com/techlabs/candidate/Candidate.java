package com.techlabs.candidate;

public class Candidate {

	private int id;
	private String name;
	private int age;
	private CreditPoint creditPoint;

	public Candidate(int id, String name, int age, CreditPoint creditPoint) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.creditPoint = creditPoint;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public CreditPoint getCreditPoint() {
		return creditPoint;
	}

	public void whoIsBetter(Candidate candidate) {
		if (candidate.getCreditPoint().compareTo(this.creditPoint) < 0) {
			System.out.println("Candidate " + candidate.getName() + " is better");
		} else {
			System.out.println("Candidate " + name + " is better");
		}
	}
}
