package lab06.assignment_6_1.gui;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import lab06.assignment_6_1.controller.AddController;

public class AddBookPanel extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7726631505080211757L;
	
	StatusPanel status;
	
	JPanel panel1;
	JLabel title;

	JPanel panel2;
	JLabel firstName;
	JTextField firstNameText;

	public String getFirstName() {
		return firstNameText.getText();
	}

	JPanel panel3;
	JLabel lastName;
	JTextField lastNameText;

	public String getLastName() {
		return lastNameText.getText();
	}

	JPanel panel4;
	JLabel bookTitle;
	JTextField bookTitleText;

	public String getBookTitle() {
		return bookTitle.getText();
	}

	JPanel panel5;
	JButton addButton;
	
	public void setStatus(String message) {
		status.setStatus(message);
	}

	AddBookPanel(StatusPanel status) {
		this.setLayout(new GridLayout(11, 1));

		this.status = status;
		
		definePanel1();
		definePanel2();
		definePanel3();
		definePanel4();
		definePanel5();

		this.add(panel1);
		this.add(panel2);
		this.add(panel3);
		this.add(panel4);
		this.add(panel5);
	}

	void definePanel1() {
		panel1 = new JPanel();
		panel1.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
		title = new JLabel("Add Book Title");
		title.setForeground(Color.BLUE.darker());
		title.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel1.add(title);
	}

	void definePanel2() {
		panel2 = new JPanel();
		panel2.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 5));
		firstName = new JLabel("Author First Name");
		firstNameText = new JTextField(11);
		panel2.add(firstName);
		panel2.add(firstNameText);
	}

	void definePanel3() {
		panel3 = new JPanel();
		panel3.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 5));
		lastName = new JLabel("Author Last Name");
		lastNameText = new JTextField(11);
		panel3.add(lastName);
		panel3.add(lastNameText);
	}

	void definePanel4() {
		panel4 = new JPanel();
		panel4.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 5));
		bookTitle = new JLabel("Book Title");
		bookTitleText = new JTextField(11);
		panel4.add(bookTitle);
		panel4.add(bookTitleText);
	}

	void definePanel5() {
		panel5 = new JPanel();
		panel5.setLayout(new FlowLayout(FlowLayout.CENTER));
		addButton = new JButton("Add Book");
		addButton.addActionListener(new AddController(this));
		panel5.add(addButton);
	}

}
