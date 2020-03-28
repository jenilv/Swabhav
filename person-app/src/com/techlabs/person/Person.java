package com.techlabs.person;

public class Person {

	private String name;
	private int age;
	private GenderOptions gender;
	private float height;
	private float weight;
	private final double LOWER_LIMIT = 18.5;
	private final double HIGHER_LIMIT = 25;

	public Person(String name, int age, GenderOptions gender, float height, float weight) {
		if (!(weight / 1000 < 1)) {
			weight = weight / 1000;
		}

		this.name = name;
		this.age = age;
		this.gender = gender;
		this.height = height;
		this.weight = weight;

	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		this.gender = GenderOptions.MALE;
		this.height = 5.5f;
		this.weight = 50.0f;
	}

	public String getName() {
		return name != null && !"".equals(name) ? name : "unspecified";
	}

	public String getAge() {
		return age != 0 ? String.valueOf(age) : "unspecified";
	}

	public GenderOptions getGender() {
		return gender;
	}

	public String getHeight() {
		return height != 0.0f ? String.valueOf(height) : "unspecified";
	}

	public String getWeight() {
		return weight != 0.0f ? String.valueOf(weight) + " kg" : "unspecified";
	}

	public void workout() {
		weight = weight - (weight * (2f / 100));
	}

	public void eat() {
		height = height + (height * (5f / 100));
	}

	public double calculateBmiIndex() {
		return weight / ((height / 100) * (height / 100));
	}

	public String checkHealthStatus() {
		double bmi = calculateBmiIndex();
		if (bmi < LOWER_LIMIT) {
			return "Underweight";
		} else if (bmi > HIGHER_LIMIT) {
			return "Overweight";
		} else {
			return "Normal";
		}
	}
}