import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ControlPanel implements ActionListener {
public static void main(String[] args) {

	ControlPanel myControlPanel = new ControlPanel();
	myControlPanel.run();
	
}

JPanel panel = new JPanel();
JPanel panel2 = new JPanel();
 
JButton homePlusButton = new JButton("+1");
JButton homeMinusButton = new JButton("-1"); 
JButton awayPlusButton = new JButton();
JButton awayMinusButton = new JButton(); 

public void run() {
	JFrame frame = new JFrame();
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setSize(300, 300);
	frame.setVisible(true);
	frame.setTitle("Control Panel");
	
	homePlusButton.addActionListener(this);
	homeMinusButton.addActionListener(this);
	awayPlusButton.addActionListener(this);
	awayMinusButton.addActionListener(this);
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	JButton buttonPressed = (JButton) e.getSource();
	if (homePlusButton.equals(buttonPressed)) {
		Scoreboard.changeHomeScore(1);
	}
}
}
