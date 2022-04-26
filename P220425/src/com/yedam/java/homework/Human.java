package com.yedam.java.homework;

public class Human {

	protected String name;
	protected int height;
	protected int weight;

	public Human() {

	}

	public Human(String name, int height, int weight) {
		super();
		this.name = name;
		this.height = height;
		this.weight = weight;
	}

	public void getInformation() {
		System.out.println("이름 : " + this.name + " | 키 : " + this.height + " | 체충 : " + this.weight);
	}

}