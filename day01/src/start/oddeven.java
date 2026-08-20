package start;

import java.util.Scanner;
public class oddeven {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int input = sc.nextInt();
		String answer = ((input & 1) == 1) ? "홀수" : "짝수";
		System.out.println(answer);
			
	}
}
