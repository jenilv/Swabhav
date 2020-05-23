package com.techlabs.dip.solution;

public class Logger implements ILogger {

	public void logInfo(String string) {
		System.out.println(string);
	}
}
