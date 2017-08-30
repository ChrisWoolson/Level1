
public class SeaCreatureRunner {
public static void main(String[] args) {
	SeaCreature sea = new SeaCreature("Spongebob");

SeaCreature sea1 = new SeaCreature("Patrick");

SeaCreature sea2 = new SeaCreature("Squidward");

sea.eat();
sea.laugh();


System.out.println(sea1.getName());
sea1.eat();
sea1.laugh();
System.out.println(sea2.getName());sea2.getName();
sea2.eat();
sea2.laugh();
}
}
