package com.techlabs.guessgame;

import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class GuessGameGui extends JFrame implements ActionListener {

	private JButton submitButton;
	private Label guessLabel;
	private JTextField guessTextField;
	private Game2 game;

	public GuessGameGui() {
		super("Guess game");
		game = new Game2();
	}

	public void createGui() {
		JPanel panel = new JPanel();
		guessLabel = new Label("Start Guessing!");
		guessTextField = new JTextField(40);
		submitButton = new JButton("Enter guess");
		submitButton.addActionListener(this);
		panel.add(guessLabel);
		panel.add(guessTextField);
		panel.add(submitButton);
		add(panel);
		pack();
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == submitButton) {
			String string = game.enterGuess(Integer.parseInt(guessTextField.getText()));
			guessLabel.setText(string);
			if (string.equals("You win!")) {
				submitButton.setEnabled(false);
			}
			guessTextField.setText("");
			guessTextField.grabFocus();
		}
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				new GuessGameGui().createGui();
			}
		});
	}
}
