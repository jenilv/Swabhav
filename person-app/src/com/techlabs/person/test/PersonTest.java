package com.techlabs.person.test;

import com.techlabs.person.GenderOptions;
import com.techlabs.person.Person;

public class PersonTest {

	public static void main(String[] args) {
//use GenderOptions as enum to pass 3 values male, female and others.
		Person person = new Person("Jenil", 25, GenderOptions.MALE, 168, 60f);
		person.eat();
		person.workout();
		printInfo(person);

		Person person2 = new Person("Jen", 20);
		person2.eat();
//		printInfo(person2);
		
		System.out.println(person.hashCode());
		System.out.println(person2.hashCode());
	}

	private static void printInfo(Person person) {
		System.out.println("Person name: " + person.getName());
		System.out.println("Person age: " + person.getAge());
		System.out.println("Person gender: " + person.getGender());
		System.out.println("Person height: " + person.getHeight());
		System.out.println("Person weight: " + person.getWeight());
		System.out.println("BMI: " + person.calculateBmiIndex());
		System.out.println("Health status: " + person.checkHealthStatus());
	}
}
