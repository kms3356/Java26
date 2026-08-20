package start;
import java.util.Scanner;
import java.util.Arrays;
public class Array02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("학생 수: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println(n + "명의 성적 : ");
		
		for (int i = 0; i < n; i++) {
		    arr[i] = sc.nextInt();
		}
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		double average = sum / arr.length;
		System.out.println(">> 합계 : " + sum);
		System.out.println(">> 평균 : " + average);
	}
}
