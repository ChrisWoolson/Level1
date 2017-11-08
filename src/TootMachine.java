import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.applet.AudioClip;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TootMachine implements ActionListener{
	JFrame frame;
	JPanel panel;
	JButton button1;
	JButton button3;
	JButton button2;
	 
	
	public void start(String[] args) {
		gui();
	}

	public void gui() {
		
		Dimension d = new Dimension (100,100);
		
		
		
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
	
		button1.addActionListener(this);

		
		
		
		button2 = new JButton();
		button2.setPreferredSize(d);
button2.setBackground(Color.GREEN);
		button2.setOpaque(true);
		
		button2.setText("Fart Squeeze");
		panel.add(button2);
	
		button2.addActionListener(this);

		
		
		
		
		button3 = new JButton();
		button3.setPreferredSize(d);
		
		button3.setBackground(Color.orange);
		button3.setOpaque(true);
		
		button3.setText("Common Fart");
		panel.add(button3);
	
		button3.addActionListener(this);

	}



	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton buttonPressed = (JButton) e.getSource();
		if(buttonPressed.equals(button1)) {
			System.out.println("working");
		playSound("Bean.wav");
		
		}
		if(buttonPressed.equals(button2)) {
			System.out.println("working");
		playSound("Common.wav");
		
		}
		if(buttonPressed.equals(button3)) {
			System.out.println("working");
		playSound("Squeeze.wav");
		
		}
	
	}
	private void playSound(String fileName) {
		AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
		sound.play();
	
	
	
	}

	
}
