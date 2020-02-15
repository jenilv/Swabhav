package com.techlabs.basic.app;

public class SubstringTest {

	public static void main(String[] args) {

		String str = "https://swabhavtechlabs.com@jenil=developer";
		String companyName = str.substring(8, 23);
		System.out.println(companyName);
		String developer = str.substring(28, 33);
		System.out.println(developer);
	}

}
