import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SimpleCalculator {
	
	
	
	JFrame frame = new JFrame();
	JPanel mainPanel = new JPanel();
	JPanel inputPanel = new JPanel();
	JPanel buttonPanel = new JPanel();
	JPanel answerPanel = new JPanel();
	
	
	JButton square = new JButton();
	JButton clear = new JButton();
	JButton add = new JButton();
	JButton mult = new JButton();
	JButton div = new JButton();
	JButton sub = new JButton();
	JTextField variableA = new JTextField(10);
	JTextField variableB = new JTextField(10);
	JLabel answer = new JLabel();

	public void start() {
		frame.add(mainPanel);

		// adding components to panel
		inputPanel.add(variableA);
		inputPanel.add(variableB);
		buttonPanel.add(mult);
		buttonPanel.add(div);
		buttonPanel.add(sub);
		buttonPanel.add(add);
		answerPanel.add(answer);
		answerPanel.add(clear);
		buttonPanel.add(square);
		
		mainPanel.add(inputPanel);
		mainPanel.add(buttonPanel);
		mainPanel.add(answerPanel);

		frame.setVisible(true);
		
		// setting text
		mult.setText("mult");
		sub.setText("sub");
		div.setText("div");
		add.setText("add");
		clear.setText("clear");
		frame.setTitle("Simple Calculator");
		square.setText("square");
		//formatting
		answer.setFont(new Font("", Font.BOLD, 40));
		
	mainPanel.setLayout(new GridLayout(0, 1));
		
		
		
		
		
		
		// adding event listeners
		add.addActionListener(new AddListener());
		sub.addActionListener(new SubListener());
		mult.addActionListener(new MultListener());
		div.addActionListener(new DivListener());
clear.addActionListener(new ClearListener());
square.addActionListener(new SquareListener());
		frame.pack();

		
		
	}

	static int getInt (JTextField textField) {
		
		
		
		return Integer.parseInt(textField.getText());
		
		
	}
	
	public class AddListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			
			int solution = getInt(variableA) + getInt(variableB);
			answer.setText(Integer.toString(solution));
			frame.pack();
		}

	}

	public class MultListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			
			int solution = 	 getInt(variableA) * getInt(variableB);
			answer.setText(Integer.toString(solution));
			frame.pack();
		}

	}

	public class SubListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			int solution = getInt(variableA) - getInt(variableB);
			answer.setText(Integer.toString(solution));
			frame.pack();
		}

	}

	public class DivListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			int solution = getInt(variableA) / getInt(variableB);
			answer.setText(Integer.toString(solution));
			frame.pack();
		}

	}

	public class ClearListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			answer.setText("0");
			variableA.setText("");
			variableB.setText("");
		
		}
		
	}
	
	public class SquareListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			int solution = getInt(variableA) * getInt(variableA);
			answer.setText(Integer.toString(solution));
		}
		
	}
	
	
}
