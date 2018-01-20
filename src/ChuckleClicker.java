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
	JFrame frame = new JFrame();
	JButton button = new JButton();
	JButton button2 = new JButton();
	JPanel panel = new JPanel();
	
public void makeButtons (){
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.add(panel);
	frame.setVisible(true);
	frame.setTitle("Chuckle Clicker");
	button.setText("Joke");
	button2.setText("Punchline");
	button.addActionListener(this);
	button2.addActionListener(this);
	panel.add(button);
	panel.add(button2);
	frame.pack();
	}



@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	JButton buttonPressed =(JButton)e.getSource();
	if (button.equals(buttonPressed)) {
		System.out.println("joke");
	}
	else {
		System.out.println("punchline");
	}
}
	
}
