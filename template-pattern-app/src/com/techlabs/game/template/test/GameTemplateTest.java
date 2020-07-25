package com.techlabs.game.template.test;

import com.techlabs.game.template.Cricket;
import com.techlabs.game.template.Football;
import com.techlabs.game.template.Game;

public class GameTemplateTest {

	public static void main(String[] args) {
		Game game = new Cricket();
		game.play();

		Game game2 = new Football();
		game2.play();
	}
}
