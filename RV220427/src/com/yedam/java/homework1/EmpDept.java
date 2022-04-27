package com.yedam.java.homework1;

public class EmpDept extends Employee {

	private String depart;

	public EmpDept(String name, int salary, String depart) {
		super(name, salary);
		this.depart = depart;
	}

	@Override
	public void getInformation() {
		System.out.printf("이름 : %s 연봉 : %d 부서 : %s\n", this.name, this.salary, this.depart);
	}

	@Override
	public void print() {
		System.out.printf("수퍼클래스\n서브클래스\n");
	}
}
