
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
		String Component = Forest;
		// 3. use the "createImage()" method below to initialize your Component
		createImage(Forest);
		// 4. add the image to the quiz window
		
		// 5. call the pack() method on the quiz window
		
		// 6. ask a question that relates to the image
		
		String answer = JOptionPane.showInputDialog("What type of habitat is this? " +Forest ); 
		// 7. print "CORRECT" if the user gave the right answer
		if (answer.equals("rainforest")) {
			JOptionPane.showMessageDialog(null, "CORRECT");
		}
		// 8. print "INCORRECT" if the answer is wrong
		else {
			JOptionPane.showMessageDialog(null, "INCORRECT");
		}
		// 9. remove the component from the quiz window (you may not see the effect of this until step 12)

		// 10. find another image and create it (might take more than one line of code)
		String Wolf = "https://www.google.com/url?sa=i&rct=j&q=&esrc=s&source=images&cd=&cad=rja&uact=8&ved=0ahUKEwjsucf0yrbVAhUEWCYKHfrgDowQjRwIBw&url=http%3A%2F%2Fwallpapercave.com%2Fwolfpack-wallpaper&psig=AFQjCNF4pGn298JNBFEwoMWnel0OV8MsJA&ust=1501695792866177";
		createImage(Wolf);
		// 11. add the second image to the quiz window

		// 12. pack the quiz window

		// 13. ask another question
		pack(Wolf);
		String animal = JOptionPane.showInputDialog("What animal is this?");
		// 14+ check answer, say if correct or incorrect, etc.
		if (animal.equals("wolf")) {
			JOptionPane.showMessageDialog(null, "CORRECT");
		}
		else if (animal.equals("wolves")) {
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
