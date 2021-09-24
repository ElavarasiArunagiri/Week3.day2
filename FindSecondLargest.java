package week3.day2.assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindSecondLargest {

	public static void main(String[] args) {
		int[] data = { 3, 2, 11, 4, 6, 7 };
		List<Integer> dataList = new ArrayList<Integer>();
		// dataList.addAll(Arrays.asList(data));

		for (int i = 0; i < data.length; i++)
			dataList.add(data[i]);

		System.out.println("The given array: " + dataList);

		Collections.sort(dataList);
		System.out.println("The sorted array: " + dataList);

		int size = dataList.size();
		System.out.println("The second largest value in the list is: " + dataList.get(size - 2));
	}

}
