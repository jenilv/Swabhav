package com.techlabs.player.test;

import com.techlabs.player.Player;

public class PlayerTest {

	private int a = 5;
	private int b = 5;

	public static void main(String[] args) {

		Player player1 = createPlayer("Jenil", 25);
		Player player2 = createPlayer("Jen", 30);

		printInfo(player1);
		printInfo(player2);

//		printInfo(player1.whoIsElder(player2));
//		System.out.println(player1.whoIsElder(player2).getName() + " is elder");

		System.out.println(add(5, 2));
	}

	private static int add(int a, int b) {
		return a + b;
	}

	private static Player createPlayer(String name, int age) {
		return new Player(name, age);
	}

	private static void printInfo(Player player) {
		System.out.println("Player Id: " + player.getId());
		System.out.println("Player Name: " + player.getName());
		System.out.println("Player Age: " + player.getAge());
		System.out.println("------------");
	}
}
