package com.collection;

import java.util.*;

public class StackVector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack<String> s=new Stack();
		s.push("A");
		s.push("B");
		s.push("C");
		
		System.out.println("Stack Data is a: " + s);
		System.out.println("I am using pop() method : " + s.pop());
		System.out.println("After Using Pop method : " + s);
		
	}

}
