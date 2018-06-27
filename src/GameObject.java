import java.awt.Graphics;

public class GameObject {

	int x;
	int y;
	int width;
	int height;
	boolean isAlive = true;
	int speedx = 0;
	int speedy = 0;
	
	public GameObject(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	
	public void update(){
		x = x + speedx;
		y = y + speedy;
	}
	
	public void draw(Graphics g) {
		
	}

}
