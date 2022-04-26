package com.yedam.java.homework;

public class Employee {

	private String name; // 이름
	private int aSalary; // 연봉

	
	
	public Employee() {

	}
	public Employee(String name, int aSalary) {
		super();
		this.name = name;
		this.aSalary = aSalary;
	}

	
	
	public String getName() {
		return name;
	}

	public int getaSalary() {
		return aSalary;
	}


	public void getInformation() {
		System.out.println("이름 : " + getName() + "연봉 : " + getaSalary());
	}
	
	public void print() {
		System.out.println("수퍼클래스");
	}

}
