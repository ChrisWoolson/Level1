
public class Level1review {
	int n1;
	int n2;
	static int big;
	
	public static void main(String[] args) {
		Ninja ninja = new Ninja(5, "badguy");
		Bulldozer bull = new Bulldozer(50);
		Building building = new Building("tower", 10, 100, true);

		which(2, 100);
		System.out.println(big);
	}

	Level1review() {

	}
	
	static void which(int n1, int n2) {
		if(n1>n2) {
			big = n1;
		}
		
		else {
			big = n2;
		}
		
	}
	
	
}

class Bulldozer {
	int horsepower;

	Bulldozer(int horsepower) {
		this.horsepower = horsepower;

	}

}

class Ninja {
	int numberOfThrowingStars;
	String nameOfTarget;

	Ninja(int numberOfThrowingStars, String nameOfTarget) {
		this.nameOfTarget = nameOfTarget;
		this.numberOfThrowingStars = numberOfThrowingStars;
	}
}

class Building {
	String name;
	int numberOfStories;
	float height;
	boolean hasElevator;

	Building(String name, int numberOfStories, float height, boolean hasElevator) {
		this.name = name;
		this.hasElevator = hasElevator;
		this.height = height;
		this.numberOfStories = numberOfStories;
	}
}