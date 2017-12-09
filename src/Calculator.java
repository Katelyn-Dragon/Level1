import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;

public class Calculator implements ActionListener {
public static void main(String[] args) {
	Calculator cal = new Calculator();
}
	JTextField text = new JTextField(15);
	JTextField text2 = new JTextField(15);
	JTextPane pane = new JTextPane();
	JLabel label = new JLabel();
	
	public Calculator() {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300,300);
		frame.setVisible(true);
		frame.setTitle("Simple Calculator");
		JPanel panel = new JPanel();
		JButton button = new JButton();
		JButton button2 = new JButton();
		JButton button3 = new JButton();
		JButton button4 = new JButton();
		button.setText("Addition");
		button2.setText("Subtraction");
		button3.setText("Multiplication");
		button4.setText("Division");
		panel.add(text);
		panel.add(text2);
		panel.add(button);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		button.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
		frame.add(panel);
		panel.add(label);
		label.setText("");
		frame.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
	}
