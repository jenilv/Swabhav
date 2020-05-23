package com.techlabs.strategy.test;

import com.techlabs.strategy.CreditCardStrategy;
import com.techlabs.strategy.Item;
import com.techlabs.strategy.ShoppingCart;
import com.techlabs.strategy.UpiStrategy;

public class StrategyTest {

	public static void main(String[] args) {
		ShoppingCart cart = new ShoppingCart();

		Item item1 = new Item("1234", 10);
		Item item2 = new Item("5678", 40);

		cart.addItem(item1);
		cart.addItem(item2);

		cart.pay(new UpiStrategy("upiid"));

		cart.pay(new CreditCardStrategy("jv", "1234567890123456", "0", "date	"));
	}

}
