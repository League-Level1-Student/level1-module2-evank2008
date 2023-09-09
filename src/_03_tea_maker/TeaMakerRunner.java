package _03_tea_maker;

public class TeaMakerRunner {
public static void main(String[] args) {
	TeaBag tea = new TeaBag("chocolit");
	Kettle ketamine = new Kettle();
	ketamine.boil();
	Cup syphillis = new Cup();
	
	syphillis.makeTea(tea, ketamine.getWater());
}
}
