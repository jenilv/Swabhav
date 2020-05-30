package com.techlabs.tictactoe;

public class Game {

	private Board board;
	private ResultAnalyzer resultAnalyzer;
	private Player[] players = new Player[2];
	private Player currentPlayer;

	public Game(Player[] players, Board board, ResultAnalyzer resultAnalyzer) {
		this.players = players;
		this.board = board;
		this.resultAnalyzer = resultAnalyzer;

		this.currentPlayer = players[0];
	}

	public ResultAnalyzer getResultAnalyzer() {
		return resultAnalyzer;
	}

	public Board getBoard() {
		return board;
	}

	public boolean enterPlayerMark(int x, int y) throws CellOccupiedException {
		if (board.getCells()[x][y].getMark() != Mark.BLANK) {
			throw new CellOccupiedException("Cell occupied");
		}

		board.getCells()[x][y].setMark(currentPlayer.getMark());
		resultAnalyzer.analyze(board);
		return true;
	}

	public Player nextPlayer() {
		currentPlayer = currentPlayer.equals(players[0]) ? players[1] : players[0];
		return currentPlayer;
	}
}
