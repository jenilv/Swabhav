package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.techlabs.tictactoe.Board;
import com.techlabs.tictactoe.Cell;
import com.techlabs.tictactoe.Mark;

public class CellTest {

	@Test
	public void checkIfCellsBlankOnStart() {
		Board board = new Board(3);

		int emptyCells = 0;
		for (Cell cell : board.getCells()) {
			if (cell.getMark().equals(Mark.BLANK)) {
				emptyCells++;
			}
		}

		assertEquals(9, emptyCells);
	}

	@Test
	public void checkIfMarkedProperly() {
		Board board = new Board(3);

		board.getCells()[0].setMark(Mark.O);

		assertEquals(Mark.O, board.getCells()[0].getMark());
	}
}
