package start;

import java.util.Scanner;

public class Max {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("세개의 숫자를 입력하세요 : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int max = a;
		if (max < b) {
			max = b;
		}
		if (max < c) { 
			max = c;
		}
		System.out.println("가장 큰 수는 " + max + "입니다");
	}
}
