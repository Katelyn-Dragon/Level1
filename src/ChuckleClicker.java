import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ChuckleClicker implements ActionListener {
	public static void main(String[] args) {
		ChuckleClicker clicker = new ChuckleClicker();
		clicker.makeButtons();
	}

	JButton button = new JButton();
	JButton button2 = new JButton();
	JPanel panel = new JPanel();
	
public void makeButtons (){
	JFrame frame = new JFrame();
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setSize(300, 300);
	frame.setVisible(true);
	frame.setTitle("Chuckle Clicker");
	button.setText("Joke");
	button2.setText("Punchline");
	button.addActionListener(this);
	button2.addActionListener(this);
	
}



@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
}
	
}
