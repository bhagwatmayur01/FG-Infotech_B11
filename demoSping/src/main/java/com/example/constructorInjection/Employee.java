package com.example.constructorInjection;

import com.example.constructorInjection.Address;

public class Employee {

	private int id;
	private String name;
	private Address address;
	
	public Employee() {
		System.out.println("def cons");
	}
	public Employee(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address; //Aggregation
	}
	
	void show() {
		System.out.println("user name :" +id+" "+name);
		System.out.println("Adress :" +address.toString());
	}
	
	
}
