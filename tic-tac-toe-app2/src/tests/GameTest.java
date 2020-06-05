package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.techlabs.tictactoe.Board;
import com.techlabs.tictactoe.CellOccupiedException;
import com.techlabs.tictactoe.Game;
import com.techlabs.tictactoe.InvalidPositionException;
import com.techlabs.tictactoe.Mark;
import com.techlabs.tictactoe.Player;
import com.techlabs.tictactoe.ResultAnalyzer;

public class GameTest {

	@Test
	public void checkPlayerMark() {
		Player[] players = new Player[] { new Player("J", Mark.O), new Player("V", Mark.X) };
		ResultAnalyzer resultAnalyzer = new ResultAnalyzer();
		Game game = new Game(players, new Board(3), resultAnalyzer);

		try {
			game.enterPlayerMark(1);
		} catch (CellOccupiedException e) {
			e.printStackTrace();
		} catch (InvalidPositionException e) {
			e.printStackTrace();
		}

		assertEquals(Mark.O, game.getBoard().getCells()[0].getMark());
	}

	@Test(expected = CellOccupiedException.class)
	public void checkCellOccupiedException() throws CellOccupiedException, InvalidPositionException {
		Player[] players = new Player[] { new Player("J", Mark.O), new Player("V", Mark.X) };
		ResultAnalyzer resultAnalyzer = new ResultAnalyzer();
		Game game = new Game(players, new Board(3), resultAnalyzer);

		game.enterPlayerMark(1);
		game.enterPlayerMark(1);

	}

	@Test(expected = InvalidPositionException.class)
	public void checkInvalidPositionException() throws CellOccupiedException, InvalidPositionException {
		Player[] players = new Player[] { new Player("J", Mark.O), new Player("V", Mark.X) };
		ResultAnalyzer resultAnalyzer = new ResultAnalyzer();
		Game game = new Game(players, new Board(3), resultAnalyzer);

		game.enterPlayerMark(0);

	}

	@Test
	public void checkNextPlayer() {

		Player player1 = new Player("J", Mark.O);
		Player player2 = new Player("V", Mark.X);
		Player[] players = new Player[] { player1, player2 };
		ResultAnalyzer resultAnalyzer = new ResultAnalyzer();
		Game game = new Game(players, new Board(3), resultAnalyzer);

		assertEquals(player2, game.nextPlayer());
	}

}
