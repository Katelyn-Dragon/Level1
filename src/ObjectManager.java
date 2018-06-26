import java.awt.Graphics;
import java.util.ArrayList;

public class ObjectManager {

Rocketship rocketship;
ArrayList <Projectile> projectiles;

	public ObjectManager(Rocketship rocket) {
		rocketship  = rocket;
		 projectiles = new ArrayList<Projectile>();
	}
	
	public void update() {
		rocketship.update();
		for (int i = 0; i < projectiles.size(); i++) {
			projectiles.get(i).update();
		}
		
	}
	
	public void draw(Graphics g) {
		rocketship.draw(g);
		for (int i = 0; i < projectiles.size(); i++) {
			projectiles.get(i).draw(g);
		}
	}
	
	public void addProjectile(Projectile p) {
		projectiles.add(p);
	}
	
}
