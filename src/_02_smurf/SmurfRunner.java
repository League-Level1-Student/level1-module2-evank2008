package _02_smurf;

public class SmurfRunner {
public static void main(String[] args) {
	Smurf hand = new Smurf("Handy");
	Smurf pap = new Smurf("Papa");
	Smurf et = new Smurf("Smurfet");
	
	System.out.println(hand.getName());
	hand.eat();
	System.out.println(" Handy is a "+hand.isGirlOrBoy());
	System.out.println(pap.getName());
	pap.eat();
	System.out.println("papa is a "+pap.isGirlOrBoy());
	System.out.println(et.getName());
	et.eat();
	System.out.println("smurfet is a "+et.isGirlOrBoy());
}
}
