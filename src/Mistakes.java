class Animal {
	int numLegs;
	 String name;
	
	Animal(int numLegs, String name) {
		this.numLegs = numLegs;
		this.name = name;
		checkLegs(3);
	}
	void checkLegs(int legs) {
		if(legs < 0) {
			System.out.println("That is not an animal.");
		}
		else if(legs == 0) {
			System.out.println("It must be a snake.");
		}
		else {
			System.out.println("I think it’s a mammal.");
		}
			
			
		}
	}




