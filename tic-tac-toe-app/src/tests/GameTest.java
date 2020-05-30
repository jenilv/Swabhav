package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.techlabs.tictactoe.Board;
import com.techlabs.tictactoe.CellOccupiedException;
import com.techlabs.tictactoe.Game;
import com.techlabs.tictactoe.Mark;
import com.techlabs.tictactoe.Player;
import com.techlabs.tictactoe.ResultAnalyzer;

public class GameTest {

	@Test
	public void checkPlayerMark() {
		Player[] players = new Player[] { new Player("J", Mark.O), new Player("V", Mark.X) };
		ResultAnalyzer resultAnalyzer = new ResultAnalyzer();
		Game game = new Game(players, new Board(), resultAnalyzer);

		try {
			game.enterPlayerMark(0, 0);
		} catch (CellOccupiedException e) {
			e.printStackTrace();
		}

		assertEquals(Mark.O, game.getBoard().getCells()[0][0].getMark());
	}

	@Test(expected = CellOccupiedException.class)
	public void checkCellOccupiedException() throws CellOccupiedException {
		Player[] players = new Player[] { new Player("J", Mark.O), new Player("V", Mark.X) };
		ResultAnalyzer resultAnalyzer = new ResultAnalyzer();
		Game game = new Game(players, new Board(), resultAnalyzer);

		game.enterPlayerMark(0, 0);
		game.enterPlayerMark(0, 0);

	}

	@Test
	public void checkNextPlayer() {

		Player player1 = new Player("J", Mark.O);
		Player player2 = new Player("V", Mark.X);
		Player[] players = new Player[] { player1, player2 };
		ResultAnalyzer resultAnalyzer = new ResultAnalyzer();
		Game game = new Game(players, new Board(), resultAnalyzer);

		assertEquals(player2, game.nextPlayer());
	}

}
