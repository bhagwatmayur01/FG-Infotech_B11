package forEachLoop;

import java.util.*;

public class Demo1 {

	public static void main(String[] args) {
		
		List<String>list=new ArrayList<String>();
		list.add("Nitin");
		list.add("Mayur");
		list.add("Ganesh");
		
		//normal core java for loop.
		System.out.println("Printing the elements using normal core java for loop.");
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
		
		//normal core java for eachloop.
		System.out.println("Printing the elements using normal core java for each loop.");
		for(String x:list)
		{
			System.out.println(x);
		}
		
		//Lambda Expression
		System.out.println("Printing the elements using forEach method with Lambda Expression.");
		list.forEach((name)->System.out.println(name));
		
		//method reference
		System.out.println("Printing the elements using forEach method with method reference.");
		list.forEach(System.out::println);

	}

}
