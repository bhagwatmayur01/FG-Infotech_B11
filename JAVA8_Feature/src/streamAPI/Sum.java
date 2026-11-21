package streamAPI;

import java.util.*;

public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		List<Integer>list=Arrays.asList(1,2,2,4,5,3);
		int sum=list.stream().reduce((a,b)->a+b).get();
		System.out.println(sum);
		
		
		int sumDistinct=list.stream().distinct().reduce((a,b)->a+b).get();
		System.out.println(sumDistinct);
	}

}
