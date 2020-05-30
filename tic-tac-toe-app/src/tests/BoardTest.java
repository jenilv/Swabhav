package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.techlabs.tictactoe.Board;
import com.techlabs.tictactoe.Cell;

public class BoardTest {

	@Test
	public void checkIfBoardCreatedWithProperNumberOfCells() {
		Board board = new Board();

		int numberOfCells = 0;
		for (Cell[] cells : board.getCells()) {
			for (Cell cell : cells) {
				numberOfCells++;
			}
		}

		assertEquals(9, numberOfCells);
	}

}
