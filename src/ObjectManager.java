import java.awt.Graphics;

public class ObjectManager {

Rocketship rocketship;
	
	public ObjectManager(Rocketship rocket) {
		rocketship  = rocket;
	}
	
	public void update() {
		rocketship.update();
	}
	
	public void draw(Graphics g) {
		rocketship.draw(g);
	}
	
}
