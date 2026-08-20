package start;

import java.util.Scanner;

public class Star06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 입력");
		int num = sc.nextInt();
		for (int i = num; i > 0; i--) {
			System.out.println(" ".repeat(num-i) + "*".repeat(2 * i - 1));
		}
	}
}
