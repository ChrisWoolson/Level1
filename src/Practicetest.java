import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Practicetest implements ActionListener {
static JFrame frame;
 
	
	public void test() {
		frame = new JFrame();
		JButton button = new JButton();
		
		button = new JButton();
		JPanel panel = new JPanel();
		frame.setVisible(true);
		frame.add(panel);
		panel.add(button);
		button.addActionListener(this);
		frame.pack();
		button.setText("pants");
		
	
}

	//public void actionListener() {
	
	//button.addActionListener(this);
	
	//}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("works");
	}









}
