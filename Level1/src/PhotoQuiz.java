
import java.awt.Component;
import java.awt.Frame;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public static void main(String[] args) throws Exception {
		Frame quizWindow = new Frame();
		quizWindow.setVisible(true);

		// 1. find an image on the internet, and put its URL in a String variable (from your browser, right click on the
		// image, and select “Copy Image URL”)
		String Forest = "https://i.ytimg.com/vi/pPrO2jlay40/maxresdefault.jpg";
		// 2. create a variable of type "Component" that will hold your image
		Component image;
		// 3. use the "createImage()" method below to initialize your Component
		image = createImage(Forest);
		// 4. add the image to the quiz window
		quizWindow.add(image);
		// 5. call the pack() method on the quiz window
		quizWindow.pack();
		// 6. ask a question that relates to the image
		String answer = JOptionPane.showInputDialog("What Type Of Habitat Is This? "); 
		// 7. print "CORRECT" if the user gave the right answer
		if (answer.equals("rainforest")) {
			JOptionPane.showMessageDialog(null, "CORRECT");
		}
		// 8. print "INCORRECT" if the answer is wrong
		else {
			JOptionPane.showMessageDialog(null, "INCORRECT");
		}
		// 9. remove the component from the quiz window (you may not see the effect of this until step 12)
		quizWindow.remove(image);
		// 10. find another image and create it (might take more than one line of code)
		String  second= "http://robinsdesign.net/image/cache/catalog//DNA-Strand-Cross-Stitch-Pattern-PDF/DNA-Strand-Cross-Stitch-Pattern-PDF-2-900x900.jpg";
		Component molecule;
		// 11. add the second image to the quiz window
		molecule = createImage(second);
		quizWindow.add(molecule);
		// 12. pack the quiz window
		quizWindow.pack();
		// 13. ask another question
		String strand = JOptionPane.showInputDialog("What Is The Scientific Name For This Molecule?");
		// 14+ check answer, say if correct or incorrect, etc.
		if (strand.equals("deoxyribonucleic acid")) {
			JOptionPane.showMessageDialog(null, "CORRECT");
		}
		else {
			JOptionPane.showMessageDialog(null, "INCORRECT");
		}
	}

	private static void pack(String answer) {
		// TODO Auto-generated method stub
		
	}

	private static Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image (imageComponent.addMouseMotionListener())
}
