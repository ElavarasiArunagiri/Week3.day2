package week3.day2.assignments;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesFromSentence {

	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1";
		String[] arr = text.split(" ");
		Set<String> arrSet = new LinkedHashSet<String>();
		System.out.println("The given String:");
		System.out.println(text);
		System.out.println("");

		for (int i = 0; i < arr.length; i++)
			arrSet.add(arr[i]);

		System.out.println("The String without duplicates:");
		for (String string : arrSet) 
			System.out.print(string + " ");
		
	}

}
