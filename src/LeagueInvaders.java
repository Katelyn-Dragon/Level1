import javax.swing.JFrame;

public class LeagueInvaders {
public static void main(String[] args) {
	LeagueInvaders LI = new LeagueInvaders();
	LI.setup();
}

JFrame gameFrame;
final int width = 500;
final int height = 800;

public LeagueInvaders() {
	gameFrame = new JFrame();
}

public void setup() {
	gameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}

}
