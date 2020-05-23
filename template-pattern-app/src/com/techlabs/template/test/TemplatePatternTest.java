package com.techlabs.template.test;

import com.techlabs.template.GlassHouse;
import com.techlabs.template.HouseTemplate;
import com.techlabs.template.WoodenHouse;

public class TemplatePatternTest {

	public static void main(String[] args) {

		HouseTemplate houseType = new WoodenHouse();

		houseType.buildHouse();
		System.out.println("************");

		houseType = new GlassHouse();

		houseType.buildHouse();
	}
}
