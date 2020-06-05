package com.techlabs.tictactoe.test;

import java.util.Scanner;

import com.techlabs.tictactoe.Board;
import com.techlabs.tictactoe.Cell;
import com.techlabs.tictactoe.CellOccupiedException;
import com.techlabs.tictactoe.Game;
import com.techlabs.tictactoe.InvalidPositionException;
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

		System.out.println("Enter grid size of board");
		int boardSize = scanner.nextInt();

		Player[] players = new Player[] { new Player(player1Name, p1Mark), new Player(player2Name, p2Mark) };
		ResultAnalyzer resultAnalyzer = new ResultAnalyzer();
		System.out.println("Let's play!");
		System.out.println(players[0].getName() + "'s turn");
		Game game = new Game(players, new Board(boardSize), resultAnalyzer);

		while (game.getResultAnalyzer().getResult() == Result.INPROGRESS) {
			System.out.println("Enter location of mark");

			try {
				game.enterPlayerMark(scanner.nextInt());
			} catch (CellOccupiedException e) {
				System.out.println("Cell occupied please re-enter");
				continue;
			} catch (InvalidPositionException e) {
				System.out.println("Invalid position of cell entered please re-enter");
			}
			System.out.println(game.nextPlayer().getName() + "'s turn");
			printBoard(game.getBoard().getCells());
		}

		if (game.getResultAnalyzer().getResult() == Result.WIN) {
			System.out.println(game.nextPlayer().getName() + "wins!");
		} else {
			System.out.println("Game draw!");
		}

	}

	private static void printBoard(Cell[] cells) {
		for (int i = 0; i < cells.length; i++) {
			if (i > 0 && i % (Math.sqrt(cells.length)) == 0) {
				System.out.println();
			}
			System.out.print(!cells[i].getMark().equals(Mark.BLANK) ? cells[i].getMark().name() + " " : "-" + " ");
		}
		System.out.println();
	}
}
