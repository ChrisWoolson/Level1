import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ButtonListeners implements ActionListener {
public static void main(String[] args) {
new ButtonListeners();
	
}

public ButtonListeners() {
	System.out.println("constructor");
	JFrame frame = new JFrame();
	JButton button = new JButton("button");
frame.add(button);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setVisible(true);
frame.pack();

button.addActionListener(this);
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
System.out.println("button clicked");	
}


}
