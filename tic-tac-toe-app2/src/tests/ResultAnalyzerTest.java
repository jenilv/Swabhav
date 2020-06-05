package tests;

import org.junit.Test;

import com.techlabs.tictactoe.Board;
import com.techlabs.tictactoe.Cell;
import com.techlabs.tictactoe.Mark;
import com.techlabs.tictactoe.ResultAnalyzer;

public class ResultAnalyzerTest {

	@Test
	public void checkRowMatch() {

		Board board = new Board(3);
		Cell[] cells = board.getCells();
		cells[0].setMark(Mark.X);
		cells[1].setMark(Mark.X);
		cells[2].setMark(Mark.X);

		ResultAnalyzer analyzer = new ResultAnalyzer();
		boolean v = analyzer.checkRowMatch(cells);
		System.out.println(v);
	}

	@Test
	public void checkColumnMatch() {
		Board board = new Board(3);
		Cell[] cells = board.getCells();
		cells[0].setMark(Mark.X);
		cells[3].setMark(Mark.X);
		cells[6].setMark(Mark.X);

		ResultAnalyzer analyzer = new ResultAnalyzer();
		boolean v = analyzer.checkColumnMatch(cells);
		System.out.println(v);
	}

	@Test
	public void checkDiagonalMatch() {
		Board board = new Board(3);
		Cell[] cells = board.getCells();
		cells[0].setMark(Mark.X);
		cells[4].setMark(Mark.X);
		cells[8].setMark(Mark.X);

		ResultAnalyzer analyzer = new ResultAnalyzer();
		boolean v = analyzer.checkDiagonal(cells);
		System.out.println(v);
	}

	@Test
	public void checkReverseDiagonalMatch() {
		Board board = new Board(3);
		Cell[] cells = board.getCells();
		cells[2].setMark(Mark.X);
		cells[4].setMark(Mark.X);
		cells[6].setMark(Mark.X);

		ResultAnalyzer analyzer = new ResultAnalyzer();
		boolean v = analyzer.checkReverseDiagonal(cells);
		System.out.println(v);
	}

	@Test
	public void checkResult() {

	}

}
