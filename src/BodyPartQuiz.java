import java.awt.Frame;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class BodyPartQuiz {

	// Get 3 celebrity photos from the internet, save them to your computer, and fill
	// in their paths here. To get the path, right click on the image, and copy its Location.
	String firstImage = "Body1.jpg";
	String secondImage = "Body2.jpg";
	String thirdImage = "Body3.jpg";

	Frame window = new Frame();
	
	
	
	private void startQuiz() {
		// Set the size of the window so that you can only see part of the image.
			window.setSize(600, 600);
		window.setVisible(true);
			
			// Make an int variable to hold the score.
int score =(0);



// Ask the user who this person is and store their answer
String Answer= JOptionPane.showInputDialog("What body part is this");
if(Answer.equals("foot")){
	JOptionPane.showMessageDialog(null, "Correct");
	score = score+1;
}
else
{
	JOptionPane.showMessageDialog(null, "Incorrect");
}
showNextImage();





String Answer2= JOptionPane.showInputDialog("What body part is this");
if(Answer2.equals("face")){
	JOptionPane.showMessageDialog(null, "Correct");
	score = score+1;
}
else
{
	JOptionPane.showMessageDialog(null, "Incorrect");
}
showNextImage();


String Answer3= JOptionPane.showInputDialog("What body part is this");
if(Answer3.equals("hand")){
	JOptionPane.showMessageDialog(null, "Correct");
	score = score+1;
}
else
{
	JOptionPane.showMessageDialog(null, "Incorrect");
}

		// If they got the answer right:
		// -- Tell them they are correct.
		// -- Increase the score by 1

		// Otherwise:
		// -- Tell them they are wrong

		// Use the method below to show the next image
		// Show the score
		// .... repeat for all your images.....
	}

	public void showNextImage() {
		window.removeAll();
		window.add(getNextImage());
		window.pack();
	}

	public static void main(String[] args) {
		BodyPartQuiz quiz = new BodyPartQuiz();
		quiz.initializeGui();
		quiz.startQuiz();
	}

	private void initializeGui() {
		initializeImageList();
		imageIterator = imageList.iterator();
		window.setVisible(true);
		showNextImage();
	}

	private JLabel loadImage(String fileName) {
		Icon icon = new ImageIcon(getClass().getResource(fileName));
		JLabel image = new JLabel(icon);
	
		return image;
	}

	ArrayList<JLabel> imageList = new ArrayList<JLabel>();
	Iterator<JLabel> imageIterator;

	private void initializeImageList() {
		JLabel imageLabel = loadImage(firstImage);
		imageList.add(imageLabel);
		imageLabel = loadImage(secondImage);
		imageList.add(imageLabel);
		imageLabel = loadImage(thirdImage);
		imageList.add(imageLabel);
	}

	private JLabel getNextImage() {
		if (imageIterator.hasNext()) {
			System.out.println("Has Next");
			return imageIterator.next();
		}
		window.dispose();
		return new JLabel();
	}
}


