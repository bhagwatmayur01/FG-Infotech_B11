package streamAPI;

import java.util.stream.Collectors;
import java.util.*;

public class Even_Odd_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer>list=Arrays.asList(1,2,2,4,5,3);
		List<Integer>Evennumber=list.stream().filter(nos->nos%2==0).collect(Collectors.toList());
		System.out.println(Evennumber);
		
		List<Integer>Oddnumbers=list.stream().filter(nos->nos%2!=0).distinct().collect(Collectors.toList());
		System.out.println(Oddnumbers);
	}

}
