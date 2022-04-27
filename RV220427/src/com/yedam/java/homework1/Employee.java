package com.yedam.java.homework1;

public class Employee {

	protected String name;
	protected int salary;

	public Employee(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	public void getInformation() {
		System.out.printf("이름 : %s 연봉 : %d/n", this.name, this.salary);
	}

	public void print() {
		System.out.println("수퍼클래스/n");
	}

}
