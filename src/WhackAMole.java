import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class WhackAMole implements ActionListener {
	JButton mole;

	public void start(String[] args) {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		frame.add(panel);
		frame.setVisible(true);
		frame.setSize(500, 200);
		int r = new Random().nextInt(24);
		
		drawButtons(panel, r);

	}

	public void drawButtons(JPanel panel, int r) {
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
System.out.println("Working");
		}
		else{
		speak("dork");
	}
	
	
	}

	void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
