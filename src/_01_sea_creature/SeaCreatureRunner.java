package _01_sea_creature;

public class SeaCreatureRunner {
public static void main(String[] args) {
	SeaCreature spongeBob = new SeaCreature("spongebob");
	System.out.println(spongeBob.getName());
	spongeBob.laugh();
	spongeBob.eat();
}
}
