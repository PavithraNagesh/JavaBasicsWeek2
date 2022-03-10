package week3.day1;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		// Here is the input
				int[] arr = {1,2,4,3,7,6,8};
				int length = arr.length;
				System.out.println(length);

				int n = arr.length+1;
				int sum = n*(n+1)/2;
				for (int i = 0; i < arr.length; i++) {
					sum= sum - arr[i];
				}
				System.out.println("missing no is :"+sum);
					}

	}		
				