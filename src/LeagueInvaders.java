import java.awt.Dimension;

import javax.swing.JFrame;

public class LeagueInvaders {
public static void main(String[] args) {
	LeagueInvaders LI = new LeagueInvaders();
	LI.setup();
}

JFrame gameFrame;
final int width = 500;
final int height = 800;
GamePanel gamePanel;

public LeagueInvaders() {
	gameFrame = new JFrame();
	gamePanel = new GamePanel();
}

public void setup() {
	gameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	gameFrame.add(gamePanel);
	gameFrame.setVisible(true);
	gameFrame.getContentPane().setPreferredSize(new Dimension(width, height));
	gameFrame.pack();
	gamePanel.startGame();
	gameFrame.addKeyListener(gamePanel);
}
}