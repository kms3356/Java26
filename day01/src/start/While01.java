package start;

import java.util.Scanner;
public class While01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int n;
		while(true) {
			System.out.print("숫자를 입력하세요 : ");
			n = sc.nextInt();
			if (n == 0) {
				break;
			}
			sum += n;
		}
		System.out.println("지금까지 입력한 숫자의 합은 " + sum + "입니다.");
	}
}
