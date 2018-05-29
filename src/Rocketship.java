import java.awt.Color;
import java.awt.Graphics;

public class Rocketship extends GameObject{

int speed = 5;

public Rocketship() {
	super(250, 700, 50, 50);
}

public void update() {
	
}

public void draw(Graphics g) {
	g.setColor(Color.CYAN);
	g.fillRect(250, 700, 50, 50);
}

}