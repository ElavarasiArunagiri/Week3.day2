package week3.day2.assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingElementByList {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 7, 6, 8 };
		// int[] arr = {26,27,28,30,31,32,33};
		List<Integer> arrList = new ArrayList<>();
		for (int i = 0; i < arr.length; i++)
			arrList.add(arr[i]);

		System.out.println("The given list: " + arrList);

		Collections.sort(arrList);
		System.out.println("The sorted List: " + arrList);

		int size = arrList.size();
		for (int i = arrList.get(0); i < arrList.get(size - 1); i++)
			if (!arrList.contains(i)) {
				System.out.println("The missing element: " + i);
				break;
			}
	}

}
