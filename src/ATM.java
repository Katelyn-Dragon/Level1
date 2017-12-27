import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;

public class ATM implements ActionListener {
	public static void main(String[] args) {
		ATM myATM = new ATM();
		myATM.run();

	}

	JTextField text = new JTextField(15);
	JTextField text2 = new JTextField(15);
	JTextField text3 = new JTextField(15);
	JTextField text4 = new JTextField(15);
	JTextPane pane = new JTextPane();
	JLabel label = new JLabel();
	JPanel withdrawPanel = new JPanel();
	JButton button = new JButton();
	JButton button2 = new JButton();
	JPanel mainPanel = new JPanel();
	JPanel depositPanel = new JPanel();
	JPanel balancePanel = new JPanel();
	double balance = 100;

	public void run() {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 300);
		frame.setVisible(true);
		frame.setTitle("ATM");
		button.setText("Deposit");
		button2.setText("Withdraw");
		button.addActionListener(this);
		button2.addActionListener(this);
		frame.add(mainPanel);
		mainPanel.add(label);
		label.setText("");
		mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
		depositPanel.add(button);
		depositPanel.add(text);
		mainPanel.add(depositPanel);
		withdrawPanel.add(button2);
		withdrawPanel.add(text2);
		mainPanel.add(withdrawPanel);
		balancePanel.add(text3);
		mainPanel.add(balancePanel);
		frame.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton buttonPressed = (JButton) e.getSource();
		if (button.equals(buttonPressed)) {
			System.out.println("Deposit");
			double add = Double.parseDouble(text.getText());
			balance = balance + add;
			System.out.println("$" + balance);
		} else {
			System.out.println("Withdraw");
			double add = Double.parseDouble(text2.getText());
			balance = balance - add;
			System.out.println("$" + balance);
		}
	}
}
