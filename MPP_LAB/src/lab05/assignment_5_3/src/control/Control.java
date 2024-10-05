package lab05.assignment_5_3.src.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JFrame;

import lab05.assignment_5_3.src.data.Data;
import lab05.assignment_5_3.src.data.Logins;
import lab05.assignment_5_3.src.ui.*;

public enum Control {
	INSTANCE;

	Start start;
	Grades grades;
	Login login;
	String username;
	Remarks remarks;
	private boolean isLoggedIn = false;
	private String next;

	public boolean isLoggedIn() {
		return isLoggedIn;
	}

	public void setLoggedIn(boolean b) {
		isLoggedIn = b;
	}

	public void setStart(Start st) {
		this.start = st;
	}

	public void backToStart(JFrame frame) {
		frame.setVisible(false);
		start.setMessage("");
		start.setVisible(true);
		isLoggedIn = false;
		next = "";
	}

	class LoginListener implements ActionListener {
		public void actionPerformed(ActionEvent evt) {
			login = new Login();
			start.setVisible(false);
			login.setVisible(true);
		}
	}

	class RemarksListener implements ActionListener {
		public void actionPerformed(ActionEvent evt) {
			if (isLoggedIn == false) {
				login = new Login();
				start.setVisible(false);
				login.setVisible(true);
				next = "remark";
				return;
			}
			remarks = new Remarks();
			HashMap<String, String> rem = Data.dataMap.get(username).getTeacherRemarks();
			StringBuilder sb = new StringBuilder();
			for (String key : rem.keySet()) {
				sb.append(key + " : " + rem.get(key) + "\n");
			}
			remarks.setRemarks(sb.toString());
			remarks.setTitle("Teacher Remarks for " + username);
			remarks.setHeading("Teacher Remarks for " + username);
			Control.INSTANCE.start.setMessage("");
			Control.INSTANCE.start.setVisible(false);
			remarks.setVisible(true);
		}
	}

	class GradesListener implements ActionListener {
		public void actionPerformed(ActionEvent evt) {
			if (isLoggedIn == false) {
				login = new Login();
				start.setVisible(false);
				login.setVisible(true);
				next = "grade";
				return;
			}
			grades = new Grades();
			HashMap<String, String> gr = Data.dataMap.get(username).getGrades();
			StringBuilder sb = new StringBuilder();
			for (String key : gr.keySet()) {
				sb.append(key + " : " + gr.get(key) + "\n");
			}
			grades.setGrades(sb.toString());
			grades.setTitle("Grades for " + username);
			grades.setHeading("Grades for " + username);
			Control.INSTANCE.start.setMessage("");
			Control.INSTANCE.start.setVisible(false);
			grades.setVisible(true);
		}
	}

	class SubmitLoginListener implements ActionListener {
		public void actionPerformed(ActionEvent evt) {
			String username = login.getUserName();
			String password = login.getPassword();
			if (!Logins.foundUserNamePwd(username, password)) {
				login.setMessage("Login failed.");
			} else {
				Control.this.username = username;
				Control.this.isLoggedIn = true;
				login.setMessage("Successful login");
				login.setVisible(false);
				start.setVisible(true);
				Control.INSTANCE.start.setMessage("Successful login");
				if ("grade".equals(next)) {
					
					grades = new Grades();
					HashMap<String, String> gr = Data.dataMap.get(username).getGrades();
					StringBuilder sb = new StringBuilder();
					for (String key : gr.keySet()) {
						sb.append(key + " : " + gr.get(key) + "\n");
					}
					grades.setGrades(sb.toString());
					grades.setTitle("Grades for " + username);
					grades.setHeading("Grades for " + username);
					Control.INSTANCE.start.setMessage("");
					Control.INSTANCE.start.setVisible(false);
					grades.setVisible(true);
					start.setVisible(false);
					return;
				}
				if ("remark".equals(next)) {
					remarks = new Remarks();
					HashMap<String, String> rem = Data.dataMap.get(username).getTeacherRemarks();
					StringBuilder sb = new StringBuilder();
					for (String key : rem.keySet()) {
						sb.append(key + " : " + rem.get(key) + "\n");
					}
					remarks.setRemarks(sb.toString());
					remarks.setTitle("Teacher Remarks for " + username);
					remarks.setHeading("Teacher Remarks for " + username);
					Control.INSTANCE.start.setMessage("");
					Control.INSTANCE.start.setVisible(false);
					remarks.setVisible(true);
					return;
				}
			}
		}
	}

	public SubmitLoginListener getSubmitLoginListener() {
		return new SubmitLoginListener();
	}

	public LoginListener getLoginListener() {
		return new LoginListener();
	}

	public RemarksListener getRemarksListener() {
		return new RemarksListener();
	}

	public GradesListener getGradesListener() {
		return new GradesListener();
	}
}
