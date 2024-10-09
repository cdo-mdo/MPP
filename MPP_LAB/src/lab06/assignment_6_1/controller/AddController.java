package lab06.assignment_6_1.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import lab06.assignment_6_1.data.Data;
import lab06.assignment_6_1.gui.AddBookPanel;

public class AddController implements ActionListener {
	AddBookPanel addBookPanel;

	public AddController(AddBookPanel addBookPanel) {
		this.addBookPanel = addBookPanel;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String firstName = addBookPanel.getFirstName();
		String lastName = addBookPanel.getLastName();
		String bookTitle = addBookPanel.getBookTitle();

		Data.addBookTitle(bookTitle);
		
		addBookPanel.setStatus("The book  has been added to the collection!");
	}
	
	

}
