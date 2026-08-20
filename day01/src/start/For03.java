package start;
import java.util.Scanner;
public class For03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요 : ");
		int dan = sc.nextInt();
		System.out.printf("[ 구구단 %d단]\n", dan);
		for (int i = 1; i < 10; i++) {
			System.out.printf("%d x %d = %d\n", dan, i, dan*i);
		}
	}
}
