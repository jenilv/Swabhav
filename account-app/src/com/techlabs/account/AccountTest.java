package com.techlabs.account;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class AccountTest {

	@Before
	public void beforeMethod() {
		System.out.println("before method");
	}

	@BeforeClass
	public static void beforeClassMethod() {
		System.out.println("before class method");
	}

	@After
	public void afterMethod() {
		System.out.println("after method");
	}

	@AfterClass
	public static void afterClassMethod() {
		System.out.println("after class method");
	}

	@Test
	public void testWithdraw() {
		fail("Not yet implemented");
	}

	@Test
	public void testDeposit() {
		fail("Not yet implemented");
	}

	@Test
	public void testAccountConstructorWithThreeParameter() {
		// Arrange
		int expectedaccno = 101;
		String expectedaccnanme = "Jenil";
		double expectedaccbalance = 160;

		// Act
		Account acc = new Account(101, "Jenil", 160);

		// Assert
		assertEquals(expectedaccno, acc.getAccountNumber());
		assertEquals(expectedaccnanme, acc.getAccountName());
		assertEquals(expectedaccbalance, acc.getBalance(), 0);

	}

//	serializable
//	list
//	iterable
//	map
//	set
//	clonable
//	Comparable
//	Runnable
//	
//	
}
