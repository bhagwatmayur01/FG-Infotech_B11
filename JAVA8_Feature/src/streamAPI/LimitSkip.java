package streamAPI;

import java.util.*;
import java.util.List;
import java.util.stream.Collectors;

public class LimitSkip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer>list=Arrays.asList(1,2,2,12,22,4,5,3);
		List<Integer>lisNew=list.stream().limit(3).collect(Collectors.toList());
		System.out.println(lisNew);		
	   
		List<Integer>lisNew1=list.stream().skip(4).collect(Collectors.toList());
		System.out.println(lisNew1);	
	}

}
