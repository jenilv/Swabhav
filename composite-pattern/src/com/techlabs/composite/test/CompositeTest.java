package com.techlabs.composite.test;

import com.techlabs.composite.Developer;
import com.techlabs.composite.Manager;

public class CompositeTest {

	public static void main(String[] args) {
		Developer dev1 = new Developer(1000, "D1");
		Developer dev2 = new Developer(2000, "D2");
		Manager m1 = new Manager(10000, "M1", 200);

		m1.addDeveloper(dev1);

	}
}
