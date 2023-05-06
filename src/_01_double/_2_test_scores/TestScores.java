package _01_double._2_test_scores;

import javax.swing.JOptionPane;

public class TestScores {
	public static void main(String[] args) {
		String score = JOptionPane.showInputDialog("Enter your latest test score");
		
		double scoreAsInt = Double.parseDouble(score);
		
		if ( scoreAsInt >= 70) {
			JOptionPane.showMessageDialog(null, "Good job passing your test with a " + scoreAsInt + "%!");
		} else {
			JOptionPane.showMessageDialog(null, "You need at least 70 to pass, Maybe you could retake it?");
		}
		
	}
}
