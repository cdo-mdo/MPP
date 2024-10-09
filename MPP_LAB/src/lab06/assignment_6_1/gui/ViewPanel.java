package lab06.assignment_6_1.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import lab06.assignment_6_1.data.Data;

public class ViewPanel extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6554706387838219221L;
	private JPanel topPanel;
	private JLabel heading;

	private JPanel middlePanel;
	private JTextArea viewData;

	public void setText(String data) {
		viewData.setText(data);
	}

	void setHeading(String s) {
		heading.setText(s);
	}

	void setGrades(String text) {
		viewData.setText(text);
	}

	ViewPanel() {
		this.setLayout(new BorderLayout(12, 12));

		defineTopPanel();
		defineMiddlePanel();

		this.add(topPanel, BorderLayout.NORTH);
		this.add(middlePanel, BorderLayout.CENTER);
	}

	private void defineTopPanel() {
		topPanel = new JPanel();
		topPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		heading = new JLabel("View Titles");
		heading.setForeground(Color.BLUE.darker());
		heading.setFont(new Font("Tahoma", Font.BOLD, 14));
		topPanel.add(heading);

	}

	private void defineMiddlePanel() {
		middlePanel = new JPanel();
		middlePanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		viewData = new JTextArea(10, 30);
		StringBuilder data = new StringBuilder();
		for (String book : Data.bookTitles) {
			data.append(book + "\n");
		}
		viewData.setText(data.toString());
		middlePanel.add(viewData);

	}
}
