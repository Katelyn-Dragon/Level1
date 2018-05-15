import javax.swing.JFrame;
import javax.swing.JPanel;

public class GUI {
	JFrame window;
	JPanel panel;
	void setup() {
		window = new JFrame();
		window.setVisible(true);
		window.setSize(500, 500);
		panel = new JPanel();
		window. add(panel);
	}
}
