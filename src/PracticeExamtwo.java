import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PracticeExamtwo implements ActionListener, MouseMotionListener{
	JPanel panel = new JPanel();
	JButton button = new JButton();
	JFrame frame = new JFrame();

	
	
	public static void main(String[] args) {
		PracticeExamtwo prac = new PracticeExamtwo();

System.out.println(average(5, 7));
	System.out.println(squareNum(2));
	annoy("hi");
	Smurf smurf = new Smurf(true);
	smurf.setName("smurfy");
	System.out.println(smurf.name);
	}

	public void actionPerformed(ActionEvent e) {
		JButton buttonPressed = (JButton) e.getSource();
		if (button == buttonPressed) {
			System.out.println("button");
		}

	}

	PracticeExamtwo() {
		
		frame.setVisible(true);
		frame.add(panel);
		panel.add(button);
		frame.pack();
		button.addActionListener(this);
	frame.addMouseMotionListener(this);
	
	
	
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("drag");
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("moved");
	}

static int average(int one, int two) {
	return (one+two) / 2;
}
	
	static int squareNum(int value) {
		return value*value;
	}
	
	static void annoy(String s) {
	System.out.println(s+" " +s+" "+ s);
	}
	
	
	
	
	
	
	
	

	
	
	
	
	
	
	
}

