package com.techlabs.basic.app;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Reflection {

	public static void main(String[] args) {
		printMethods();
		System.out.println("====================");
		printMethods();
		System.out.println("====================");
		printConstructors();
	}

	private static void printMethods() {
		Method[] methods = Object.class.getMethods();
		for (Method method : methods) {
			if (method.getName().contains("get")) {
				System.out.println(method.getName());
			}

		}
	}

	private static void printFields() {
		Field[] fields = Object.class.getFields();
		for (Field field : fields) {
			System.out.println(field.getName());
		}
	}

	private static void printConstructors() {
		Constructor[] constructors = Object.class.getConstructors();
		for (Constructor constructor : constructors) {
			System.out.println(constructor.getName());
		}
	}
}
