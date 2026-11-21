package ParellelArraySorting;

import java.util.Arrays;

public class Demo2 {

	public static void main(String[] args) {
		
		int arr[]= {2,1,4,3,5};
		
        System.out.println("After sorting the array elements: ");
		
		Arrays.parallelSort(arr,0,2);   //1,2->435
		
		for(int i:arr) {
			System.out.println(i);
		}

	}

}
