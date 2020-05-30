package com.techlabs.tictactoe.test;

import java.util.Scanner;

import com.techlabs.tictactoe.Board;
import com.techlabs.tictactoe.Cell;
import com.techlabs.tictactoe.Game;
import com.techlabs.tictactoe.Mark;
import com.techlabs.tictactoe.Player;
import com.techlabs.tictactoe.Result;
import com.techlabs.tictactoe.ResultAnalyzer;

public class TicTacToeTest {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Player1 name");
		String player1Name = scanner.next();
		System.out.println("Enter Player1 mark");
		String player1Mark = scanner.next();
		while (!(player1Mark.equalsIgnoreCase(Mark.X.name()) || player1Mark.equalsIgnoreCase(Mark.O.name()))) {
			System.out.println("Invalid Mark. Please enter X or O");
			player1Mark = scanner.next();
		}
		Mark p1Mark = player1Mark.equalsIgnoreCase(Mark.X.name()) ? Mark.X : Mark.O;
		Mark p2Mark = p1Mark == Mark.X ? Mark.O : Mark.X;

		System.out.println("Enter Player2 name");
		String player2Name = scanner.next();

		Player[] players = new Player[] { new Player(player1Name, p1Mark), new Player(player2Name, p2Mark) };
		ResultAnalyzer resultAnalyzer = new ResultAnalyzer();
		System.out.println("Let's play!");
		System.out.println(players[0].getName() + "'s turn");
		Game game = new Game(players, new Board(), resultAnalyzer);

		while (game.getResultAnalyzer().getResult() == Result.PLAYING) {
			System.out.println("Enter location of mark");
			if (!game.enterPlayerMark(scanner.nextInt(), scanner.nextInt())) {
				System.out.println("Cell occupied please re-enter");
				continue;
			}
			game.nextPlayer();
			printBoard(game.getBoard().getCells());
		}

		if (game.getResultAnalyzer().getResult() == Result.FINISHED) {
			System.out.println(game.nextPlayer() + "wins!");
		} else {
			System.out.println("Game draw!");
		}

	}

	private static void printBoard(Cell[][] cells) {
		for (Cell[] c1 : cells) {
			for (Cell c2 : c1) {
				System.out.print(c2.getMark().name() + " ");
			}
			System.out.println();
		}
	}
}
