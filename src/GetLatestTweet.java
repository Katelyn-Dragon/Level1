import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;

import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Twitter;
import twitter4j.TwitterFactory;
import twitter4j.auth.AccessToken;

public class GetLatestTweet implements ActionListener {
	public static void main(String[] args) {
		new GetLatestTweet();
	}
	JTextField text = new JTextField(15);
	JTextPane pane = new JTextPane();
	public GetLatestTweet() {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 300);
		frame.setVisible(true);
		frame.setTitle("Twitter");
		JPanel panel = new JPanel();
		JPanel panel2 = new JPanel();
		JButton button = new JButton();
		button.setText("Get Tweet");
		pane.setPreferredSize(new Dimension(200, 170));
		panel.add(text);
		panel.add(button);
		panel2.add(pane);
		pane.setBackground (new Color(153, 238, 221));
		button.setOpaque(true);
		button.setBackground(new Color(153,85,153));
		frame.add(panel2, BorderLayout.SOUTH);
		frame.add(panel, BorderLayout.CENTER);
		frame.pack();
		button.addActionListener(this);
	}

	private String getLatestTweet(String searchingFor) {

		Twitter twitter = new TwitterFactory().getInstance();
		AccessToken accessToken = new AccessToken("2453751158-IVD2VGZsvwZiRKxNe3Gs2lMjg30nvSkV1xSuPFf",
				"vBa5PjKfuMTK1LLBG51nCUI9r5d6Ph5cAHrS73spg6Nvu");
		twitter.setOAuthConsumer("YqeZdD2hYxOKv4QOkmp0i2djN", "6XUB1r8KXBvd8Pk9HHW3NgphMxHvHWBLAr5TihnckMU0ttyGST");
		twitter.setOAuthAccessToken(accessToken);

		Query query = new Query(searchingFor);
		try {
			QueryResult result = twitter.search(query);
			return result.getTweets().get(0).getText();
		} catch (Exception e) {
			System.err.print(e.getMessage());
			return "What the heck is that?";
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String t = getLatestTweet(text.getText());
		pane.setText(t);
	}
}