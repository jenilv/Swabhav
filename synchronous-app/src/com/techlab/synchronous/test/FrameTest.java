package com.techlab.synchronous.test;

import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import com.techlab.synchronous.DisplayTime;

public class FrameTest {

	public static void main(String[] args) {
		JFrame jFrame = new JFrame("Display Time");
		JPanel jPanel = new JPanel();
		JButton displayTimeButton = new JButton("Display time");
		DisplayTime displayTime = new DisplayTime();
		Label label = new Label();
		displayTimeButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				while (true) {
//					label.setText(displayTime.getTime());
					System.out.println(displayTime.getTime());
				}
			}
		});
		JButton helloButton = new JButton("Hello");
		helloButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				label.setText("Hello");
			}
		});

		jPanel.setLayout(new BoxLayout(jPanel, BoxLayout.Y_AXIS));
		jPanel.add(displayTimeButton);
		jPanel.add(helloButton);
		jPanel.add(label);
		jFrame.add(jPanel);
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		jFrame.setSize(400, 400);
		jFrame.setVisible(true);
	}
}
