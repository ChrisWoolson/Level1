import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.applet.AudioClip;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TootMachine {
	JFrame frame;
	JPanel panel;
	JButton button1;
	JButton button3;
	JButton button2;

	public  void start(String[] args) {
		gui();
	}

	public void gui() {

		Dimension d = new Dimension(100, 100);

		frame = new JFrame();
		panel = new JPanel();
		frame.setVisible(true);
		frame.setSize(300, 250);

		frame.setTitle("Toot Machine");
		frame.add(panel);

		button1 = new JButton();
		button1.setPreferredSize(d);
		button1.setBackground(Color.CYAN);
		button1.setOpaque(true);

		button1.setText("Bean Fart");
		panel.add(button1);

		button1.addActionListener(new Buttonlistener("bean.wav"));

		button2 = new JButton();
		button2.setPreferredSize(d);
		button2.setBackground(Color.GREEN);
		button2.setOpaque(true);

		button2.setText("Fart Squeeze");
		panel.add(button2);

		button2.addActionListener(new Buttonlistener("Squeeze.wav"));

		button3 = new JButton();
		button3.setPreferredSize(d);

		button3.setBackground(Color.orange);
		button3.setOpaque(true);

		button3.setText("Common Fart");
		panel.add(button3);

		button3.addActionListener(new Buttonlistener("Common.wav"));

	}

	

	private void playSound(String fileName) {
		AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
		sound.play();

	}

	class Buttonlistener implements ActionListener {
		String filename;
		public Buttonlistener(String filenameinput) {
			filename = filenameinput;
		}

		@Override
		public void actionPerformed(ActionEvent e) {
	playSound(filename);
		

		}

	}
}
