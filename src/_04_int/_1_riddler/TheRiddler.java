package _04_int._1_riddler;

import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		
int score = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
String A = JOptionPane.showInputDialog("I am not a ladybug, I am red, I am a bird,\n and I live in South America, What am I?");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
// Answer = Scarlet Ibis
if (A.equals("Scarlet Ibis")) {
	JOptionPane.showMessageDialog(null, "Congratulations\nScore +1!");
	score += 1;
}
else {	// 5. Otherwise, say "wrong" and tell them the answer
	JOptionPane.showMessageDialog(null, "Wrong!\nThe correct answer was Scarlet Abis");
	}
		// 6. Add some more riddles
String B = JOptionPane.showInputDialog("What has legs, but can't walk?");
		// 2. Make a pop up to show the score.
if (B.equals("A Chair")) {
	JOptionPane.showMessageDialog(null, "Congratulations\nScore +1!");
	score += 1;
}
else {	// 5. Otherwise, say "wrong" and tell them the answer
	JOptionPane.showMessageDialog(null, "Wrong!\nThe correct answer was A Chair");
	}
	}
}

