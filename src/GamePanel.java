import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.Timer;
import javax.swing.JPanel;

public class GamePanel extends JPanel implements ActionListener, KeyListener {
	Timer timer;
	Font titleFont;
	Font optionFont;
	Font startFont;
	Font gameOver;
	Rocketship rocketship;
	ObjectManager objectManager;

	final int MENU_STATE = 0;
	final int GAME_STATE = 1;
	final int END_STATE = 2;
	int currentState = MENU_STATE;

	// test2

	public GamePanel() {
		timer = new Timer(1000 / 60, this);
		titleFont = new Font("Arial", Font.PLAIN, 48);
		optionFont = new Font("Arial", Font.PLAIN, 24);
		startFont = new Font("Arial", Font.PLAIN, 24);
		gameOver = new Font("Arial", Font.PLAIN, 48);
		rocketship = new Rocketship(250,700,50,50);
		objectManager = new ObjectManager(rocketship); 
	}

	public void startGame() {
		timer.start();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		if (currentState == MENU_STATE) {
			updateMenuState();
		} else if (currentState == GAME_STATE) {
			updateGameState();
		} else if (currentState == END_STATE) {
			updateEndState();
		}
		repaint();
	}

	@Override
	public void paintComponent(Graphics g) {

		if (currentState == MENU_STATE) {
			drawMenuState(g);
		} else if (currentState == GAME_STATE) {
			drawGameState(g);
		} else if (currentState == END_STATE) {
			drawEndState(g);
		}
		repaint();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		//System.out.println("pressed");
		if (e.getKeyCode() == KeyEvent.VK_ENTER) {
			if (currentState == END_STATE) {
				currentState = MENU_STATE;
			} else if (currentState == MENU_STATE) {
				currentState = GAME_STATE;
			} else if (currentState == GAME_STATE) {
				currentState = END_STATE;
			}

		}
		if (e.getKeyCode() == KeyEvent.VK_UP) {
			rocketship.speedy = - 5;
		} else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			rocketship.speedy =  + 5;
		} else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			rocketship.speedx =  - 5;
		} else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			rocketship.speedx = + 5;
		}
		
		if (e.getKeyCode() == KeyEvent.VK_SPACE) {
			 objectManager.addProjectile(new Projectile(rocketship.x + 20, rocketship.y, 10, 10));
		}

		repaint();
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		//System.out.println("released");
		rocketship.speedx = 0;
		rocketship.speedy = 0;
	}

	public void updateMenuState() {

	}

	public void updateGameState() {
		objectManager.update();
		objectManager.manageEnemies();
		objectManager.checkCollision();
		objectManager.purgeObjects();
		if (rocketship.isAlive == false) {
			currentState = END_STATE;
		}
	}

	public void updateEndState() {

	}

	public void drawMenuState(Graphics g) {
		g.setColor(Color.CYAN);
		g.fillRect(0, 0, 500, 800);
		g.setFont(titleFont);
		g.setColor(Color.GRAY);
		g.drawString("LEAGUE INVADERS", 20, 200);
		g.setFont(startFont);
		g.drawString("Press ENTER To Start", 110, 300);
		g.setFont(optionFont);
		g.drawString("Press SPACE For Instructions", 80, 400);

	}

	public void drawGameState(Graphics g) {
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, 500, 800);
		objectManager.draw(g);
	}

	public void drawEndState(Graphics g) {
		g.setColor(Color.RED);
		g.fillRect(0, 0, 500, 800);
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, 500, 800);
		g.setFont(gameOver);
		g.setColor(Color.GRAY);
		g.drawString("GAME OVER", 100, 200);
	}

}
