package com.techlabs.proxy.test;

import com.techlabs.proxy.AccountProxy;

public class ProxyTest {

	public static void main(String[] args) {
		AccountProxy proxy = new AccountProxy(1, "J", 1000, "ABC", 10.5f);
		proxy.deposit(5000);
	}
}
