package start;
import java.util.Arrays;
public class practice {
	public static void main(String[] args) {
		int[] arr = {1, 4, 6, 8, 3, 56};
		int sum = getSum(arr);
		int max = getMax(arr);
		int count = getCount(arr, 2);
		swapArray(arr);
		System.out.println("" + sum + max + count);
		System.out.println(Arrays.toString(arr));
	}
	static int getSum(int[] arr) {
		int sum = 0;
		for (int data : arr) {
			sum += data;
		}
		return sum;
	}
	static int getMax(int[] arr) {
		int max = arr[0];
		for (int data : arr) {
			if (max < data) {
				max = data;
			}
		}
		return max;
	}
	static int getCount(int[] arr, int num) {
		int count = 0;
		for (int data : arr) {
			if (num < data) {
				count += 1;
			}
		}
		return count;
	}
	static void swapArray(int[] arr) {
		int temp;
		for (int i = 0; i < (arr.length / 2); i++) {
			temp = arr[i];
			arr[i] = arr[arr.length-i-1];
			arr[arr.length-i-1] = temp;
		}
	}
}
