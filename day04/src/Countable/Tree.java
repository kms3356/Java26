package Countable;

public class Tree implements Countable{
	private String name;
	private int count;
	
	Tree(String name, int count) {
		this.name = name;
		this.count = count;
	}
	
	@Override
	public void count() {
		System.out.println(name + "가" + count + "그루 있다.");
	}
	public void fly() {
		System.out.println(count + "그루" + name + "에 열매가 잘 익었다.");
	}
}
