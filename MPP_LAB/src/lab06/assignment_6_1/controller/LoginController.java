package lab06.assignment_6_1.controller;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JList;

import lab06.assignment_6_1.gui.LoginPanel;
import lab06.assignment_6_1.data.Data;
import lab06.assignment_6_1.data.User;

public class LoginController implements ActionListener {
	JList list;
	LoginPanel loginPanel;

	public LoginController(LoginPanel loginPanel) {
		this.loginPanel = loginPanel;
	}

	public LoginController(LoginPanel loginPanel, JList list) {
		this.loginPanel = loginPanel;
		this.list = list;
	}

	@Override
	public void actionPerformed(ActionEvent evt) {
		String userName = loginPanel.getUsername();
		String password = loginPanel.getPassword();
		User user = Data.authenticate(userName, password);
		if (user == null) {
			// show status login fail
			loginPanel.setStatus("Login failed!", Color.RED.darker());
			return;
		}
		loginPanel.setStatus("Login successful!", Color.GREEN.darker());
		// show status login success
		return;

	}

}
