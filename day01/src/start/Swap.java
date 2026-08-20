package start;

import java.util.Scanner;

public class Swap {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("변수 a에 넣을 숫자 입력 : ");
		int a = sc.nextInt();
		System.out.print("변수 b에 넣을 숫자 입력 : ");
		int b = sc.nextInt();
		int temp;
		temp = a;
		a = b;
		b = temp;
		System.out.println("Swapping 결과>");
		System.out.printf("변수 a의 값 = %d\n", a);
		System.out.printf("변수 b의 값 = %d", b);
		sc.close();
	}
}
