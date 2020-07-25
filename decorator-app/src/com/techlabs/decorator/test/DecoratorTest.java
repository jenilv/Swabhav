package com.techlabs.decorator.test;

import com.techlabs.decorator.BasicBikeService;
import com.techlabs.decorator.ChainAlignment;
import com.techlabs.decorator.IBikeService;
import com.techlabs.decorator.OilChange;

public class DecoratorTest {

	public static void main(String[] args) {

		IBikeService service = new ChainAlignment(new OilChange(new BasicBikeService()));

		System.out.println(service.getCost());
	}
}
