import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ControlPanel implements ActionListener {
	public static void main(String[] args) {

		ControlPanel myControlPanel = new ControlPanel();
		myControlPanel.run();
	}

	JPanel panel = new JPanel();
	JPanel panel2 = new JPanel();
	JPanel mainPanel = new JPanel();

	JTextField homeName = new JTextField();
	JTextField awayName = new JTextField();

	Scoreboard board = new Scoreboard();

	JButton homePlusButton = new JButton("+1");
	JButton homeMinusButton = new JButton("-1");
	JButton awayPlusButton = new JButton();
	JButton awayMinusButton = new JButton();
	JButton homeTOButton = new JButton();
	JButton awayTOButton = new JButton();

	public void run() {
		board.run();
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 300);
		frame.setVisible(true);
		frame.setTitle("Control Panel");

		homePlusButton.addActionListener(this);
		homeMinusButton.addActionListener(this);
		awayPlusButton.addActionListener(this);
		awayMinusButton.addActionListener(this);
		homeTOButton.addActionListener(this);
		awayTOButton.addActionListener(this);
		homeName.addActionListener(this);
		awayName.addActionListener(this);

		homePlusButton.setText("Home Plus");
		homeMinusButton.setText("Home Minus");
		awayPlusButton.setText("Away Plus");
		awayMinusButton.setText("Away Minus");
		homeTOButton.setText("Home Timeout");
		awayTOButton.setText("Away Timeout");

		panel.add(homePlusButton);
		panel.add(homeMinusButton);
		panel.add(homeTOButton);

		panel2.add(awayPlusButton);
		panel2.add(awayMinusButton);
		panel2.add(awayTOButton);

		mainPanel.add(panel);
		mainPanel.add(panel2);

		frame.add(mainPanel);

		frame.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton buttonPressed = (JButton) e.getSource();
		if (homePlusButton.equals(buttonPressed)) {
			board.changeHomeScore(1);

		}

		else if (homeMinusButton.equals(buttonPressed)) {
			board.changeHomeScore(-1);
		}

		else if (awayPlusButton.equals(buttonPressed)) {
			board.changeAwayScore(1);
		}

		else if (awayMinusButton.equals(buttonPressed)) {
			board.changeAwayScore(-1);
		}

	}
}
