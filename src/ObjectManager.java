import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.Timer;

public class ObjectManager {

Rocketship rocketship;
ArrayList <Projectile> projectiles;
ArrayList <Aliens> aliens;
long enemyTimer = 0;
int enemySpawnTime;

	public ObjectManager(Rocketship rocket) {
		rocketship  = rocket;
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
	
	public void manageEnemies(){
	        if(System.currentTimeMillis() - enemyTimer >= enemySpawnTime){
	                addAlien(new Aliens(new Random().nextInt(LeagueInvaders.width), 0, 50, 50));

	enemyTimer = System.currentTimeMillis();
	        }
	}
	
	public void purgeObjects() {
		for (int i = 0; i < projectiles.size(); i++) {
			if (projectiles.get(i).isAlive == false) {
				projectiles.remove(projectiles);
			}
		}
		for (int i = 0; i < aliens.size(); i++) {
			if (aliens.get(i).isAlive == false) {
				aliens.remove(aliens);
			}
		}
	}
	
	}

