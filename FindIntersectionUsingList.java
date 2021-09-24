package week3.day2.assignments;

import java.util.ArrayList;
import java.util.List;

public class FindIntersectionUsingList {

	public static void main(String[] args) {
		int arr[] = { 3, 2, 11, 4, 6, 7 };
		int arr1[] = { 1, 2, 8, 4, 9, 7 };
		List<Integer> arrList = new ArrayList<Integer>();
		List<Integer> arrList1 = new ArrayList<Integer>();

		for (int i = 0; i < arr.length; i++)
			arrList.add(arr[i]);

		for (int i = 0; i < arr1.length; i++)
			arrList1.add(arr1[i]);

		System.out.println("The first array list: " + arrList);
		System.out.println("The second array list: " + arrList1);

		arrList.retainAll(arrList1);
		System.out.println("The intersection list: " + arrList);

	}

}
