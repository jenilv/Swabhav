package com.techlabs.welcome;

import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class RegisterPage extends JFrame implements ActionListener {

	private JComboBox comboBox;
	private JTextField firstNameTextField;
	private JTextField lastNameTextField;
	private JButton submitButton;

	public RegisterPage() {
		super("Register here");
	}

	public void createRegisterGui() {
		JPanel jPanel = new JPanel();
		jPanel.setLayout(new BoxLayout(jPanel, BoxLayout.Y_AXIS));
		Label firstNameLabel = new Label("Enter First Name");
		firstNameTextField = new JTextField(50);
		Label lastNameLabel = new Label("Enter Last Name");
		lastNameTextField = new JTextField(50);
		comboBox = new JComboBox(new String[] { "Developer", "Tester", "Analyst" });
		submitButton = new JButton("Submit");
		submitButton.addActionListener(this);
		jPanel.add(firstNameLabel);
		jPanel.add(firstNameTextField);
		jPanel.add(lastNameLabel);
		jPanel.add(lastNameTextField);
		jPanel.add(new Label("Select Designation"));
		jPanel.add(comboBox);
		jPanel.add(submitButton);
		add(jPanel);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
		setVisible(true);
	}

	private void createSubmitGui() {
		JPanel jPanel = new JPanel();
		jPanel.setLayout(new BoxLayout(jPanel, BoxLayout.Y_AXIS));
		Label firstNameLabel = new Label("First Name: " + firstNameTextField.getText());
		Label lastNameLabel = new Label("Last Name: " + lastNameTextField.getText());
		Label designationLabel = new Label("Designation: " + comboBox.getSelectedItem());
		jPanel.add(firstNameLabel);
		jPanel.add(lastNameLabel);
		jPanel.add(designationLabel);
		add(jPanel);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == submitButton) {
			getContentPane().removeAll();
			setVisible(false);
			createSubmitGui();
		}
	}
}
