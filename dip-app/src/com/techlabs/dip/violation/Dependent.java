package com.techlabs.dip.violation;

import com.techlabs.dip.solution.ILogger;

public class Dependent {

	private ILogger logger;

	public void setLogger(ILogger logger) {
		this.logger = logger;
	}

	private void name() {
		logger.logInfo("Log something");
	}
}
