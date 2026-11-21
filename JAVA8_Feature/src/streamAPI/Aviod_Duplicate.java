package streamAPI;

import java.util.*;
import java.util.stream.Collectors;

public class Aviod_Duplicate {

	public static void main(String[] args) {
		List<Integer>list=Arrays.asList(1,2,2,4,5,3);
		List<Integer>listNew=list.stream().distinct().collect(Collectors.toList());
        System.out.println(listNew);
	}

}
