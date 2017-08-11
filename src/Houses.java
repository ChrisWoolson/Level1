import org.jointheleague.graphical.robot.Robot;

public class Houses {
	static Robot chris = new Robot();

	public static void main(String[] args) {

		chris.setSpeed(10);
		chris.moveTo(40, 550);
		chris.penDown();
		pointyroof("Small", 50, 200, 30);
		pointyroof("Medium", 100, 0, 98);
		drawhouse("Large", 250, 50, 0);
		pointyroof("Medium", 15, 50, 255);
		pointyroof("Small", 150, 230, 0);
		drawhouse("Large", 200, 255, 0);
		pointyroof("Small", 120, 20, 10);
		pointyroof("Medium", 50, 90, 255);
		drawhouse("Large", 90, 180, 0);
		pointyroof("Medium", 300, 255, 0);
	}

	static void drawhouse(String height, int color1, int color2, int color3) {
		int size = 0;

		if (height.equals("Small")) {
			size = 60;
		}

		if (height.equals("Medium")) {
			size = 120;

		}

		if (height.equals("Large")) {

			size = 250;

		}
		chris.setPenWidth(4);
		chris.setPenColor(color1, color2, color3);
		chris.move(size);
		chris.turn(90);
		chris.move(25);

		chris.turn(90);
		chris.move(size);
		chris.turn(-90);
		chris.setPenColor(90, 150, 90);
		chris.move(30);
		chris.turn(-90);

	}

	static void pointyroof(String height, int color1, int color2, int color3) {
		int size = 0;

		if (height.equals("Small")) {
			size = 60;
		}

		if (height.equals("Medium")) {
			size = 120;

		}

		if (height.equals("Large")) {

			size = 250;

		}
		chris.setPenWidth(4);
		chris.setPenColor(color1, color2, color3);
		chris.move(size);
		chris.turn(45);
		chris.move(25);
		chris.turn(90);

		chris.move(25);
		chris.turn(45);
		chris.move(size);
		chris.turn(-90);
		chris.setPenColor(90, 150, 90);
		chris.move(30);
		chris.turn(-90);

	}
}
