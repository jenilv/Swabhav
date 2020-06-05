package com.techlabs.tictactoe;

public class Board {

	private final Cell[] cells;

	public Board(int gridSize) {
		cells = new Cell[gridSize * gridSize];
		for (int i = 0; i < cells.length; i++) {
			cells[i] = new Cell();
		}
	}

	public Cell[] getCells() {
		return cells;
	}

}
