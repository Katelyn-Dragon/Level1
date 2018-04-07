import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Test implements ActionListener {
public static void main(String[] args) {
	Test myTest = new Test();
	myTest.run();
}

JFrame frame = new JFrame();
JPanel panel = new JPanel();
JPanel mainPanel = new JPanel();
JButton yellow = new JButton();
JButton red = new JButton();
JButton blue = new JButton();
JButton green = new JButton();

public void run(){
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setSize(300, 300);
	frame.setVisible(true);
	frame.setTitle("Color Buttons");
	frame.pack();
	
	yellow.setText("Yellow");
	red.setText("Red");
	blue.setText("Blue");
	green.setText("Green");
	
	yellow.addActionListener(this);
	red.addActionListener(this);
	blue.addActionListener(this);
	green.addActionListener(this);
	
	yellow.setBackground(Color.YELLOW);
	red.setBackground(Color.RED);
	blue.setBackground(Color.BLUE);
	green.setBackground(Color.GREEN);
	
	yellow.setOpaque(true);
	red.setOpaque(true);
	blue.setOpaque(true);
	green.setOpaque(true);
	
	panel.add(yellow);
	panel.add(red);
	panel.add(blue);
	panel.add(green);
	mainPanel.add(panel);
	frame.add(mainPanel);
	
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	e.getSource();

}
void speak(String words) {
	try {
		Runtime.getRuntime().exec("say" + words);
	}catch (IOException e) {
		e.printStackTrace();
	}

}
}
