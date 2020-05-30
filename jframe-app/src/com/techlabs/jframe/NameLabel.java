package com.techlabs.jframe;

import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class NameLabel {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Hello");
		JPanel panel = new JPanel();
		JButton button = new JButton("Hello");
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JFrame nFrame = new JFrame("Hello Jenil");
				JPanel nPanel = new JPanel();
				Label label = new Label("Jenil");
				nPanel.add(label);
				nFrame.add(nPanel);

				nFrame.setSize(400, 400);
				nFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				nFrame.setVisible(true);
			}
		});
		panel.add(button);
		frame.add(panel);
		frame.setSize(400, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}