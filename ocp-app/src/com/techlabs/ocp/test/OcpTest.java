package com.techlabs.ocp.test;

import com.techlabs.ocp.Festival;
import com.techlabs.ocp.FixedDeposit;

public class OcpTest {

	public static void main(String[] args) {
		FixedDeposit fixedDeposit = new FixedDeposit(1, "JV", 500, 1000, 2, Festival.HOLI);
		System.out.println(fixedDeposit.calculateSimpleInterest());
	}
}
