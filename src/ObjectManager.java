import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.Timer;

public class ObjectManager {

	Rocketship rocketship;
	ArrayList<Projectile> projectiles;
	ArrayList<Aliens> aliens;
	long enemyTimer = 0;
	int enemySpawnTime = 1000;
	int score = 0;

	public ObjectManager(Rocketship rocket) {
		rocketship = rocket;
		projectiles = new ArrayList<Projectile>();
		aliens = new ArrayList<Aliens>();
	}

	public void update() {
		rocketship.update();
		for (int i = 0; i < projectiles.size(); i++) {
			projectiles.get(i).update();
		}
		for (int i = 0; i < aliens.size(); i++) {
			aliens.get(i).update();
		}

	}

	public void draw(Graphics g) {
		rocketship.draw(g);
		for (int i = 0; i < projectiles.size(); i++) {
			projectiles.get(i).draw(g);
		}
		for (int i = 0; i < aliens.size(); i++) {
			aliens.get(i).draw(g);
		}
	}

	public void addProjectile(Projectile p) {
		projectiles.add(p);
	}

	public void addAlien(Aliens a) {
		aliens.add(a);
	}

	public void manageEnemies() {
		if (System.currentTimeMillis() - enemyTimer >= enemySpawnTime) {
			addAlien(new Aliens(new Random().nextInt(LeagueInvaders.width), 0, 50, 50));

			enemyTimer = System.currentTimeMillis();
		}
	}

	public void purgeObjects() {
		for (int i = 0; i < projectiles.size(); i++) {
			if (projectiles.get(i).isAlive == false) {
				projectiles.remove(i);
			}
		}
		for (int i = 0; i < aliens.size(); i++) {
			if (aliens.get(i).isAlive == false) {
				aliens.remove(i);
			}
		}
	}

	public void checkCollision() {
		for (Aliens a : aliens) {

			if (rocketship.collisionBox.intersects(a.collisionBox)) {

				rocketship.isAlive = false;
				System.out.println("rocket is dead");
			}

			for (Projectile p : projectiles) {
				if (a.collisionBox.intersects(p.collisionBox)) {
					a.isAlive = false;
					System.out.println("alien is dead");
				}
			}

		}

	}
	
	public int getScore() {
		return score;
	}

}
