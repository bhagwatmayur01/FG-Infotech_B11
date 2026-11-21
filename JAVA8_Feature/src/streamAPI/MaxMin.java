package streamAPI;

import java.util.*;

public class MaxMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer>list=Arrays.asList(1,2,2,12,22,4,5,3);
		int max=list.stream().max(Comparator.comparing(Integer::valueOf)).get();
		System.out.println(max);
		
		int min=list.stream().min(Comparator.comparing(Integer::valueOf)).get();
		System.out.println(min);
	}

}
