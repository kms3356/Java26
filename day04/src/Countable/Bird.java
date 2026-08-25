package Countable;

public class Bird implements Countable{
	private String name;
	private int count;
	
	Bird(String name, int count) {
		this.name = name;
		this.count = count;
	}
	
	@Override
	public void count() {
		System.out.println(name + "가" + count + "마리 있다.");
	}
	public void fly() {
		System.out.println(count + "마리" + name + "이 날아간다.");
	}

}
