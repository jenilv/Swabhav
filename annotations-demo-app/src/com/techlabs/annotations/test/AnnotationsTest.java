package com.techlabs.annotations.test;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import com.techlabs.annotations.Foo;

public class AnnotationsTest {

	public static void main(String[] args) {

		int numberOfMethodsWithAnnotations = 0;
		List<String> annotatedMethods = new ArrayList<>();

		Method[] methods = Foo.class.getMethods();
		for (Method method : methods) {
			Annotation[] annotations = method.getAnnotations();
			if (annotations.length > 0) {
				numberOfMethodsWithAnnotations++;
				annotatedMethods.add(method.getName());
			}
		}

		System.out.println("no of methods which has annotations: " + numberOfMethodsWithAnnotations);
		System.out.println("name of method which has annotations: ");
		for (String string : annotatedMethods) {
			System.out.println(string);
		}
	}
}
