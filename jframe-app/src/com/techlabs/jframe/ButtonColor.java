package com.techlabs.jframe;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ButtonColor {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Button Color");
		JPanel panel = new JPanel();
		JButton redButton = new JButton("Red");
		JButton blueButton = new JButton("Blue");
		panel.add(redButton);
		panel.add(blueButton);
		redButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				redButton.setBackground(Color.RED);
			}
		});
		blueButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				blueButton.setBackground(Color.BLUE);
			}
		});
		panel.add(redButton);
		panel.add(blueButton);
		frame.add(panel);
		frame.setSize(400, 400);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
