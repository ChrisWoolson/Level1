import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class duelingButtons implements ActionListener {
 JFrame frame = new JFrame();
JPanel panel = new JPanel();
JButton b1 = new JButton();
 JButton b2 = new JButton();
	
	
	public static void main(String[] args) {
		duelingButtons b = new duelingButtons();
		b.createUI();
	}
	
	  void createUI() {
		frame.add(panel);
		panel.add(b1);
		panel.add(b2);
		frame.setVisible(true);
frame.setSize(500, 400);
b1.setText("1");	
b2.setText("2");
b1.addActionListener(this);
b2.addActionListener(this);



	 }

	  void press() {
		  System.out.println("one");
	  }
	  
	  
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton buttonpressed = (JButton) e.getSource();
		if(buttonpressed == b1) {
			System.out.println("one");
		}
		if(buttonpressed== b2) {
			System.out.println("two");
		}
		
	}

	
	
	
}
