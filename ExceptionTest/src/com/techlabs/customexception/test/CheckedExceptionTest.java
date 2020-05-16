package com.techlabs.customexception.test;

import com.techlabs.customexception.CheckedException;
import com.techlabs.customexception.UncheckedException;

public class CheckedExceptionTest {

	public static void main(String[] args) {

		try {
			m1();
		} catch (CheckedException e) {
			e.printStackTrace();
		}

		m2();
	}

	private static void m1() throws CheckedException {
		String s = "String1";
		if (s.equals("String2")) {
			throw new CheckedException();
		}
	}

	private static void m2() {
		String s = "String1";
		if (s.equals("String2")) {
			throw new UncheckedException();
		}
	}
}
