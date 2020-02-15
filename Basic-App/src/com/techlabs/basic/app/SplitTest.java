package com.techlabs.basic.app;

public class SplitTest {

	public static void main(String[] args) {
		String string = "https://swabhavtechlabs.com@jenil=developer";
		String[] split = string.split("@");
		String company = split[0].split("//")[1].split("\\.")[0];
		String name = split[1].split("=")[0];
		
		System.out.println(company);
		System.out.println(name);
	}
}
