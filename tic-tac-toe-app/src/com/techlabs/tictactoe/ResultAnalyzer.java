package com.techlabs.tictactoe;

public class ResultAnalyzer {

	private Result result;

	public ResultAnalyzer() {
		result = Result.PLAYING;
	}

	public void analyze(Board board) {
		Cell[][] cells = board.getCells();
		if (checkLines(cells) || checkDiagonal(cells)) {
			result = Result.FINISHED;
		}

		int numberOfBlanks = 0;
		for (Cell[] c1 : cells) {
			for (Cell cell : c1) {
				if (cell.getMark().equals(Mark.B)) {
					numberOfBlanks++;
				}
			}
		}

		if (numberOfBlanks == 0) {
			result = Result.DRAW;
		}
	}

	private boolean checkLines(Cell[][] cells) {
		if ((!cells[0][0].getMark().equals(Mark.B)
				&& (cells[0][0].getMark() == cells[0][1].getMark() && cells[0][0].getMark() == cells[0][2].getMark()))
				|| (!cells[1][0].getMark().equals(Mark.B) && cells[1][0].getMark() == cells[1][1].getMark()
						&& cells[1][0].getMark() == cells[1][2].getMark())
				|| (!cells[2][0].getMark().equals(Mark.B) && cells[2][0].getMark() == cells[2][1].getMark()
						&& cells[2][0].getMark() == cells[2][2].getMark())) {
			return true;
		}

		if ((!cells[0][0].getMark().equals(Mark.B)
				&& (cells[0][0].getMark() == cells[1][0].getMark() && cells[0][0].getMark() == cells[2][0].getMark()))
				|| (!cells[0][1].getMark().equals(Mark.B) && cells[0][1].getMark() == cells[1][1].getMark()
						&& cells[0][1].getMark() == cells[2][1].getMark())
				|| (!cells[0][2].getMark().equals(Mark.B) && cells[0][2].getMark() == cells[1][2].getMark()
						&& cells[0][2].getMark() == cells[2][2].getMark())) {
			return true;
		}

		return false;
	}

	private boolean checkDiagonal(Cell[][] cells) {
		if ((!cells[0][0].getMark().equals(Mark.B)
				&& (cells[0][0].getMark() == cells[1][1].getMark() && cells[0][0].getMark() == cells[2][2].getMark()))
				|| (!cells[0][2].getMark().equals(Mark.B) && (cells[0][2].getMark() == cells[1][1].getMark()
						&& cells[0][2].getMark() == cells[2][0].getMark()))) {
			return true;
		}

		return false;
	}

	public Result getResult() {
		return result;
	}

}
