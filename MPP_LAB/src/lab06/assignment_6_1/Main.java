package lab06.assignment_6_1;

import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;

import lab06.assignment_6_1.gui.BookClub;

public class Main {
	public static void main(String[] args) {
		EventQueue.invokeLater(() -> {
			JFrame frame = new BookClub();
			frame.setTitle("Book Club");
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			centerFrameOnDesktop(frame);
			frame.setVisible(true);
		});
	}

	public static void centerFrameOnDesktop(Component f) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		int height = toolkit.getScreenSize().height;
		int width = toolkit.getScreenSize().width;
		int frameHeight = f.getSize().height;
		int frameWidth = f.getSize().width;
		f.setLocation(((width - frameWidth) / 2), (height - frameHeight) / 3);
	}
}
