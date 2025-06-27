package assignment;
import java.util.Iterator;

public class Assignment18StringOperations {

	public static boolean isPalindrome(String str) {
		// StringBuilder ==> StringBuilder is mutable class ==> Non-synchronized
		String reversedStr = new StringBuilder(str).reverse().toString();
		//System.out.println(reversedStr);
		return str.equalsIgnoreCase(reversedStr);

	}

	public static void main(String[] args) {
		// Initialize a String
		String S1 = "A man, a plan, a canal: Panama";

		// Remove all alphabets from the String ==> String.replaceAll(regExp,newChar);
		// converting uppercase letters into lowercase letters from the String ==>
		// String.toLowerCase();
		String s1 = S1.replaceAll("[^a-zA-Z]", "").toLowerCase();
		// Reverse String after removing the all

		// Remove all alphabets from the String ==> String.replaceAll(regExp,newChar);
		// converting uppercase letters into lowercase letters from the String ==>
		// String.toLowerCase();
		String S2 = "race a car";
		String s2 = S2.replaceAll("[^a-zA-Z]", "").toLowerCase();
		//
		System.out.println(s1 + " is a palindrome: " + isPalindrome(s1));
		System.out.println(s2 + " is a palindrome: " + isPalindrome(s2));

		System.out.println("**********************Used for loop using with lowercase string length and compared*******************");

		String[] array = { s1, s2 };
		String value = "";
		for (int a = 0; a < array.length; a++) {
			value = array[a];
			System.out.println(value);
			String reverseSentence = "";
			for (int i = value.length() - 1; i >= 0; i--) {
				reverseSentence = reverseSentence + value.charAt(i);

			}
			// System.out.println("Reverse Sentence is: " + reverseSentence);

			if (value.equals(reverseSentence)) {
				System.out.println(value + " is a palindrome: " + reverseSentence);
			} else {
				System.out.println(value + " is a not palindrome: " + reverseSentence);
			}

		}

		System.out.println(
				"************************while & For & Array statement used for palindrome*****************************");

		for (int k = 0; k < array.length; k++) {
			String values = array[k];
			int i = 0;
			int j = values.length() - 1;
			boolean falg = false;
			while (i <= j) {
				if (values.charAt(i) != values.charAt(j)) {
					falg = true;
					break;
				}
				i++;
				j--;

			}
			String s = falg ? array[k] + " is  a not  palindrome: " + values : array[k] + " is  palindrome: " + values;
			System.out.println(s);

		}

	}

}
