package com.example.demoSpring.fg;

public class Employee {

	private int id;
	private String name;
	
	public Employee() {
		System.out.println("def cons");
	}

	public Employee(int id) {
		super();
		this.id = id;
	}

	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	
	public void show() {
		System.out.println(id+" "+name);
		
	}
	
	
	
}
