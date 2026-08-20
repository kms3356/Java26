package start;
import java.util.Scanner;
public class For05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		int sum = 0;
		do {
			System.out.println("양의 숫자를 입력하세요 : ");
			num = sc.nextInt();
		} while (num <= 0);
		
		for (int i = 1; i <= num; i++) {
			sum += i;
		}
		System.out.printf("1부터 %d까지의 합은 %d입니다.", num, sum);
	}
}
