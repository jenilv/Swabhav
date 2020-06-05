package com.techlabs.tictactoe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ResultAnalyzer {

	private Result result;

	public ResultAnalyzer() {
		result = Result.INPROGRESS;
	}

	public void analyze(Board board) {
		Cell[] cells = board.getCells();

		if (checkRowMatch(cells) || checkColumnMatch(cells) || checkDiagonal(cells) || checkReverseDiagonal(cells)) {
			result = Result.WIN;
		}

		int numberOfBlanks = 0;
		for (Cell cell : cells) {
			if (cell.getMark().equals(Mark.BLANK)) {
				numberOfBlanks++;
			}
		}

		if (numberOfBlanks == 0) {
			result = Result.DRAW;
		}
	}

	public boolean checkRowMatch(Cell[] cells) {

		int numberOfElements = cells.length;
		int numberOfRows = (int) Math.sqrt(numberOfElements);
		List<Cell[]> rows = new ArrayList<>();
		for (int i = 0; i < numberOfRows; i++) {
			rows.add(new Cell[numberOfRows]);
			for (int j = i * numberOfRows, c = 0; c < numberOfRows; j++, c++) {
				rows.get(i)[c] = cells[j];
			}
		}

		for (Cell[] c : rows) {
			Set<Cell> set = new HashSet<>(Arrays.asList(c));
			if (set.size() == 1 && !set.iterator().next().getMark().equals(Mark.BLANK)) {
				return true;
			}
		}

		return false;
	}

	public boolean checkColumnMatch(Cell[] cells) {
		int numberOfElements = cells.length;
		int numberOfColumns = (int) Math.sqrt(numberOfElements);
		List<Cell[]> columns = new ArrayList<>();
		for (int i = 0; i < numberOfColumns; i++) {
			columns.add(new Cell[numberOfColumns]);
			for (int j = i, c = 0; c < numberOfColumns; c++, j += numberOfColumns) {
				columns.get(i)[c] = cells[j];
			}
		}

		for (Cell[] c : columns) {
			Set<Cell> set = new HashSet<>(Arrays.asList(c));
			if (set.size() == 1 && !set.iterator().next().getMark().equals(Mark.BLANK)) {
				return true;
			}
		}

		return false;
	}

	public boolean checkDiagonal(Cell[] cells) {
		int numberOfElements = cells.length;
		int numberOfDiagonalElements = (int) Math.sqrt(numberOfElements);
		List<Cell> diagonalCells = new ArrayList<>();
		for (int i = 0; i < cells.length; i += numberOfDiagonalElements + 1) {
			diagonalCells.add(cells[i]);
		}
		Set<Cell> set = new HashSet<>(diagonalCells);
		if (set.size() == 1 && !set.iterator().next().getMark().equals(Mark.BLANK)) {
			return true;
		}

		return false;
	}

	public boolean checkReverseDiagonal(Cell[] cells) {
		int numberOfElements = cells.length;
		int numberOfDiagonalElements = (int) Math.sqrt(numberOfElements);
		List<Cell> diagonalCells = new ArrayList<>();
		for (int i = 0; i < cells.length; i += numberOfDiagonalElements - 1) {
			diagonalCells.add(cells[i]);
		}
		Set<Cell> set = new HashSet<>(diagonalCells);
		if (set.size() == 1 && !set.iterator().next().getMark().equals(Mark.BLANK)) {
			return true;
		}

		return false;
	}

	public Result getResult() {
		return result;
	}

}
