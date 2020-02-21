package com.techlabs.basic.app;

public class EvenOddFlag {

	public static void main(String[] args) {
		boolean flagPresent = false;
		boolean isOdd = false;
		for (int i = 0; i < args.length; i++) {
			if (args[i].contains("odd")) {
				flagPresent = true;
				isOdd = true;
			} else if (args[i].contains("even")) {
				flagPresent = true;
			}
		}
		if (flagPresent) {
			if (isOdd) {
				printOdd(args);
			} else {
				printEven(args);
			}
		} else {
			for (String string : args) {
				System.out.println(string);
			}
		}
	}

	public static void printOdd(String[] strings) {
		for (int i = 0; i < strings.length; i++) {
			try {
				if (Integer.parseInt(strings[i]) % 2 != 0) {
					System.out.println(strings[i]);
				}
			} catch (NumberFormatException e) {
			}
		}
	}

	public static void printEven(String[] strings) {
		for (int i = 0; i < strings.length; i++) {
			try {
				if (Integer.parseInt(strings[i]) % 2 == 0) {
					System.out.println(strings[i]);
				}
			} catch (NumberFormatException e) {
			}
		}
	}
}
