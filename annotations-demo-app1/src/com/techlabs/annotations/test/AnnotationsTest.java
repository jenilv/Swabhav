package com.techlabs.annotations.test;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import com.techlabs.annotations.Foo;

public class AnnotationsTest {

	public static void main(String[] args) {

		int numberOfTestCases = 0;
		int passingCases = 0;
		int failingCases = 0;
		List<String> annotatedMethods = new ArrayList<>();

		Method[] methods = Foo.class.getMethods();
		for (Method method : methods) {
			Annotation[] annotations = method.getAnnotations();
			if (annotations.length > 0) {
				numberOfTestCases++;
				annotatedMethods.add(method.getName());
			}
		}

		try {
			Class cls = Class.forName("com.techlabs.annotations.Foo");
			Object object = cls.newInstance();
			for (String string : annotatedMethods) {
				Method method = cls.getDeclaredMethod(string, new Class[] {});
				Object result = method.invoke(object, null);
				if ((boolean) result) {
					passingCases++;
				} else {
					failingCases++;
				}
			}
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("no of test cases: " + numberOfTestCases);
		System.out.println("name of method which has annotations: ");
		for (String string : annotatedMethods) {
			System.out.println(string);
		}
		System.out.println("Passing cases: " + passingCases);
		System.out.println("Failing cases: " + failingCases);
	}
}
