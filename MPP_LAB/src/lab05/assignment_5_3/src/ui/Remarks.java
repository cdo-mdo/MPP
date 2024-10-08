package lab05.assignment_5_3.src.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.*;

import lab05.assignment_5_3.src.control.Control;

@SuppressWarnings("serial")
public class Remarks extends JFrame {
	private JPanel topPanel;
	private JPanel middlePanel;
	private JPanel lowerPanel;
	private JLabel heading;
	private JTextArea remarksData;

	public void setHeading(String s) {
		heading.setText(s);
	}

	public void setRemarks(String s) {
		remarksData.setText(s);
	}

	public Remarks() {
		initializeWindow();
		JPanel mainPanel = new JPanel();
		defineTopPanel();
		defineMiddlePanel();
		defineLowerPanel();
		mainPanel.setLayout(new BorderLayout(12, 12));
		mainPanel.add(topPanel, BorderLayout.NORTH);
		mainPanel.add(middlePanel, BorderLayout.CENTER);
		mainPanel.add(lowerPanel, BorderLayout.SOUTH);
		getContentPane().add(mainPanel);
	}

	private void defineTopPanel() {
		topPanel = new JPanel();
		topPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		heading = new JLabel();
		heading.setForeground(Color.BLUE.darker().darker());
		heading.setFont(new Font("Tahoma", Font.BOLD, 16));
		topPanel.add(heading);

	}

	private void defineMiddlePanel() {
		middlePanel = new JPanel();
		middlePanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		remarksData = new JTextArea(25, 25);
		String text = "Joe is bad\nSo bad\nI don't know what is wrong with him";
		remarksData.setText(text);
		middlePanel.add(remarksData);

	}

	public void defineLowerPanel() {
		lowerPanel = new JPanel();
		lowerPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
		JButton butn = new JButton("Back to Start");
		butn.addActionListener(evt -> Control.INSTANCE.backToStart(this));
		lowerPanel.add(butn);
	}

	private void initializeWindow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Remarks");
		centerFrameOnDesktop(this);
		setSize(400, 280);
		setResizable(false);
	}

	public static void centerFrameOnDesktop(Component f) {
		final int SHIFT_AMOUNT = 0;
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		int height = toolkit.getScreenSize().height;
		int width = toolkit.getScreenSize().width;
		int frameHeight = f.getSize().height;
		int frameWidth = f.getSize().width;
		f.setLocation(((width - frameWidth) / 2) - SHIFT_AMOUNT, (height - frameHeight) / 3);
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				Remarks r = new Remarks();
				r.setVisible(true);
			}
		});
	}

}
