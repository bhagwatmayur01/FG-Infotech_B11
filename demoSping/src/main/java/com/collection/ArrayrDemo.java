package com.collection;

public class ArrayrDemo {

	public static void main(String[] args) {
		
		int arr[]=new int[3];
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
		
		for(int a:arr) {
			System.out.println(a);
		}
		System.out.println(arr.length);

	}

}
