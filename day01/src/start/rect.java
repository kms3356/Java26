package start;

import java.util.Scanner;

public class rect {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("직사각형의 가로 길이 : ");
		float a = sc.nextFloat();
		System.out.print("직사각형의 세로 길이 : ");
		float b = sc.nextFloat();
		System.out.printf("직사각형의 넓이는 %.1f입니다.",  a*b);
	}
}