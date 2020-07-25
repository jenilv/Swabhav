package com.techlabs.singleton;

public class SingletonTest {

	public static void main(String[] args) {
		DataService dataService1 = DataService.getInstance();
		DataService dataService2 = DataService.getInstance();
		System.out.println(dataService1.hashCode());
		System.out.println(dataService2.hashCode());
		dataService1.processData();
		dataService2.processData();
	}

}
