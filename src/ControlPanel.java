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
	JButton homeFoulButton = new JButton();
	JButton awayFoulButton = new JButton();

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
		homeFoulButton.addActionListener(this);
		awayFoulButton.addActionListener(this);
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
		homeFoulButton.setText("Home Fouls");
		awayFoulButton.setText("Away Fouls");
		homeName.setText("Home Name");
		awayName.setText("Away Name");
		
		panel.add(homePlusButton);
		panel.add(homeMinusButton);
		panel.add(homeTOButton);
		panel.add(homeFoulButton);
		panel.add(homeName);
		
		panel2.add(awayPlusButton);
		panel2.add(awayMinusButton);
		panel2.add(awayTOButton);
		panel2.add(awayFoulButton);
		panel2.add(awayName);
		
		mainPanel.add(panel);
		mainPanel.add(panel2);

		frame.add(mainPanel);

		frame.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if (homePlusButton.equals(e.getSource())) {
			board.changeHomeScore(1);
		}

		else if (homeMinusButton.equals(e.getSource())) {
			board.changeHomeScore(-1);
		}

		else if (awayPlusButton.equals(e.getSource())) {
			board.changeAwayScore(1);
		}

		else if (awayMinusButton.equals(e.getSource())) {
			board.changeAwayScore(-1);
		}

		else if (homeTOButton.equals(e.getSource())) {
			board.changeHomeTO(-1);
		}

		else if (awayTOButton.equals(e.getSource())) {
			board.changeAwayTO(-1);
		}
		
		else if (homeFoulButton.equals(e.getSource())) {
			board.changeHomeFoul(1);
		}
		
		else if (awayFoulButton.equals(e.getSource())) {
			board.changeAwayFoul(1);
		}
		
		else if (homeName.equals(e.getSource())) {
			homeName.getText();
			board.sethomeLabel(homeName.getText());
			
		}
		
		else if (awayName.equals(e.getSource())) {
			awayName.getText();
			board.setawayLabel(awayName.getText());
		}
	}
}