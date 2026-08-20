package start;
import java.util.Scanner;
public class DoWhile01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int input;
		do {
			System.out.println("숫자를 입력하세요 : ");
			input = sc.nextInt();
			sum += input;
		} while (input != 0);
		System.out.println(sum);
		
		
	}
}
