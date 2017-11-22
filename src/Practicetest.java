import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Practicetest {

	public static void main(String[] args) {
		Leg l = new Leg();
		
		Pants pants = new Pants(l);
		
	}
}

class Pants {
	Leg leftLeg;


Leg getleftleg(){
	return leftLeg;
}

void setleftleg(Leg l){
	leftLeg = l;
}
Pants(Leg l){
	leftLeg = l;
}

}

class Leg {

	
	
	
	
	
}
