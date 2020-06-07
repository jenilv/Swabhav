package com.techlab.synchronous;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DisplayTime {

	public String getTime() {
		return new SimpleDateFormat("hh:mm:ss").format(new Date());
	}
}
