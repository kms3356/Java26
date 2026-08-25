package interfacetest;

public class TestInterface {

	public static void main(String[] args) {
		System.out.println(">>>> 말");
		Horse h = new Horse("당근");
		printDayLife(h);

	}
	static void printDayLife(Animal a) {
		a.eat();
		a.move();
		a.sleep();
	}

}
