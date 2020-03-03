package com.techlabs.player;

public class Player {

	private static int i = 100;
	private int id;
	private String name;
	private int age;

	public Player(String name, int age) {
		this.id = i++;
		this.name = name;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Player whoIsElder(Player player) {
		return player.getAge() > this.getAge() ? player : this;
	}
}
