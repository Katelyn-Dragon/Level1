package LeagueInvaders;
import java.awt.Graphics;
import java.awt.Rectangle;

public class GameObject {

	int x;
	int y;
	int width;
	int height;
	boolean isAlive = true;
	int speedx = 0;
	int speedy = 0;
	Rectangle collisionBox;
	
	public GameObject(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		collisionBox = new Rectangle(x,y,width,height);
	}
	
	public void update(){
		x = x + speedx;
		y = y + speedy;
		collisionBox.setBounds(x, y, width, height);
	}
	
	public void draw(Graphics g) {
		
	}

}
