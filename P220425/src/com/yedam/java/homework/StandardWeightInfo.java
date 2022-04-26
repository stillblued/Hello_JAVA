package com.yedam.java.homework;

public class StandardWeightInfo extends Human {

	public StandardWeightInfo() {

	}

	public StandardWeightInfo(String name, int height, int weight) {
		super(name, height, weight);
	}

	@Override
	public void getInformation() {
		System.out.println("이름 : " + name + " | 키 : " + height + " | 체중 : " + weight + " | 표준 체중 : "
				+ getStandardWeight() + "입니다.");
	}

	public double getStandardWeight() {
		return (double) ((height - 100) * 0.9);
	}

}