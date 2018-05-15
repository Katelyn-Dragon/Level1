import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

//7. Hover over underline, choose "add unimplemented methods"                                                  
public class SwingListenerExample implements ActionListener {
	public static void main(String[] args) {
		// 2. Start run() method from main
		SwingListenerExample example = new SwingListenerExample();
		example.run();
	}
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton buttonOne = new JButton("1");
	JButton buttonTwo = new JButton("2");
	// 1. Make a run method(this will have most of the code making our GUI)
	public void run() {
		// 3. Make GUI components
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 4. Add the visible, set visible, and pack
		frame.add(panel);
		panel.add(buttonOne);
		panel.add(buttonTwo);
		frame.pack();
		frame.setVisible(true);
		// 5. Add action listener
		buttonOne.addActionListener(this);// 6. Hover over red underline. choose implement option
		buttonTwo.addActionListener(this);
	}

	// this method runs whenever an event is detected
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		// 8. Figure out which component triggered the event
		JButton buttonPressed = (JButton) e.getSource();
		if (buttonPressed == buttonOne) {
			System.out.println("Button one pressed");
		} else if (buttonPressed == buttonTwo) {
			System.out.println("Button two pressed");
		}
	}
}
