import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.Timer;
import javax.swing.JPanel;

public class GamePanel extends JPanel implements ActionListener, KeyListener{
Timer timer;
Font titleFont;

final int MENU_STATE = 0;
final int GAME_STATE = 1;
final int END_STATE = 2;
int currentState = MENU_STATE;

//test2


public GamePanel() {
	timer = new Timer(1000/60, this);
	titleFont = new Font("Arial", Font.PLAIN, 48);
}

public void startGame() {
	timer.start();
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	repaint();
	
	if (currentState == MENU_STATE) {
		updateMenuState();
	}else if (currentState == GAME_STATE) {
		updateGameState();
	}else if (currentState == END_STATE) {
		updateEndState();
	}
	
}

@Override
public void paintComponent(Graphics g) {
	
	if (currentState == MENU_STATE) {
		drawMenuState(g);
	}else if (currentState == GAME_STATE) {
		drawGameState(g);
	}else if (currentState == END_STATE) {
		drawEndState(g);
	}
}

@Override
public void keyTyped(KeyEvent e) {
	// TODO Auto-generated method stub
	System.out.println("typed");
}

@Override
public void keyPressed(KeyEvent e) {
	// TODO Auto-generated method stub
	System.out.println("pressed");
	
	if (currentState == END_STATE) {
		currentState = MENU_STATE;
	}else if (currentState == MENU_STATE) {
		currentState = END_STATE;
	}
}

@Override
public void keyReleased(KeyEvent e) {
	// TODO Auto-generated method stub
	System.out.println("released");
}

public void updateMenuState() {
	
}

public void updateGameState() {
	
}

public void updateEndState() {
	
}

public void drawMenuState(Graphics g) {
	g.setColor(Color.BLUE);
	g.fillRect(0, 0, 500, 800);
	g.setFont(titleFont);
	g.drawString("text", 10, 10);
	
}

public void drawGameState(Graphics g) {
	
}

public void drawEndState(Graphics g) {
	g.setColor(Color.RED);
	g.fillRect(0, 0, 500, 800);
	g.setColor(Color.BLACK);
	g.fillRect(0, 0, 500, 800);
}

}
