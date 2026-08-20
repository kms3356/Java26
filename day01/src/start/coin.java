package start;

import java.util.Scanner;

public class coin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("금액 : ");
		int money = sc.nextInt();
		int obag = money / 500;
		int bag = money % 500 / 100;
		System.out.println("동전의수 > ");
		System.out.printf("500원짜리 = %d개\n", obag);
		System.out.printf("100원짜리 = %d개\n", bag);
	}
}
