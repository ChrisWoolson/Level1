import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;
// figure out how to draw th buttons again after the user gets it correct
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class WhackAMole implements ActionListener {
	JButton mole;
	int score = 1;
	int wrong = 0;
	JPanel panel;
	JFrame frame = new JFrame();
	// JPanel panel = new JPanel();
	// int r = new Random().nextInt(24);
	int r;
	Date date = new Date();

	public void start(String[] args) {
		frame = new JFrame();
		panel = new JPanel();

		frame.setVisible(true);
		frame.setSize(500, 200);

		drawButtons(panel, r);

	}

	public void drawButtons(JPanel panel, int r) {
		frame = new JFrame();
		panel = new JPanel();

		frame.setVisible(true);
		frame.setSize(500, 200);
		panel = new JPanel();

		frame.add(panel);

		for (int i = 0; i < 24; i++) {
			JButton m = new JButton();
			panel.add(m);
			m.addActionListener(this);

			if (i == r) {
				mole = m;
				mole.setText("mole!");

			}

		}

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton buttonPressed = (JButton) e.getSource();

		if (buttonPressed.equals(mole)) {
			System.out.println("Working, " + score);
			score++;
			if (score == 10) {
				endGame(date, 10);
			}
			
			destroy();
		}

		else {
			wrong++;
			if (wrong == 1) {
				speak("dork");
			} else if (wrong == 2) {
				speak("idiot");
			} else if (wrong == 3) {
				speak("moron");
			}

			else if (wrong >= 4) {
				speak("you are a complete waste of atoms!");
			}

			//if (score == 10) {
			//	endGame(date, 10);
			

		}
	}

	void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void destroy() {
		frame.dispose();
		Random();

		drawButtons(panel, r);

	}

	public void Random() {
		r = new Random().nextInt(24);
	}

	private void endGame(Date timeAtStart, int molesWhacked) {
		Date timeAtEnd = new Date();
		JOptionPane.showMessageDialog(null, "Your whack rate is "
				+ ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked) + " moles per second.");
	}

}
