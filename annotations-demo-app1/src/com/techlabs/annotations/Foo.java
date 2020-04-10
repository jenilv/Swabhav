package com.techlabs.annotations;

public class Foo {

	@TestCase
	public boolean m1() {
		return true;
	}

	@TestCase
	public boolean m2() {
		return true;
	}

	@TestCase
	public boolean m3() {
		return false;
	}

	@TestCase
	public boolean m4() {
		return false;
	}
}
