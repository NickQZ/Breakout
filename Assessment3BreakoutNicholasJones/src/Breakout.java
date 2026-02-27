import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;

public class Breakout extends JFrame {
	
	static final long serialVersionUID = 1L;
	
	private BreakoutPanel panel;
	
	public Breakout() {
		// Set the size of the screen (use Settings.WINDOW_WIDTH/HEIGHT)
		// Set the size of the screen
		Dimension screenSize = new Dimension(Settings.WINDOW_WIDTH, Settings.WINDOW_HEIGHT);
		setSize(screenSize);

		// Set the title
		setTitle("BREAKOUT!");

		// Set the background color to white
		getContentPane().setBackground(Color.WHITE);

		// Set resizable to false
		setResizable(false);

		// Set default close operation
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		// Initialize and add BreakoutPanel to the frame
		panel = new BreakoutPanel(this);
		add(panel);

		// Set visible to true to display the frame
		setVisible(true);
	}

	public static void main(String[] args) {
		// Invoke the Breakout constructor on the event dispatch thread
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new Breakout();
			}
		});
	}
}
