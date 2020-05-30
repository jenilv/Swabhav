package com.techlabs.tictactoe;

public class Board {

	private Cell[][] cells = new Cell[3][3];

	public Board() {
		for (int i = 0; i < cells.length; i++) {
			for (int j = 0; j < cells.length; j++) {
				cells[i][j] = new Cell();
			}
		}
	}

	public Cell[][] getCells() {
		return cells;
	}

}
