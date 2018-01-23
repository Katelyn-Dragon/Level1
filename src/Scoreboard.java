import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Scoreboard implements ActionListener {
public static void main(String[] args) {
	Scoreboard myScoreboard = new Scoreboard();
	myScoreboard.run();
}
JPanel panel = new JPanel();
JPanel panel2 = new JPanel();
JLabel label = new JLabel();
JButton button = new JButton();
JButton button2 = new JButton();
JButton button3 = new JButton();
int homeScore = 0;
int awayScore = 0;


public void run() {
	JFrame frame = new JFrame();
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setSize(300,300);
	frame.setVisible(true);
	button.setText("Home");
	button2.setText("Away");
	button.addActionListener(this);
	button2.addActionListener(this);
	button.setText(Integer.toString(homeScore));
	frame.setTitle("Scoreboard");
	frame.setLayout(new BorderLayout());
	frame.add(panel, BorderLayout.NORTH);
	frame.add(panel2, BorderLayout.CENTER);
	panel.setLayout(new BorderLayout());
	panel.add(label, BorderLayout.NORTH);
	panel.add(button, BorderLayout.CENTER);
	panel.add(button3, BorderLayout.SOUTH);
	panel2.setLayout(new BorderLayout());
	panel2.add(button2, BorderLayout.NORTH);
	frame.pack();
}


@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
}
}
