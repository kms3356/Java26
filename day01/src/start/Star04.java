package start;

import java.util.Scanner;

public class Star04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 입력");
		int num = sc.nextInt();
		for (int i = 0; i < num; i++) {
			System.out.println(" ".repeat(i) + "*".repeat(num-i));
		}
	}
}
