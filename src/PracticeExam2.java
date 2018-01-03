
public class PracticeExam2 {
	
	public static void main(String[] args) {
		Student s = new Student();
		Animal a = new Animal(false, 0);
	
		System.out.println(a.numLegs);
	}

	

}
class Student {
	public Student() {
	}
}

class Animal
{

	boolean hasFur;
	int numLegs;

	Animal(boolean furry, int legs){
		hasFur = furry;
		numLegs = legs;
	}

 int getLegs(){
	return numLegs;
}

boolean getfur() {
	return hasFur;
}

void setleg(int legs){

numLegs = legs;


}
 void setfur(boolean fur) {
	 
hasFur = fur;
 }

 
 
 
 
 
 
}
