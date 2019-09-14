package com.bayareala8s.datastructuresalgorithms;
public class Customer {
	private int age;
	private String firstName;
	private String lastName;
	
	public Customer(int age, String firstName, String lastName) {
		this.age = age;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setfirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getLastName() {
		return lastName;
	}

}
	
