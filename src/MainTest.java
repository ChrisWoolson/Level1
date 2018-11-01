import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainTest implements ActionListener{

	JFrame frame = new JFrame();
	JPanel top = new JPanel();
	JPanel mid = new JPanel();
	JPanel bottom = new JPanel();
	JPanel mainP = new JPanel();
	JLabel title = new JLabel();
	JButton button = new JButton();

ArrayList <String> name = new ArrayList<String>();
ArrayList <String> ID = new ArrayList<String>();
ArrayList <Integer> inventory = new ArrayList<Integer>();


int collumns = 1;
JLabel named = new JLabel();
JLabel added = new JLabel();
JLabel total = new JLabel();



	public static void main(String[] args) {
MainTest test = new MainTest();
test.setup();
	}
	 
	public void setup() {
		frame.add(mainP);
		mainP.setLayout(new GridLayout(3,1));
		mainP.add(top);
		mainP.add(mid);
		mainP.add(bottom);
		
		top.add(button);
		top.setLayout(new GridLayout(1,2));
		top.add(title);
		title.setText("Inventory Sorter");
		top.add(button);
		button.setText("Click to add");
		
		mid.setLayout(new GridLayout(1, 3));
		mid.add(named);
		mid.add(added);
		mid.add(total);
		named.setText("Name");
		added.setText("Number Added");
		total.setText("Total");
		
		
		
		
		
		frame.setVisible(true);
		frame.setSize(500, 500);
	}

	
	
	public void buttonWasPressed() {
		
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
}
