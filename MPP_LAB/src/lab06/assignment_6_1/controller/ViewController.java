package lab06.assignment_6_1.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import lab06.assignment_6_1.gui.ViewPanel;

public class ViewController implements ActionListener {
	ViewPanel viewPanel;

	ViewController(ViewPanel viewPanel) {
		this.viewPanel = viewPanel;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	}

}
