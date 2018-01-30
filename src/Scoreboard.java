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
	int homeTO = 5;
	int awayTO = 0;

	public void run() {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 300);
		frame.setVisible(true);
		
		homeLabel.setText("Home");
		awayLabel.setText("Away");

		hScoreLabel.setText(Integer.toString(homeScore));
		aScoreLabel.setText(Integer.toString(awayScore));
		hFoulsLabel.setText(Integer.toString(homeFouls));
		aFoulsLabel.setText(Integer.toString(awayFouls));
		hTOLabel.setText(Integer.toString(homeTO));
		aTOLabel.setText(Integer.toString(awayTO));
		
		frame.setTitle("Scoreboard");

		mainPanel.add(panel);
		mainPanel.add(panel2);
		
		frame.setLayout(new BorderLayout());
		frame.add(mainPanel);

		panel.setLayout(new BorderLayout());
		panel.add(homeLabel, BorderLayout.NORTH);
		panel.add(hScoreLabel, BorderLayout.SOUTH);
		panel.add(hFoulsLabel, BorderLayout.CENTER);
		panel.add(hTOLabel, BorderLayout.SOUTH);
		
		panel2.setLayout(new BorderLayout());
		panel2.add(awayLabel, BorderLayout.NORTH);
		panel2.add(aScoreLabel, BorderLayout.SOUTH);
		panel2.add(aFoulsLabel, BorderLayout.CENTER);
		
		frame.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}
}