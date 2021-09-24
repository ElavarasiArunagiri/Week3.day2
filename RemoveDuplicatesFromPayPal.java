package week3.day2.assignments;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesFromPayPal {

	public static void main(String[] args) {
		String str = "PayPal";
		char[] arr = str.toCharArray();
		Set<Character> charSet = new HashSet<Character>();
		Set<Character> dupCharSet = new HashSet<Character>();

		for (int i = 0; i < arr.length; i++) {
			boolean add = charSet.add(arr[i]);
			if (!add) {
				dupCharSet.add(arr[i]);
			}
		}

		System.out.println("Printing the characters of \"PayPal\" added to Set: " + charSet);

		System.out.println("Printing the characters that where not added to Set: " + dupCharSet);

		charSet.removeAll(dupCharSet);
		System.out.println("The Character set after removing the duplicated elements completely:" + charSet);

	}
}
