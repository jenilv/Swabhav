package com.techlabs.tictactoe.test;

import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

import com.techlabs.tictactoe.Board;
import com.techlabs.tictactoe.Game;
import com.techlabs.tictactoe.Mark;
import com.techlabs.tictactoe.Player;
import com.techlabs.tictactoe.ResultAnalyzer;

public class TicTacToeGuiTest extends JFrame implements ActionListener {

	private Label player1Label;
	private JTextField player1NameField;
	private Label player1MarkLabel;
	private JRadioButton xMarkButton;
	private JRadioButton oMarkButton;
	private Label player2Label;
	private JTextField player2NameField;
	private JTextField gridSizeField;
	private Label gridSizeLabel;

	public TicTacToeGuiTest() {
		super("TicTacToe Details");
	}

	private void createAndDisplayGUI() {
		JPanel initPanel = getInitPanel();
		JButton submitButton = new JButton("Start Game");
		submitButton.addActionListener(this);
		initPanel.add(submitButton);
		add(initPanel);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
		setVisible(true);
	}

	private JPanel getInitPanel() {
		JPanel jPanel = new JPanel();
		jPanel.setLayout(new BoxLayout(jPanel, BoxLayout.Y_AXIS));
		player1Label = new Label("Enter Player 1 name");
		jPanel.add(player1Label);
		player1NameField = new JTextField(40);
		player1NameField.setMaximumSize(player1NameField.getPreferredSize());
		jPanel.add(player1NameField);
		player1MarkLabel = new Label("Select Player 1 mark");
		jPanel.add(player1MarkLabel);
		JPanel radioButtonPanel = new JPanel();
		radioButtonPanel.setLayout(new BoxLayout(radioButtonPanel, BoxLayout.X_AXIS));
		xMarkButton = new JRadioButton("X");
		oMarkButton = new JRadioButton("O");
		xMarkButton.setSelected(true);
		radioButtonPanel.add(xMarkButton);
		radioButtonPanel.add(oMarkButton);
		jPanel.add(radioButtonPanel);
		player2Label = new Label("Enter Player 2 name");
		jPanel.add(player2Label);
		player2NameField = new JTextField(40);
		player2NameField.setMaximumSize(player2NameField.getPreferredSize());
		jPanel.add(player2NameField);
		gridSizeLabel = new Label("Enter grid size");
		jPanel.add(gridSizeLabel);
		gridSizeField = new JTextField();
		gridSizeField.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if (!((c >= '0') && (c <= '9') || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {
					getToolkit().beep();
					e.consume();
				}
			}
		});
		jPanel.add(gridSizeField);

		return jPanel;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				Mark p1Mark = xMarkButton.isSelected() ? Mark.X : Mark.O;
				Mark p2Mark = p1Mark.equals(Mark.X) ? Mark.O : Mark.X;

				Player[] players = new Player[] { new Player(player1NameField.getText(), p1Mark),
						new Player(player2NameField.getText(), p2Mark) };

				Game game = new Game(players, new Board(Integer.parseInt(gridSizeField.getText())),
						new ResultAnalyzer());
				new TicTacToe(game, Integer.parseInt(gridSizeField.getText()), players[0]).play();
				setVisible(false);
				dispose();
			}
		});
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				new TicTacToeGuiTest().createAndDisplayGUI();
			}
		});
	}
}
