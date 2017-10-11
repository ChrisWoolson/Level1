import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Chuckle implements ActionListener {
	JButton joke;
	JButton punchline;

	public void makeButtons() {
		System.out.println("working...");
		JFrame frame = new JFrame();

		JPanel panel = new JPanel();
		joke = new JButton();
		punchline = new JButton();
		joke.setText("joke");
		punchline.setText("punchline");
		frame.add(panel);
		
		panel.add(joke);
		panel.add(punchline);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();

		frame.setVisible(true);

		joke.addActionListener(this);
		punchline.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton buttonPressed = (JButton) e.getSource();
		
		
		
		if (buttonPressed.equals(joke)) {
			JOptionPane.showMessageDialog(null, "why did the chicken cross the road");
		}

		if (buttonPressed.equals(punchline)) {
			JOptionPane.showMessageDialog(null, "to get to the other side");
		}

	}


		
		
	}






