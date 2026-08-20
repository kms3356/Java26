package start;
import java.util.Scanner;
public class circle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("원의 반지름을 입력하세요(cm): ");
		float radius = sc.nextFloat();
		System.out.printf("원의 넓이는 %.2f", radius * radius * 3.14);
	}
}
