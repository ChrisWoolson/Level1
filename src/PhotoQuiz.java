
// Copyright Wintriss Technical Schools 2013
import java.awt.Component;
import java.awt.Frame;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public static void main(String[] args) throws Exception {
		Frame quizWindow = new Frame();
		quizWindow.setVisible(true);

		// 1. find an image on the internet, and put its URL in a String
		// variable (from your browser, right click on the image, and select
		// “Copy Image URL”)
		int s = 0;

		String url = "http://i.dailymail.co.uk/i/pix/2017/01/16/20/332EE38400000578-4125738-image-a-132_1484600112489.jpg";
		// 2. create a variable of type "Component" that will hold your image
		Component image;
		// 3. use the "createImage()" method below to initialize your Component
		image = createImage(url);
		// 4. add the image to the quiz window
		quizWindow.add(image);
		// 5. call the pack() method on the quiz window
		quizWindow.pack();
		// 6. ask a question that relates to the image
		String q1 = JOptionPane.showInputDialog("what continent can you see?");
		// 7. print "CORRECT" if the user gave the right answer
		if (q1.equalsIgnoreCase("Africa")) {
			JOptionPane.showMessageDialog(null, "Correct");
			s = s + 1;

		}
		// 8. print "INCORRECT" if the answer is wrong
		else {
			JOptionPane.showMessageDialog(null, "Incorrect");
		}
		// 9. remove the component from the quiz window (you may not see the
		// effect of this until step 12)
		quizWindow.remove(image);
		// 10. find another image and create it (might take more than one line
		// of code)
		String url2 = "https://www.bmw.com/content/dam/bmw/common/all-models/4-series/gran-coupe/2017/images-and-videos/images/BMW-4-series-gran-coupe-images-and-videos-1920x1200-04.jpg.asset.1487328216285.jpg";
		Component image2;
		image2 = createImage(url2);
		quizWindow.add(image2);
		quizWindow.pack();

		// 11. add the second image to the quiz window

		// 12. pack the quiz window

		// 13. ask another question
		String answer2 = JOptionPane.showInputDialog("What kind of car is this?");
		// 14+ check answer, say if correct or incorrect, etc.
		if (answer2.equalsIgnoreCase("BMW")) {
			JOptionPane.showMessageDialog(null, "correct");
			s = s + 1;
		} else {
			JOptionPane.showMessageDialog(null, "Incorrect");
		}
		JOptionPane.showMessageDialog(null, "Your score is " + s + "/2");
	}

	private static Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image
	// (imageComponent.addMouseMotionListener())
}
