package start;
import java.util.Scanner;
public class For04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int answer = 1;
		int num = sc.nextInt();
		for (int i = 2; i <= num; i++) {
			answer *= i;
		}
		System.out.printf("%d! = %d", num, answer);
	}
}