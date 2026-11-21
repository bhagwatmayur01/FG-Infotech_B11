package com.fg.Student;

public class AddStudent {

	private int id;
	private String name;
	private String city;
	private String qualification;
	private int age;
	
	public AddStudent() {
		super();
	}

	public AddStudent(int id, String name, String city, String qualification, int age) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.qualification = qualification;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	
}
