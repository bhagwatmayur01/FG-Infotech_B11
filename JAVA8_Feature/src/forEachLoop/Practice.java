package forEachLoop;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//List<String> list=Arrays.asList("Mayur","Vishal","Ganesh");
		
		//list.forEach(n->System.out.println(n));
		//list.forEach(System.out::println);
		
		List<Integer> list=Arrays.asList(2,3,3,1,4,6,5);
		
		Collections.sort(list);  //Collections-->sort-->list
		System.out.println("Sort : "+list);
		
		list.sort(Collections.reverseOrder()); //list-->sort-->Collections
		System.out.println("Reverse Order : "+list);
		
		List<Integer> duplicate=list.stream().distinct().collect(Collectors.toList());
	    System.out.println("Avoid duplicate : "+duplicate);
	    
	    List<Integer> limitSkip=list.stream().skip(3).collect(Collectors.toList()); //first n elements
		System.out.println("LimitSkip : "+limitSkip);
		   
	   List<Integer> EvenOdd=list.stream().filter(n->n%2!=0).distinct().collect(Collectors.toList());
	   System.out.println("EvenOdd : "+EvenOdd);
	   
	   List<Integer> startWith=list.stream().filter(e->String.valueOf(e).startsWith("3")).collect(Collectors.toList());
	   System.out.println("StartWith : "+startWith);
	   
	   int sum=list.stream().distinct().reduce((a,b)->a+b).get();
	   System.out.println("Sum : "+sum);
	   
	   int max=list.stream().max(Comparator.comparing(Integer::valueOf)).get();
	   System.out.println("Max : "+max);
	   
	   
	
	   
	}

}
