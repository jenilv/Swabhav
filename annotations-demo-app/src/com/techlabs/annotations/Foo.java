package com.techlabs.annotations;

public class Foo {

	public void greet() {
		System.out.println("Hello");
	}

	@RequireRefactor
	public void go() {
		System.out.println("bye");
	}

	public void play() {
		System.out.println("Playing");
	}

	@RequireRefactor
	public void dance() {
		System.out.println("dancing");
	}
}
