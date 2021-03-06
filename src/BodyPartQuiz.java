import java.awt.Component;
import java.awt.Frame;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class BodyPartQuiz {

	// Get 3 celebrity photos from the internet, save them to your computer, and fill
	// in their paths here. To get the path, right click on the image, and copy its Location.
	String firstImage = "/Users/League/Desktop/JH.jpg";
	String secondImage = "/Users/League/Desktop/GD.jpeg";
	String thirdImage = "/Users/League/Desktop/KJ.jpg";

	Frame window = new Frame();
	
	private void startQuiz() {
		// Set the size of the window so that you can only see part of the image.
		window.setSize(200,300);
		// Make an int variable to hold the score.
			int score = 0;
		// Ask the user who this person is and store their answer
			String answer = JOptionPane.showInputDialog("Who Is This Person?");
		// If they got the answer right:
			if (answer.equals("Jung Hoseok")) {
				JOptionPane.showMessageDialog(null, "Correct");
				score += 1;
			}
		// -- Tell them they are correct.
		// -- Increase the score by 1

		// Otherwise:
			else {
				JOptionPane.showMessageDialog(null, "Incorrect");
			}
		// -- Tell them they are wrong
		// Use the method below to show the next image
			JOptionPane.showMessageDialog(null, "Score = " +score);
			showNextImage();
			window.setSize(200, 400);
			String input = JOptionPane.showInputDialog("Who Is This Person?");
			if (input.equals("Kwon Jiyong")) {
				JOptionPane.showMessageDialog(null, "Correct");
				score += 1;
				JOptionPane.showMessageDialog(null, "Score = " +score);
			}
			else {
				JOptionPane.showMessageDialog(null, "Incorrect");
			}
			showNextImage();
			String in = JOptionPane.showInputDialog("Who Is This Person?");
			
		// Show the score
		// .... repeat for all your images.....
	}

	private Component createImage(String firstImage2) {
		// TODO Auto-generated method stub
		return null;
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
		Icon icon = new ImageIcon(fileName);
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
		if (imageIterator.hasNext())
			return imageIterator.next();
		window.dispose();
		return new JLabel();
	}
}