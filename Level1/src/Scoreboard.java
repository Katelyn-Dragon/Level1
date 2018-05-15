import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
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
	JPanel mainPanel = new JPanel();

	JLabel homeLabel = new JLabel();
	JLabel awayLabel = new JLabel();
	JLabel hScoreLabel = new JLabel();
	JLabel aScoreLabel = new JLabel();
	JLabel hFoulsLabel = new JLabel();
	JLabel aFoulsLabel = new JLabel();
	JLabel hTOLabel = new JLabel();
	JLabel aTOLabel = new JLabel();

	int homeScore = 0;
	int awayScore = 0;
	int homeFouls = 0;
	int awayFouls = 0;
	int homeTO = 3;
	int awayTO = 3;

	public void run() {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 300);
		frame.setVisible(true);
		frame.setTitle("Scoreboard");
		
		homeLabel.setText("Home");
		awayLabel.setText("Away");

		hScoreLabel.setText(Integer.toString(homeScore));
		aScoreLabel.setText(Integer.toString(awayScore));
		hFoulsLabel.setText(Integer.toString(homeFouls));
		aFoulsLabel.setText(Integer.toString(awayFouls));
		hTOLabel.setText(Integer.toString(homeTO));
		aTOLabel.setText(Integer.toString(awayTO));
		
		hScoreLabel.setText("Score: " + homeScore);
		aScoreLabel.setText("Score: " + awayScore);
		hFoulsLabel.setText("Fouls: " + homeFouls);
		aFoulsLabel.setText("Fouls: " + awayFouls);
		hTOLabel.setText("Timeouts: " + homeTO);
		aTOLabel.setText("Timeouts: " + awayTO);
		
		mainPanel.add(panel);
		mainPanel.add(panel2);
		
		panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
		frame.add(mainPanel);

		panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
		panel.add(homeLabel, BorderLayout.NORTH);
		panel.add(hScoreLabel, BorderLayout.SOUTH);
		panel.add(hFoulsLabel, BorderLayout.CENTER);
		panel.add(hTOLabel, BorderLayout.SOUTH);
		
		panel2.setLayout(new BoxLayout(panel2, BoxLayout.PAGE_AXIS));
		
		panel2.setLayout(new BoxLayout(panel2, BoxLayout.PAGE_AXIS));
		panel2.add(awayLabel, BorderLayout.NORTH);
		panel2.add(aScoreLabel, BorderLayout.SOUTH);
		panel2.add(aFoulsLabel, BorderLayout.CENTER);
		panel2.add(aTOLabel, BorderLayout.SOUTH);
		
		frame.pack();
	}
	
	public void changeHomeScore(int newHomeScore) {
		homeScore += newHomeScore;
		hScoreLabel.setText("Score: " + Integer.toString(homeScore));
		
	}
	
	public void changeAwayScore(int newAwayScore) {
		awayScore += newAwayScore;
		aScoreLabel.setText("Score: " + Integer.toString(awayScore));
		
	}
	
	public void sethomeLabel(String newHomeName) {
		homeLabel.setText(newHomeName);
		
	}
	
	public void setawayLabel(String newAwayName) {
		awayLabel.setText(newAwayName);
	}
	
	public void changeHomeTO(int newHomeTO) {
		homeTO += newHomeTO;
		hTOLabel.setText("Timeout: " + Integer.toString(homeTO));
	}
	
	public void changeAwayTO(int newAwayTO) {
		awayTO += newAwayTO;
		aTOLabel.setText("Timeout: " + Integer.toString(awayTO));
	}

	public void changeHomeFoul(int newHomeFoul) {
		homeFouls += newHomeFoul;
		hFoulsLabel.setText("Fouls: " + Integer.toString(homeFouls));
	}

	public void changeAwayFoul(int newAwayFoul) {
		awayFouls += newAwayFoul;
		aFoulsLabel.setText("Fouls: " + Integer.toString(awayFouls));
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}
}