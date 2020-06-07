package com.techlabs.tictactoe.test;

import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.techlabs.tictactoe.CellOccupiedException;
import com.techlabs.tictactoe.Game;
import com.techlabs.tictactoe.InvalidPositionException;
import com.techlabs.tictactoe.Player;
import com.techlabs.tictactoe.Result;

public class TicTacToe extends JFrame implements ActionListener {

	private Label currentPlayerLabel;
	private Label gameStatusLabel;
	private int gridSize;
	private Player currentPlayer;
	private Game game;
	private JPanel buttonPanel;
	private static final String CURRENT_PLAYER_STRING = "Current Player: ";
	private static final String GAME_STATUS_STRING = "Game Status: ";

	public TicTacToe(Game game, int gridSize, Player currentPlayer) {
		super("TicTacToe");
		this.game = game;
		this.gridSize = gridSize;
		this.currentPlayer = currentPlayer;
	}

	public void play() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		JPanel contentPane = new JPanel();
		contentPane.setLayout(new FlowLayout(FlowLayout.LEFT, 20, 20));
		contentPane.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY, 2));

		JPanel leftPanel = new JPanel();
		leftPanel.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY, 2));
		leftPanel.setLayout(new BoxLayout(leftPanel, BoxLayout.Y_AXIS));
		JPanel labelPanel = new JPanel();
		labelPanel.setLayout(new BoxLayout(labelPanel, BoxLayout.Y_AXIS));
		gameStatusLabel = new Label();
		gameStatusLabel.setText(GAME_STATUS_STRING + Result.INPROGRESS.name());
		currentPlayerLabel = new Label(CURRENT_PLAYER_STRING + currentPlayer.getName(), JLabel.CENTER);
		labelPanel.add(currentPlayerLabel);
		labelPanel.add(gameStatusLabel);
		leftPanel.add(labelPanel);
		contentPane.add(leftPanel);

		buttonPanel = new JPanel();
		buttonPanel.setLayout(new GridLayout(gridSize, gridSize, 10, 10));
		int count = 1;
		for (int i = 0; i < gridSize; i++) {
			for (int j = 0; j < gridSize; j++) {
				JButton button = new JButton("-");
				button.addActionListener(this);
				button.setActionCommand(String.valueOf(count));
				buttonPanel.add(button);
				count++;
			}
		}
		contentPane.add(buttonPanel);

		setContentPane(contentPane);
		pack();
		setLocationByPlatform(true);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton button = (JButton) e.getSource();
		int position = Integer.parseInt(button.getActionCommand());
		try {
			game.enterPlayerMark(position);
		} catch (CellOccupiedException e1) {
			e1.printStackTrace();
		} catch (InvalidPositionException e1) {
			e1.printStackTrace();
		}
		button.setText(currentPlayer.getMark().name());
		button.setEnabled(false);
		currentPlayer = game.nextPlayer();
		currentPlayerLabel.setText(CURRENT_PLAYER_STRING + currentPlayer.getName());
		Result result = game.getResultAnalyzer().getResult();

		if (result.equals(Result.DRAW)) {
			gameStatusLabel.setText(GAME_STATUS_STRING + Result.DRAW.name());
			disableAllButtons();
		} else if (result.equals(Result.WIN)) {
			currentPlayer = game.nextPlayer();
			currentPlayerLabel.setText(CURRENT_PLAYER_STRING + currentPlayer.getName());
			gameStatusLabel.setText(GAME_STATUS_STRING + currentPlayer.getName() + " wins!");
			disableAllButtons();
		}
	}

	private void disableAllButtons() {
		Component[] components = buttonPanel.getComponents();
		for (Component component : components) {
			component.setEnabled(false);
		}
	}

}
