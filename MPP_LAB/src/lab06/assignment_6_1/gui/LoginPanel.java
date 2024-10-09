package lab06.assignment_6_1.gui;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import lab06.assignment_6_1.controller.LoginController;

public class LoginPanel extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6699774226463825212L;

	StatusPanel status;
	JList list;

	JPanel panel1;
	JLabel title;

	JPanel panel2;
	JTextField userText;
//	JTextField pwdText;
	JPasswordField pwdText;

	public String getUsername() {
		return userText.getText();
	}

	public String getPassword() {
		return pwdText.getText();
	}

	JPanel panel3;
	JLabel username;
	JLabel password;

	JPanel panel4;
	JButton buttonLogin;

	public void setStatus(String message) {
		status.setStatus(message);
	}

	public void setStatus(String message, Color color) {
		status.setStatus(message, color);
	}

	LoginPanel(StatusPanel status) {
		this.status = status;
		this.setLayout(new GridLayout(11, 1));

		definePanel1();
		definePanel2();
		definePanel3();
		definePanel4();

		this.add(panel1);
		this.add(panel2);
		this.add(panel3);
		this.add(panel4);

	}

	LoginPanel(StatusPanel status, JList list) {
		this(status);
		this.list = list;
	}

	private void definePanel1() {
		panel1 = new JPanel();
		panel1.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
		title = new JLabel("Login");
		title.setForeground(Color.BLUE.darker());
		title.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel1.add(title);
	}

	private void definePanel2() {
		panel2 = new JPanel();
		panel2.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 5));
		userText = new JTextField(11);
		pwdText = new JPasswordField(11);
		panel2.add(userText);
		panel2.add(pwdText);
	}

	private void definePanel3() {
		panel3 = new JPanel();
		panel3.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 5));
		username = new JLabel("Username                  ");
		password = new JLabel("Password");
		password.setPreferredSize(username.getPreferredSize());
		panel3.add(username);
		panel3.add(password);
	}

	private void definePanel4() {
		panel4 = new JPanel();
		panel4.setLayout(new FlowLayout(FlowLayout.CENTER));
		buttonLogin = new JButton("Login");
		buttonLogin.addActionListener(new LoginController(this));

		panel4.add(buttonLogin);
	}

}
