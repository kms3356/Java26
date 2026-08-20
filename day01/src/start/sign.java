package start;

import java.util.Scanner;

public class sign {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요 : ");
		int num = sc.nextInt();
		if (num > 0) {
			System.out.println("양수");
		} else if (num == 0) {
			System.out.println(0);
		} else {
			System.out.println("음수");
		}
	}
}
