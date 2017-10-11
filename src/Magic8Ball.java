
// Copyright Wintriss Technical Schools 2013
import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {

	// 1. Make a main method that includes all the steps below….
	public static void main(String[] args) {

		// 2. Make a variable that will hold a random number and put a random number into this variable using "new
		// Random().nextInt(4)"
		int number = new Random().nextInt();
		// 3. Print out this variable
		String answer = JOptionPane.showInputDialog("What is your question?");

		// 4. Get the user to enter a question for the 8 ball

		// 5. If the random number is 0
		if (number == 0) {
			// -- tell the user "Yes"
			JOptionPane.showMessageDialog(null, "Yes ");
		}
		// 6. If the random number is 1
		if (number == 1) {
			// -- tell the user "No"
			JOptionPane.showMessageDialog(null, "no ");
		}
		// 7. If the random number is 2
		if (number == 2) {
			// -- tell the user "Maybe you should ask Google?"
			JOptionPane.showMessageDialog(null, "try google ");
		}
		// 8. If the random number is 3
		if (number == 3) {
			// -- write your own answer
			JOptionPane.showMessageDialog(null, "go with plan B");
		}
	}
}
