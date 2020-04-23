package _03_if_else._2_remarkable;

import javax.swing.JOptionPane;

public class unbi {
public static void main(String[] args) {
	String A = JOptionPane.showInputDialog("Whats your Birthday Date?");
	if (A.equals("04/23")) {
		JOptionPane.showMessageDialog(null, "Happy Birthday!");
	}
	else {
		JOptionPane.showMessageDialog(null, "Happy Unbirthday!");
	}
}
}
