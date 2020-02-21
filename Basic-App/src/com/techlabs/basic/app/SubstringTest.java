package com.techlabs.basic.app;

public class SubstringTest {

	public static void main(String[] args) {

		String str = "https://swabhabtechlabs.com@jenil=developer";
		String str1 = "https://swabhabtechlabs.com@";
		String str2 = "https://@jenil=developer";
		String str3 = "https://@";
		extractCompanyName(str);
		extractDeveloperName(str);
		System.out.println("------------------------");
		extractCompanyName(str1);
		extractDeveloperName(str1);
		System.out.println("------------------------");
		extractCompanyName(str2);
		extractDeveloperName(str2);
		System.out.println("------------------------");
		extractCompanyName(str3);
		extractDeveloperName(str3);
	}

	public static void extractCompanyName(String string) {
		String companyName = null;
		try {
			int i = string.indexOf("//") + 2;
			int j = string.indexOf(".");
			companyName = string.substring(i, j);
		} catch (IndexOutOfBoundsException exception) {
			
		}

		System.out.println("Company name is: " + companyName);

	}

	public static void extractDeveloperName(String string) {
		String developer = null;
		try {
			int i = string.indexOf("@") + 1;
			int j = string.indexOf("=");

			developer = string.substring(i, j);

		} catch (IndexOutOfBoundsException e) {
			
		}

		System.out.println("Developer name is: " + developer);

	}

}
