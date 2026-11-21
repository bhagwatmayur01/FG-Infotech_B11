package ParellelArraySorting;

import java.util.Arrays;
import java.util.Collections;

public class DesendingArray {

	public static void main(String[] args) {
		
        Integer arr[]= {2,1,4,3,5};
		
        System.out.println("After sorting the array elements: ");
		
		Arrays.sort(arr,Collections.reverseOrder());
		
		for(int i:arr) {
			System.out.println(i);
		}

	}

}
