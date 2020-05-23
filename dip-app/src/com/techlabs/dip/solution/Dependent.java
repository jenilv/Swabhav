package com.techlabs.dip.solution;

public class Dependent {

	private Logger logger = new Logger();

	private void name() {
		logger.logInfo("Log something");
	}
}
