package streamAPI;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Sorting {

	public static void main(String[] args) {
		
		//Ctrl+Shift+O

		List<Integer>list=Arrays.asList(1,2,2,12,22,4,5,3);
		List<Integer>sort=list.stream().sorted().distinct().collect(Collectors.toList());
		System.out.println("Ascending"+ sort);
		
		List<Integer>sort1=list.stream().sorted(Collections.reverseOrder()).distinct().collect(Collectors.toList());
		System.out.println("Descending"+ sort1);
	}

}
