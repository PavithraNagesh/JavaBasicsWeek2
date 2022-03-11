package week3.day2;

public class Palindrome {

	public static void main(String[] args) {
	     String value = "madam";
	     String rev = "";
	     for (int i = value.length()-1; i >= 0; i--) {
		    rev = rev + value.charAt(i);
		     if(value.equals(rev)) {
		    	 System.out.println(value +" is a Palindrome ");
		     }
		     }
		}
	}

