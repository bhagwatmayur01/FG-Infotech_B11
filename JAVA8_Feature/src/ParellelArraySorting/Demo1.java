package ParellelArraySorting;

import java.util.Arrays;

public class Demo1 {

	public static void main(String[] args) {

		int arr[] = { 2, 1, 4, 3, 5 };

		System.out.println("Before sorting the array elements: ");

		for (int x : arr) {
			System.out.println(x);
		}

		System.out.println("After sorting the array elements: ");

		Arrays.parallelSort(arr);

		for (int i : arr) {
			System.out.println(i);
		}

	}

}
