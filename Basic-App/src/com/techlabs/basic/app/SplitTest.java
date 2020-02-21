package com.techlabs.basic.app;

public class SplitTest {

	public static void main(String[] args) {
		String str = "https://swabhabtechlabs.com@jenil=developer";
		String str1 = "https://swabhabtechlabs.com@";
		String str2 = "https://@jenil=developer";
		String str3 = "https://@";
		String[] split = str.split("@");
		String[] split1 = str1.split("@");
		String[] split2 = str2.split("@");
		String[] split3 = str3.split("@");
		extractCompanyName(split);
		extractDeveloperName(split);
		System.out.println("------------------------");
		extractCompanyName(split1);
		extractDeveloperName(split1);
		System.out.println("------------------------");
		extractCompanyName(split2);
		extractDeveloperName(split2);
		System.out.println("------------------------");
		extractCompanyName(split3);
		extractDeveloperName(split3);
	}

	public static void extractCompanyName(String[] split) {
		String company = null;
		try {
			company = split[0].split("//")[1].split("\\.")[0];			
		} catch (ArrayIndexOutOfBoundsException e) {

		}
		System.out.println("Company name is: " + company);
	}

	public static void extractDeveloperName(String[] split) {
		String developer = null;
		try {
			developer = split[1].split("=")[0];
		} catch (ArrayIndexOutOfBoundsException e) {
			 
		}
		System.out.println("Developer name is: " + developer);
	}
}
