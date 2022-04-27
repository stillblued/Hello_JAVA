package com.yedam.java.homework;

public class EmpDept extends Employee {

	private String dept;

	public EmpDept() {

	}

	public EmpDept(String name, int aSalary, String dept) {
		super(name, aSalary);
		this.dept = dept;

	}

	@Override
	public void getInformation() {
		System.out.println("이름 : " + this.name + " 연봉 : " + this.aSalary + " 부서 : " + this.dept);
	}

	public void print() {
		System.out.println("수퍼클래스\n서브클래스");
	}

}