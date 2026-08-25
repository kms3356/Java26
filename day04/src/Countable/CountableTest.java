package Countable;

public class CountableTest {
	public static void main(String[] args) {
		Bird c = new Bird("뻐꾸기", 3);
		Tree d = new Tree("사과나무", 5);
		c.count();
		d.count();
		c.fly();
		d.fly();
	}
}
