import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Riddle {

	String answer;
	JButton submit = new JButton();
	JButton hint = new JButton();
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JTextField input = new JTextField(10);
	JLabel question = new JLabel();
String in;
	
	public void start(String[] args) {
		frame.add(panel);
		panel.add(hint);
		panel.add(submit);
		panel.add(input);
		panel.add(question);
		frame.setVisible(true);
		submit.addActionListener(new check());
		
submit.setText("submit");
		hint.setText("hint");
		
		question1("What runs around the whole yard without moving?", "a fence");
		frame.pack();
	}

	void question1(String a, String b) {
		question.setText(a);
		answer = b;
	}
	
	class check implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			String in = getString(input);
			if(in.equals(answer)) {
				question.setText("correct");
			}
		}
		
	}
static String getString (JTextField textField) {
		
		
		
		return textField.getText();
	
	
}
}
