package com.techlabs.welcome;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class WelcomePage extends JFrame {

	public static void main(String[] args) {
		WelcomePage welcomePage = new WelcomePage();
		welcomePage.createGui();
	}

	public WelcomePage() {
		super("Welcome to Swabhav");
	}

	private void createGui() {
		JPanel panel = new JPanel();
		JButton button = new JButton("Register");
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				SwingUtilities.invokeLater(new Runnable() {

					@Override
					public void run() {
						new RegisterPage().createRegisterGui();
						setVisible(false);
						dispose();
					}
				});
			}
		});
		panel.add(button);
		add(panel);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 100);
//		pack();
		setVisible(true);
	}
}
