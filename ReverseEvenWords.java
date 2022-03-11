package week3.day2;

public class ReverseEvenWords {

	public static void main(String[] args) {
		// Build a logic to reverse the even position words (output: I ma a erawtfos tester)
		String test = "I am a software tester";
		System.out.println(test);
		String[] split = test.split(" ");
		String rev = "";
		for (int i = 0; i < split.length; i++) {
			if (i % 2 != 0) {
				String val = "";
				char[] evenArray = split[i].toCharArray();
				for (int j = evenArray.length - 1; j >= 0; j--) {
					val = val + evenArray[j];
				}
				rev = rev + " " + val;
			} else {
				rev = rev + " " + split[i];
			}
		}
		System.out.println(rev);
	}

}
