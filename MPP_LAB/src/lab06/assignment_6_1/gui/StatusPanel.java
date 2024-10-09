package lab06.assignment_6_1.gui;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class StatusPanel extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = -677571972004789761L;
	JLabel status;

	void setStatus(String message) {
		status.setText(message);
	}

	void setStatus(String message, Color color) {
		status.setForeground(color);
		status.setText(message);
	}

	StatusPanel() {
		this.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
		status = new JLabel("status");
		this.add(status);
	}
}
