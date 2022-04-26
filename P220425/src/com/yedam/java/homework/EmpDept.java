package com.yedam.java.homework;

public class EmpDept extends Employee {

	private String dept;

	public EmpDept() {

	}

	public EmpDept(String name, int aSalary, String dept) {
		super(name, aSalary);
		this.dept = dept;

	}

	public String getDept() {
		return dept;
	}

	@Override
	public void getInformation() {
		System.out.println("이름 : " + getName() + " | 연봉 : " + getaSalary() + " | 부서 : " + getDept());
	}

	public void print() {
		System.out.println("수퍼클래스\n서브클래스");
	}

}