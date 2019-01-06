package LeagueInvaders;
import java.awt.Color;
import java.awt.Graphics;



public class Aliens extends GameObject{

	public Aliens(int x, int y, int width, int height) {
		super(x, y, width, height);
	}
	
	public void update() {
		y++;
		super.update();
	}
	
	public void draw(Graphics g) {
		g.drawImage(GamePanel.alienImg, x, y, width, height, null);
	}
}
