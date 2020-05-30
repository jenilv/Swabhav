package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.techlabs.tictactoe.Board;
import com.techlabs.tictactoe.Mark;
import com.techlabs.tictactoe.Result;
import com.techlabs.tictactoe.ResultAnalyzer;

public class ResultAnalyzerTest {

	@Test
	public void checkRowMatch() {
		ResultAnalyzer resultAnalyzer = new ResultAnalyzer();
		Board board = new Board();
		board.getCells()[0][0].setMark(Mark.O);
		board.getCells()[0][1].setMark(Mark.O);
		board.getCells()[0][2].setMark(Mark.O);
		board.getCells()[1][1].setMark(Mark.X);
		board.getCells()[2][2].setMark(Mark.X);

		boolean match = resultAnalyzer.checkRowMatch(board.getCells());
		assertEquals(true, match);
	}

	@Test
	public void checkColumnMatch() {
		ResultAnalyzer resultAnalyzer = new ResultAnalyzer();
		Board board = new Board();
		board.getCells()[0][0].setMark(Mark.O);
		board.getCells()[1][0].setMark(Mark.O);
		board.getCells()[2][0].setMark(Mark.O);
		board.getCells()[1][1].setMark(Mark.X);
		board.getCells()[2][2].setMark(Mark.X);

		boolean match = resultAnalyzer.checkColumnMatch(board.getCells());
		assertEquals(true, match);
	}

	@Test
	public void checkDiagonalColumnMatch() {
		ResultAnalyzer resultAnalyzer = new ResultAnalyzer();
		Board board = new Board();
		board.getCells()[0][0].setMark(Mark.O);
		board.getCells()[1][1].setMark(Mark.O);
		board.getCells()[2][2].setMark(Mark.O);
		board.getCells()[0][1].setMark(Mark.X);
		board.getCells()[1][0].setMark(Mark.X);

		boolean match = resultAnalyzer.checkDiagonal(board.getCells());
		assertEquals(true, match);
	}

	@Test
	public void checkReverseDiagonalColumnMatch() {
		ResultAnalyzer resultAnalyzer = new ResultAnalyzer();
		Board board = new Board();
		board.getCells()[0][2].setMark(Mark.O);
		board.getCells()[1][1].setMark(Mark.O);
		board.getCells()[2][0].setMark(Mark.O);
		board.getCells()[0][1].setMark(Mark.X);
		board.getCells()[1][0].setMark(Mark.X);

		boolean match = resultAnalyzer.checkReverseDiagonal(board.getCells());
		assertEquals(true, match);
	}

	@Test
	public void checkResult() {
		ResultAnalyzer resultAnalyzer = new ResultAnalyzer();
		Board board = new Board();
		board.getCells()[0][2].setMark(Mark.O);
		board.getCells()[1][1].setMark(Mark.O);
		board.getCells()[2][0].setMark(Mark.O);
		board.getCells()[0][1].setMark(Mark.X);
		board.getCells()[1][0].setMark(Mark.X);

		resultAnalyzer.analyze(board);
		assertEquals(Result.WIN, resultAnalyzer.getResult());
	}

}
