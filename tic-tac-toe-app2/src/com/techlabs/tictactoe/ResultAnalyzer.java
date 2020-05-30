package com.techlabs.tictactoe;

public class ResultAnalyzer {

	private Result result;

	public ResultAnalyzer() {
		result = Result.INPROGRESS;
	}

	public void analyze(Board board) {
		Cell[][] cells = board.getCells();
		if (checkRowMatch(cells) || checkColumnMatch(cells) || checkDiagonal(cells) || checkReverseDiagonal(cells)) {
			result = Result.WIN;
		}

		int numberOfBlanks = 0;
		for (Cell[] c1 : cells) {
			for (Cell cell : c1) {
				if (cell.getMark().equals(Mark.BLANK)) {
					numberOfBlanks++;
				}
			}
		}

		if (numberOfBlanks == 0) {
			result = Result.DRAW;
		}
	}

	public boolean checkRowMatch(Cell[][] cells) {
		for (Cell[] c1 : cells) {
			if ((!c1[0].getMark().equals(Mark.BLANK)
					&& (c1[0].getMark().equals(c1[1].getMark()) && c1[0].getMark().equals(c1[2].getMark())))) {
				return true;
			}
		}

		return false;
	}

	public boolean checkColumnMatch(Cell[][] cells) {

		Cell[][] transposedCells = new Cell[3][3];

		int m = cells.length;
		int n = cells[0].length;
		for (int x = 0; x < n; x++) {
			for (int y = 0; y < m; y++) {
				transposedCells[x][y] = cells[y][x];
			}
		}

		return checkRowMatch(transposedCells);

//		if ((!cells[0][0].getMark().equals(Mark.BLANK)
//				&& (cells[0][0].getMark().equals(cells[1][0].getMark())
//						&& cells[0][0].getMark().equals(cells[2][0].getMark()))
//				|| (!cells[0][1].getMark().equals(Mark.BLANK) && (cells[0][1].getMark().equals(cells[1][1].getMark())
//						&& cells[0][1].getMark().equals(cells[2][1].getMark()))))
//				|| (!cells[0][2].getMark().equals(Mark.BLANK) && (cells[0][2].getMark().equals(cells[1][2].getMark())
//						&& cells[0][2].getMark().equals(cells[2][2].getMark())))) {
//			return true;
//		}

//		return false;
	}

	public boolean checkDiagonal(Cell[][] cells) {
		if ((!cells[0][0].getMark().equals(Mark.BLANK) && (cells[0][0].getMark() == cells[1][1].getMark()
				&& cells[0][0].getMark() == cells[2][2].getMark()))) {
			return true;
		}

		return false;
	}

	public boolean checkReverseDiagonal(Cell[][] cells) {
		if ((!cells[0][2].getMark().equals(Mark.BLANK) && (cells[0][2].getMark() == cells[1][1].getMark()
				&& cells[0][2].getMark() == cells[2][0].getMark()))) {
			return true;
		}
		return false;
	}

//	private boolean checkLines(Cell[][] cells) {
//		if ((!cells[0][0].getMark().equals(Mark.B)
//				&& (cells[0][0].getMark() == cells[0][1].getMark() && cells[0][0].getMark() == cells[0][2].getMark()))
//				|| (!cells[1][0].getMark().equals(Mark.B) && cells[1][0].getMark() == cells[1][1].getMark()
//						&& cells[1][0].getMark() == cells[1][2].getMark())
//				|| (!cells[2][0].getMark().equals(Mark.B) && cells[2][0].getMark() == cells[2][1].getMark()
//						&& cells[2][0].getMark() == cells[2][2].getMark())) {
//			return true;
//		}
//
//		if ((!cells[0][0].getMark().equals(Mark.B)
//				&& (cells[0][0].getMark() == cells[1][0].getMark() && cells[0][0].getMark() == cells[2][0].getMark()))
//				|| (!cells[0][1].getMark().equals(Mark.B) && cells[0][1].getMark() == cells[1][1].getMark()
//						&& cells[0][1].getMark() == cells[2][1].getMark())
//				|| (!cells[0][2].getMark().equals(Mark.B) && cells[0][2].getMark() == cells[1][2].getMark()
//						&& cells[0][2].getMark() == cells[2][2].getMark())) {
//			return true;
//		}
//
//		return false;
//	}

//	private boolean checkDiagonal(Cell[][] cells) {
//		if ((!cells[0][0].getMark().equals(Mark.B)
//				&& (cells[0][0].getMark() == cells[1][1].getMark() && cells[0][0].getMark() == cells[2][2].getMark()))
//				|| (!cells[0][2].getMark().equals(Mark.B) && (cells[0][2].getMark() == cells[1][1].getMark()
//						&& cells[0][2].getMark() == cells[2][0].getMark()))) {
//			return true;
//		}
//
//		return false;
//	}

	public Result getResult() {
		return result;
	}

}
