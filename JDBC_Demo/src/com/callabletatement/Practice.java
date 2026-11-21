package com.callabletatement;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class Practice {

	public static void main(String[] args) {
		
		List<Integer> list =Arrays.asList(3,2,1,4);
		
		List<Integer> list1 =list.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
           System.out.println(list1);
			
		
	}

}
