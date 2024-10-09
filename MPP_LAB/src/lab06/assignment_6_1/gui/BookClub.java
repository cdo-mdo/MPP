package lab06.assignment_6_1.gui;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JSplitPane;

/**
 * This sample code illustrate several Swing techniques:
 * 
 * 1. Use of split panes 2. Using the CardLayout to switch the view to different
 * panels in the same space 3. Using a JList to control the CardLayout
 * 
 * 
 * @author corazza
 *
 */
public class BookClub extends JFrame {

	String[] links;
	JList<String> linkList;
	// context for CardLayout
	JPanel cards;

	JPanel panel1;
	LoginPanel loginPanel;

	JPanel panel2;
	ViewPanel viewPanel;

	JPanel panel3;
	AddBookPanel addPanel;

	StatusPanel statusPanel;

	public BookClub() {

		setSize(600, 450);

		String[] items = { "Login", "View Titles", "Add Book" };
		linkList = new JList<String>(items);
		createPanels();
		// set up split panes
		JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, linkList, cards);
		splitPane.setDividerLocation(180);
		// default layout for JFrame is BorderLayout; add method
		// adds to content pane
		add(splitPane, BorderLayout.CENTER);

		JSplitPane mainPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT, splitPane, statusPanel);
		mainPane.setDividerLocation(350);
		add(mainPane, BorderLayout.CENTER);

	}

	/* Organize panels into a CardLayout */
	public void createPanels() {

		statusPanel = new StatusPanel();
		loginPanel = new LoginPanel(statusPanel);
		viewPanel = new ViewPanel();
		addPanel = new AddBookPanel(statusPanel);

		cards = new JPanel(new CardLayout());

		cards.add(loginPanel, "Login");
		cards.add(viewPanel, "View Titles");
		cards.add(addPanel, "Add Book");

		// connect JList elements to CardLayout panels
		linkList.addListSelectionListener(event -> {
			String value = linkList.getSelectedValue().toString();
			CardLayout cl = (CardLayout) (cards.getLayout());
			cl.show(cards, value);
		});

		statusPanel.setStatus("Welcome to the Book Club!", Color.BLUE);

	}

	private static final long serialVersionUID = -760156396736751840L;

}
