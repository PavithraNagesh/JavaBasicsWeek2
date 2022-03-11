package week3.day1;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 7, 6, 8 };
		System.out.println(arr.length);
		Arrays.sort(arr);
		System.out.println(arr);
		for (int i = arr[0]; i < arr.length; i++) {
			if (i != arr[i - 1]) {
				System.out.println(i);
				break;
			}
		}
	}
}
