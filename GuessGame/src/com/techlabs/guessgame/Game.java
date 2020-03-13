package com.techlabs.guessgame;

import java.util.Random;
import java.util.Scanner;

public class Game {

	public void play() {

		Random random = new Random();

		Scanner scanner = new Scanner(System.in);
		int playAgain = 0;
		do {
			int number = random.nextInt(100);
			System.out.println("Start guessing!");
			while (scanner.hasNext()) {
				int input = scanner.nextInt();
				if (input > number) {
					System.out.println("Guess is too high");
				} else if (input < number) {
					System.out.println("Guess is too low");
				} else {
					System.out.println("You won!");
					break;
				}
			}
			System.out.println("Do you want to play again?");
			playAgain = scanner.nextInt();
		} while (playAgain == 1);
		scanner.close();
	}
}
