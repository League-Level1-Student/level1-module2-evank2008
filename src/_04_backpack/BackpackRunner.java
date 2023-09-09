package _04_backpack;

public class BackpackRunner {
	public static void main(String[] args) {
		Pencil penc = new Pencil();
		Ruler rul = new Ruler();
		Textbook txt = new Textbook();
		Backpack backpack = new Backpack();
		backpack.putInBackpack(penc);
		backpack.putInBackpack(rul);
		backpack.putInBackpack(txt);
		backpack.packAndCheck();
	}
}
