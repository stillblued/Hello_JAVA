package com.yedam.java.homework1;

public class Human {

	protected String name;
	protected int height;
	protected int weight;

	public Human(String name, int height, int weight) {
		super();
		this.name = name;
		this.height = height;
		this.weight = weight;
	}

	public void getInformation() {
		System.out.printf("이름 : %s 키 : %d 몸무게 : %d\n", this.name, this.height, this.weight);
	}

}
