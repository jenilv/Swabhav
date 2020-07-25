package com.techlabs.guessgame;

import java.util.Random;

public class Game2 {

	Random random;
	int number;

	public Game2() {
		random = new Random();
		number = random.nextInt(100);
	}

	public String enterGuess(int guess) {
		if (guess > number) {
			return "Guess is too high!";
		} else if (guess < number) {
			return "Guess is too low!";
		} else {
			return "You win!";
		}
	}
}
