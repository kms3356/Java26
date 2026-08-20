package start;

import java.util.Scanner;
public class Switch01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int num = sc.nextInt();

		switch (num & 1) {
			case 1:
				System.out.println("홀수입니다.");
				break;
			case 0:
				System.out.println("짝수입니다.");
		}
	}
}
