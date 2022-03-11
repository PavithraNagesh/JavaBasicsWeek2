package week3.day2;

public class CharOccurance {

	public static void main(String[] args) {
		String str = "welcome to chennai";
		int count = 0;
		char[] charArray = str.toCharArray();
		int length = charArray.length;
		System.out.println("Length of Array is "+length);
		for (int i = 0; i < length; i++) {
			if ('e' == charArray[i]) {
				count++;
			}
		}
		System.out.println(count);
	}
}
