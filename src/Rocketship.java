import java.awt.Color;
import java.awt.Graphics;

public class Rocketship extends GameObject{

int speed = 5;

public Rocketship(int x, int y, int width, int height) {
	super(x, y, width, height);
}

public void update() {
	super.update();
}

public void draw(Graphics g) {
	g.setColor(Color.CYAN);
	g.fillRect(x, y, width, height);
}

}