package week3.day2.assignments;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class PrintDuplicatesInIntegerArrayUsingCollections {

	public static void main(String[] args) {
		int[] arr = { 14, 12, 13, 11, 15, 14, 18, 16, 17, 19, 18, 17, 20 };
		Arrays.sort(arr);
		// converting to string array to print.
		String strarr = Arrays.toString(arr);
		System.out.println("Given List sorted:\n" + strarr);

		// converting to set to find the duplicates.
		Set<Integer> arrSet = new LinkedHashSet<>();
		Set<Integer> dupSet = new LinkedHashSet<>();
		for (int i = 0; i < arr.length; i++) {
			Boolean add = arrSet.add(arr[i]);
			if (!add)
				dupSet.add(arr[i]);
		}
		System.out.println("The duplicates in the given list:\n" + dupSet);

	}

}
