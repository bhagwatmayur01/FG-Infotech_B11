package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StartWith {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer>list=Arrays.asList(1,2,2,12,22,4,5,3);
		List<Integer>starwith2=list.stream().filter(e->String.valueOf(e).startsWith("2")).collect(Collectors.toList());
		System.out.println(starwith2);
	}

}
