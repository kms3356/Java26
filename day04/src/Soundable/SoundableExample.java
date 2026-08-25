package Soundable;

public class SoundableExample {
	
	public static void printSound(Soundable sd) {
		System.out.println(sd.sound());
	}
	public static void main(String[] args) {
		printSound(new Cat());
		printSound(new Dog());

	}

}
