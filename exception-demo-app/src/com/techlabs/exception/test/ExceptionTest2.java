package com.techlabs.exception.test;

public class ExceptionTest2 {

	public static void main(String[] args) throws Exception {
		try {
			m1();
		} catch (Exception e) {
			System.out.println("End of Program");
			e.printStackTrace();
		}
	}

	static void m1() throws Exception {
		System.out.println("M1 is called");
		m2();
	}

	static void m2() throws Exception {
		System.out.println("M2 is called");
		m3();
	}

	static void m3() throws Exception {
		System.out.println("M3 is called");
		throw new RuntimeException();
//		throw new Exception();

//	diff between throw and throws
//		diff when we are throwing new exception and new runtimeexception
//		learn about try catch finally
//		find out diff between catch and finally
//		is it possible to use multiple finally

//		create new app custom-exception-demo-app
//		use account class and account test class
//		create ome custom exception class InsufficientBalance which should extend exception class

	}
}
