package com.techlabs.jframe;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Username {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Username");
		JPanel panel = new JPanel();
		JTextField usernameField = new JTextField();
		JPasswordField passwordField = new JPasswordField();
		JButton submitButton = new JButton("Submit");
		submitButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JFrame nFrame = new JFrame("Username");
				JPanel nPanel = new JPanel();
				JLabel label = new JLabel("Hello " + usernameField.getText());
				nPanel.add(label);
				nFrame.add(nPanel);
				nFrame.setSize(200, 200);
				nFrame.setVisible(true);
			}
		});
		BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.Y_AXIS);
		panel.setLayout(boxlayout);
		panel.add(usernameField);
		panel.add(passwordField);
		panel.add(submitButton);
//		panel.setLayout(null);
		frame.add(panel);
		frame.setSize(400, 400);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
