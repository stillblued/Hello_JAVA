package com.yedam.java.homework;

public class Employee {

	protected String name; // 이름
	protected int aSalary; // 연봉

	public Employee() {

	}

	public Employee(String name, int aSalary) {
		super();
		this.name = name;
		this.aSalary = aSalary;
	}

	public void getInformation() {
		System.out.println("이름 : " + this.name + " 연봉 : " + this.aSalary);
	}

	public void print() {
		System.out.println("수퍼클래스");
	}

}
