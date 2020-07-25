package com.techlabs.builder.test;

import com.techlabs.builder.Computer;

public class BuilderTest {

	public static void main(String[] args) {
		Computer computer = new Computer.ComputerBuilder("50GB", "15GB").setBluetoothEnabled(false)
				.setGraphicsCardEnabled(true).build();
	}
}
