package start;
import java.util.Scanner;
public class For06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int i = 2; i < 10; i++) {
			System.out.printf("[ 구구단 %d단 ]\n", i);
			for (int j = 1; j < 10; j++) {
				System.out.printf("%d x %d = %d\n", i, j, i*j);
			}
		}
	}
}
