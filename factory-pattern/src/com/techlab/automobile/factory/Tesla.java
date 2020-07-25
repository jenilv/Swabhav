package com.techlab.automobile.factory;

public class Tesla implements IAutoMobile {

	@Override
	public void start() {
		System.out.println("Tesla is starting");
	}

	@Override
	public void stop() {
		System.out.println("Tesla is stopping");
	}

}
